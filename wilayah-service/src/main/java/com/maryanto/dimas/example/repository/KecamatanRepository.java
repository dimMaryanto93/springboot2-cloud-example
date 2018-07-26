package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.entity.Kecamatan;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface KecamatanRepository extends PagingAndSortingRepository<Kecamatan, Long> {

    List<Kecamatan> findByKotaId(Long id);
}
