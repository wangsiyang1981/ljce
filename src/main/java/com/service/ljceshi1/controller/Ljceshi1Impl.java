package com.service.ljceshi1.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-04-09T07:18:51.752Z")

@RestSchema(schemaId = "ljceshi1")
@RequestMapping(path = "/ljceshi1", produces = MediaType.APPLICATION_JSON)
public class Ljceshi1Impl {

    @Autowired
    private Ljceshi1Delegate userLjceshi1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLjceshi1Delegate.helloworld(name);
    }

}
