package com.springservice.clientTwo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springservice.clientTwo.utils.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

@RestController
@RequestMapping(value="/clientTwo/ControllerOne")
public class simpleControllerOne {

    @Autowired
    private Environment env;

    @RequestMapping(
            value="/EndpointOne",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointOne() {

        //Add a small delay in response
        utils.addDelay(3);

        return ResponseEntity
        .ok()
        .body("This is hello endpoint one from controller one in client" +
                " Two on port : " + (env.getProperty("local.server.port")));
    }

    @RequestMapping(
            value="/EndpointTwo",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointTwo() {

        //Add a small delay in response
        utils.addDelay(3);

        return ResponseEntity
        .ok()
        .body("This is hello endpoint two from controller one in client" +
                " Two on port : " + (env.getProperty("local.server.port")));
    }
}