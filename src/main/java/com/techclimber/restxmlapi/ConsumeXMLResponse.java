package com.techclimber.restxmlapi;


import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class ConsumeXMLResponse{
    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<EntityModel> get(String id){
        return restTemplate.getForEntity("http://localhost:8080/xml-output/get/{id}",
            EntityModel.class, id);
    }
}