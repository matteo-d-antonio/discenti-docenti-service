package com.example.discenti_docenti_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter

@NoArgsConstructor          //genera costruttore senza argomenti
@AllArgsConstructor         //genera costruttore  con tutti i campi degli argomenti
@Data                       //genera getters and setters ha bisogno di un argument constructor
public class DocenteDTO {

    private String nome;
    private String cognome;
    private Date dataNascita;

}
