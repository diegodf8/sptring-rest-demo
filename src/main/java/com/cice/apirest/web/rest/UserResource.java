package com.cice.apirest.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Saludo")
public class UserResource {

    @GetMapping
    public String getSaludo(){
        return"Hola Spring";
    }

}
