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
@Table(name = "m_kota_kab")
public class KotaKabupaten {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_propinsi", nullable = false)
    private Provinsi provinsi;

    @Column(name = "nama", nullable = false)
    private String nama;
}
