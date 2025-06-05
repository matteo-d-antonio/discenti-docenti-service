package com.example.discenti_docenti_service.controller;

import com.example.discenti_docenti_service.dto.DocenteDTO;
import com.example.discenti_docenti_service.entity.Docente;
import com.example.discenti_docenti_service.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/docenti")
public class DocenteController {

    @Autowired
    DocenteService docenteService;

    // LISTA
    @GetMapping("/list")
    public List<DocenteDTO> list() {
        List<DocenteDTO> docenti = docenteService.findAll();
        Long numeroDocenti = docenteService.contaDocenti();
        return docenti;
    }



    @GetMapping("/cerca")
    public List<DocenteDTO> cerca(@RequestParam String nome) {
        return docenteService.findbyNome(nome);
    }


    // SALVA NUOVO
    @PostMapping
    public DocenteDTO create(@RequestBody DocenteDTO docenteDTO) {
        return docenteService.save(docenteDTO);

    }

    //update
    @PutMapping("/{id}")
    public DocenteDTO update(@PathVariable Long id, @RequestBody DocenteDTO docenteDTO) {
        return docenteService.update(id, docenteDTO);
    }

    //@DeleteMapping("/{id}")
    //public void delete (@PathVariable Long id) {
        //docenteService.delete(id);
    //}




}
