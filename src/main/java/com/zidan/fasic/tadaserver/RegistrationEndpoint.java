package com.zidan.fasic.tadaserver;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import search.microsoft.Query;
import search.microsoft.QueryResponse;
import search.microsoft.Registration;
import search.microsoft.RegistrationResponse;

import javax.jws.WebMethod;

@Endpoint
public class RegistrationEndpoint {

    @PayloadRoot(namespace = "urn:Microsoft.Search", localPart = "Registration")
    @ResponsePayload
    @WebMethod(action = "urn:Microsoft.Search/Registration")
    public RegistrationResponse processRegistrationRequest(@RequestPayload Registration request) {
        RegistrationResponse response = new RegistrationResponse();

        response.setRegistrationResult("registration success");

        return response;
    }

}
