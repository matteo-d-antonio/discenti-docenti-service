package com.example.discenti_docenti_service.service;

import com.example.discenti_docenti_service.mapstruct.DiscenteMapper;
import com.example.discenti_docenti_service.mapstruct.DocenteMapper;
import com.example.discenti_docenti_service.dto.DocenteDTO;
import com.example.discenti_docenti_service.entity.Docente;
import com.example.discenti_docenti_service.repository.DocenteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DocenteService {


    @Autowired
    DocenteRepository docenteRepository;


    @Autowired
    DocenteMapper  docenteMapper;


    public DocenteDTO findById(Long id) {
        Optional<Docente> docenteOpt = docenteRepository.findById(id);

        if (docenteOpt.isPresent()) {
            // Restituisci il DocenteDTO se il docente esiste
            Docente docente = docenteOpt.get();
            return new DocenteDTO(docente.getId(), docente.getNome(), docente.getCognome());
        } else {
            // Se il docente non esiste, restituisci null o lancia un'eccezione
            return null;  // O puoi lanciare un'eccezione se preferisci
        }
    }

    public List<DocenteDTO> findAll() {
        return docenteRepository.findAll().stream()
                .map(docenteMapper::toDto)
                .collect(Collectors.toList());
    }

    public DocenteDTO get(Long id) {
        Docente docente =docenteRepository.findById(id)
                .orElseThrow();
        return docenteMapper.toDto(docente);
    }

    public DocenteDTO save(DocenteDTO d) {
        Docente docente = docenteMapper.toEntity(d);
        Docente savedDocente = docenteRepository.save(docente);
        return docenteMapper.toDto(savedDocente);
    }

    public DocenteDTO update(Long id, DocenteDTO d ) {
        Docente docente = docenteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Docente non trovato"));
        if(d.getNome()!=null) docente.setNome(d.getNome());
        if(d.getCognome()!=null) docente.setCognome(d.getCognome());
        Docente savedDocente = docenteRepository.save(docente);
        return docenteMapper.toDto(savedDocente);
    }



    public Long contaDocenti() {
        return docenteRepository.contaDocenti();
    }

    public List<DocenteDTO> findbyNome(String nome) {
        return docenteRepository.findByNome(nome).stream()
                .map(docenteMapper::toDto)
                .collect(Collectors.toList());
    }
}
