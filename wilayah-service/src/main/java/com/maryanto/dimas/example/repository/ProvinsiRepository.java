package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.entity.Provinsi;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProvinsiRepository extends PagingAndSortingRepository<Provinsi, Long> {

    List<Provinsi> findAll();
}
