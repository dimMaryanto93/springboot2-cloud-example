package com.maryanto.dimas.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "m_provinsi")
public class Provinsi {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "nama", nullable = false)
    private String nama;
}
