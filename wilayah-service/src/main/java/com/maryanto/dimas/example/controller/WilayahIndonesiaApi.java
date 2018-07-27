package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.entity.Kecamatan;
import com.maryanto.dimas.example.entity.Kelurahan;
import com.maryanto.dimas.example.entity.KotaKabupaten;
import com.maryanto.dimas.example.entity.Provinsi;
import com.maryanto.dimas.example.proxy.KecamatanRepository;
import com.maryanto.dimas.example.proxy.KelurahanRepository;
import com.maryanto.dimas.example.proxy.KotaKabupatenRepository;
import com.maryanto.dimas.example.proxy.ProvinsiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@RestController
public class WilayahIndonesiaApi {

    @Autowired
    private ProvinsiRepository provinsiRepository;
    @Autowired
    private KotaKabupatenRepository kotaRepository;
    @Autowired
    private KecamatanRepository kecamatanRepository;
    @Autowired
    private KelurahanRepository kelurahanRepository;

    @GetMapping({"/provinsi", "/provinsi/list"})
    public ResponseEntity<?> provinsiAll() {
        List<Provinsi> list = provinsiRepository.findAll();
        if (list.isEmpty()) return noContent().build();

        return ok(list);
    }

    @GetMapping("/provinsi/{id}")
    public ResponseEntity<?> provinsiById(@PathVariable("id") Long provinsiId) {
        Optional<Provinsi> provinsi = provinsiRepository.findById(provinsiId);
        if (!provinsi.isPresent()) return noContent().build();

        return ok(provinsi.get());
    }

    @GetMapping("/kota/{id}")
    public ResponseEntity<?> kotaByProvinsiId(@PathVariable("id") Long provinsiId) {
        Optional<KotaKabupaten> kota = kotaRepository.findById(provinsiId);
        if (!kota.isPresent()) return noContent().build();

        return ok(kota.get());
    }

    @GetMapping("/kota/{id}/list")
    public ResponseEntity<?> kotaAllByProvinsiId(@PathVariable("id") Long id) {
        List<KotaKabupaten> list = kotaRepository.findByProvinsiId(id);
        if (list.isEmpty()) return noContent().build();

        return ok(list);
    }

    @GetMapping("/kecamatan/{id}/list")
    public ResponseEntity<?> kecamatanByKotaId(@PathVariable("id") Long id) {
        List<Kecamatan> list = kecamatanRepository.findByKotaId(id);
        if (list.isEmpty()) return noContent().build();

        return ok(list);
    }

    @GetMapping("/kecamatan/{id}")
    public ResponseEntity<?> kecamatanById(@PathVariable("id") Long id) {
        Optional<Kecamatan> kecamatan = kecamatanRepository.findById(id);
        if (!kecamatan.isPresent()) return noContent().build();

        return ok(kecamatan.get());
    }

    @GetMapping("/kelurahan/{id}/list")
    public ResponseEntity<?> kelurahanByKecamatanId(@PathVariable("id") Long id) {
        List<Kelurahan> list = kelurahanRepository.findByKecamatanId(id);
        if (list.isEmpty()) return noContent().build();

        return ok(list);
    }

    @GetMapping("/kelurahan/{id}")
    public ResponseEntity<?> kelurahanById(@PathVariable("id") Long id) {
        Optional<Kelurahan> kelurahan = kelurahanRepository.findById(id);
        if (!kelurahan.isPresent()) return noContent().build();

        return ok(kelurahan.get());
    }
}
