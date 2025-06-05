package com.example.discenti_docenti_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DiscenteDTO {

    private String nome;
    private String cognome;
    private Integer matricola;
    private Integer eta;
    private String cittaResidenza;

}
