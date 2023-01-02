package com.example.ocpdepltest.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class Controller {



    @GetMapping(path = "/")
    public ResponseEntity<String> getAddressesByCountry(){
        return  ResponseEntity.ok("API WORKS FINE!");
    }
}
