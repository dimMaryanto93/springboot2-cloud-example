package com.maryanto.dimas.example.api;

import com.maryanto.dimas.example.dto.Provinsi;
import com.maryanto.dimas.example.entity.Nasabah;
import com.maryanto.dimas.example.repository.WilayahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class NasabahController {

    @Autowired
    private WilayahRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<?> getNasabah(@PathVariable("id") Long id) {
        ResponseEntity<Provinsi> responseProvinsi = repository.provinsiById(32l);

        if (responseProvinsi.getStatusCode() == NO_CONTENT)
            return noContent().build();

        Provinsi provinsi = responseProvinsi.getBody();
        return ok().body(new Nasabah(id, "Dimas Maryanto", provinsi));
    }
}
