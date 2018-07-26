package com.maryanto.dimas.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "m_kecamatan")
public class Kecamatan {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_kota_kab", nullable = false)
    private KotaKabupaten kota;

    @Column(name = "nama", nullable = false)
    private String nama;
}
