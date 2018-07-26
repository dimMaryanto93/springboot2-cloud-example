package com.maryanto.dimas.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_kecamatan")
public class Kecamatan {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_kota_kab", nullable = false)
    private KotaKabupaten kota;

    @Column(name = "nama", nullable = false)
    private String nama;
}
