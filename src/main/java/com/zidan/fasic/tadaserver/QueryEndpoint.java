package com.zidan.fasic.tadaserver;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import search.microsoft.Query;
import search.microsoft.QueryResponse;

@Endpoint
public class QueryEndpoint {

    @PayloadRoot(namespace = "urn:Microsoft.Search", localPart = "Query")
    @ResponsePayload
    public QueryResponse processQueryRequest(@RequestPayload Query request) {
        String queryXml = request.getQueryXml();
        QueryResponse response = new QueryResponse();
        String s = "<ResponsePacket revision=\"1\" xmlns=\"urn:Microsoft.Search.Response\">" +
                "<Response domain=\"{302E491F-6221-4977-B179-F33F6678BC44}\">" +
                "<QueryID>" +
                "             {690EF6D8-575D-4897-8F30-293E175C1B99}" +
                "            </QueryID>" +
                "<Range>" +
                "<Results>" +
                "<Content xmlns=" +
                "                         \"urn:Microsoft.Search.Response.Content\">" +
                "<Heading>" +
                "<Text>Elizabeth Lincoln</Text>" +
                "<P>23 Tsawassen Blvd.</P>" +
                "<P>Tsawassen</P>" +
                "</Heading>" +
                "<Heading>" +
                "<Text>Elizabeth Brown</Text>" +
                "<P>Berkeley Gardens" +
                "12 Brewery </P>" +
                "<P>London</P>" +
                "</Heading>" +
                "<HorizontalRule />" +
                "<NewQuery query=\"Search by country\">" +
                "<Text>" +
                "Search by country..." +
                "</Text>" +
                "</NewQuery>" +
                "</Content>" +
                "</Results>" +
                "</Range>" +
                "<Status>SUCCESS</Status>" +
                "</Response>" +
                "</ResponsePacket>";
        response.setQueryResult(s);
        return response;
    }

}
