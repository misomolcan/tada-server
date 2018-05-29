package com.zidan.fasic.tadaserver;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import search.microsoft.*;

@Endpoint
public class QueryEndpoint {

    @PayloadRoot(namespace = "urn:Microsoft.Search", localPart = "Query")
    @ResponsePayload
    public QueryResponse processQueryRequest(@RequestPayload Query request) {
        QueryResponse response = new QueryResponse();

        response.setQueryResult("hooola mother fucker");

        return response;
    }

}
