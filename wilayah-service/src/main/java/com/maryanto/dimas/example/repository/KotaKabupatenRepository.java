package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.entity.KotaKabupaten;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface KotaKabupatenRepository extends PagingAndSortingRepository<KotaKabupaten, Long> {

    List<KotaKabupaten> findByProvinsiId(Long id);
}
