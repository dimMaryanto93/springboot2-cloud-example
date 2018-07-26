package com.maryanto.dimas.example.entity;

import com.maryanto.dimas.example.dto.Provinsi;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nasabah {

    private Long id;
    private String namaLengkap;
    private Provinsi provinsiTinggal;
}
