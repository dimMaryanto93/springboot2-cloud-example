package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.dto.Provinsi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "wilayah-service", url = "localhost:7000/wilayah-indonesia/")
public interface WilayahRepository {

    @GetMapping("/provinsi/{id}")
    public ResponseEntity<Provinsi> provinsiById(@PathVariable("id") Long provinsiId);
}
