package com.zidan.fasic.tadaserver;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import search.microsoft.Registration;
import search.microsoft.RegistrationResponse;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

@Endpoint
public class RegistrationEndpoint {




    @PayloadRoot(namespace = "urn:Microsoft.Search", localPart = "Registration")
    @ResponsePayload
    public RegistrationResponse processRegistration(@RequestPayload Registration request) {

        RegistrationResponse response = new RegistrationResponse();


        String s = "<ProviderUpdate xmlns=\"urn:Microsoft.Search.Registration.Response\">" +
                "  <Status>SUCCESS</Status>" +
                "  <Providers>" +
                "    <Provider>" +
                "      <Message>All Your Base Are Belong To Us</Message>" +
                "      <Id>{C37EE888-D74E-47e5-B113-BA613D87F0B2}</Id>" +
                "      <Name>CLASSIC FASIC</Name>" +
                "      <QueryPath>http://" + getMyIp() + ":8080/ws/research.wsdl/" + "</QueryPath>" +
                "      <RegistrationPath>>http://" + getMyIp() + ":8080/ws/research.wsdl/" + "</RegistrationPath>" +
                "      <Type>SOAP</Type>" +
                "      <Services>" +
                "        <Service>" +
                "          <Id>{8DD063CA-94FC-4514-8D83-3B36B12432BE}</Id>" +
                "          <Name>FASIC rules you morons</Name>" +
                "          <Description>TADA service, that will make your days happier </Description>" +
                "          <Copyright>(C) 2018</Copyright>" +
                "          <Display>On</Display>" +
                "          <Category>RESEARCH_GENERAL</Category>" +
                "        </Service>" +
                "      </Services>" +
                "    </Provider>" +
                "  </Providers>" +
                "</ProviderUpdate>";
        response.setRegistrationResult(s);


        return response;
    }

    private String getMyIp() {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                for (InterfaceAddress interfaceAddress : intf.getInterfaceAddresses()) {
                    if (interfaceAddress != null && interfaceAddress.toString().contains("192.168."))
                        return interfaceAddress.getAddress().getHostAddress();
                }


            }
        } catch (SocketException e) {
            e.printStackTrace();
        }

        System.out.println("Returning default IP address");
        return "192.168.20.170";
    }
}
