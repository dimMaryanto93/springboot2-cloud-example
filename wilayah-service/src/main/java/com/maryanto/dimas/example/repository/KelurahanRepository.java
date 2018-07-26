package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.entity.Kelurahan;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface KelurahanRepository extends PagingAndSortingRepository<Kelurahan, Long> {


    List<Kelurahan> findByKecamatanId(Long id);
}
