package com.maryanto.dimas.example.api;

import com.maryanto.dimas.example.dto.Provinsi;
import com.maryanto.dimas.example.entity.Nasabah;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class NasabahController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getNasabah(@PathVariable("id") Long id) {
        RestTemplate api = new RestTemplate();
        Map<String, Object> params = new HashMap<>();
        params.put("provinsiId", 32);
        ResponseEntity<Provinsi> responseProvinsi = api.getForEntity(
                "http://localhost:7000/wilayah-indonesia/provinsi/{provinsiId}",
                Provinsi.class,
                params
        );

        if (responseProvinsi.getStatusCode() == NO_CONTENT)
            return noContent().build();

        Provinsi provinsi = responseProvinsi.getBody();
        return ok().body(new Nasabah(id, "Dimas Maryanto", provinsi));
    }
}
