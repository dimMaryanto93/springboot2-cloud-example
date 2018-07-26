package com.maryanto.dimas.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NasabahServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NasabahServiceApplication.class, args);
    }
}
