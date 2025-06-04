package com.example.discenti_docenti_service.controller;

import com.example.discenti_docenti_service.service.DiscenteService; // Import per il servizio
import com.example.discenti_docenti_service.entity.Discente; // Import per l'entità
import org.springframework.beans.factory.annotation.Autowired; // Import per @Autowired
import org.springframework.web.bind.annotation.GetMapping; // Import per @GetMapping
import org.springframework.web.bind.annotation.RequestMapping; // Import per @RequestMapping
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/discenti")
public class DiscenteController {

    @Autowired
    DiscenteService discenteService;

    @GetMapping("/list")
    public List<DiscenteDTO> list() {
        return discenteService.findAll();
    }
}
