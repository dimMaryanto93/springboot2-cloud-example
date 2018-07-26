package com.maryanto.dimas.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "m_kelurahan")
public class Kelurahan {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_kec", nullable = false)
    private Kecamatan kecamatan;

    @Column(name = "nama", nullable = false)
    private String nama;
}
