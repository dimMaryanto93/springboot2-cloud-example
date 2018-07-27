package com.maryanto.dimas.example.proxy;

import com.maryanto.dimas.example.dto.Provinsi;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-gateway-zuul")
@RibbonClient(name = "wilayah-service")
public interface WilayahProxy {

    @GetMapping("/wilayah-service/provinsi/{id}")
    ResponseEntity<Provinsi> provinsiById(@PathVariable("id") Long provinsiId);
}
