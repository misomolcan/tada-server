package com.zidan.fasic.tadaserver;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import search.microsoft.Registration;
import search.microsoft.RegistrationResponse;

import javax.xml.bind.Element;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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
                "      <QueryPath>http://192.168.20.170:8080/ws/research.wsdl/" +
                "        Registration</QueryPath>" +
                "      <RegistrationPath>>http://192.168.20.170:8080/ws/research.wsdl/" +
                "        Registration</RegistrationPath>" +
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

}
