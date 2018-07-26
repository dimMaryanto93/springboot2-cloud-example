package com.maryanto.dimas.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provinsi {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("nama")
    private String name;
}
