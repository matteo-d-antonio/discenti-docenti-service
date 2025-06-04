package com.example.discenti_docenti_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscenteDTOLight {
    private String nome;
    private String cognome;

    public DiscenteDTOLight(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
}
