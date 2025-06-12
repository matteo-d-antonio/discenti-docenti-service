package com.example.discenti_docenti_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DocenteDTO {

    private long id;
    private String nome;
    private String cognome;
    private Date dataNascita;

    public DocenteDTO(Long id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

}
