package com.maryanto.dimas.example.controllers;

import com.maryanto.dimas.example.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RefreshScope
@RestController
@RequestMapping("/api")
public class ConfigurationApi {

    @Autowired
    private Request request;

    @GetMapping("/configuration")
    public ResponseEntity getConfiguration() {
        return ok().body(request);
    }
}
