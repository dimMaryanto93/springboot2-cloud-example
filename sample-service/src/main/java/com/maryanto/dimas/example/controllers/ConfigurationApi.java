package com.maryanto.dimas.example.controllers;

import com.maryanto.dimas.example.models.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api")
public class ConfigurationApi {

    @Autowired
    private Configuration configuration;

    @GetMapping("/configuration")
    public ResponseEntity getConfiguration() {
        return ok(configuration);
    }
}
