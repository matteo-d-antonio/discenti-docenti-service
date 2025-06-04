package com.example.discenti_docenti_service.repository;

import com.example.discenti_docenti_service.entity.Discente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscenteRepository extends JpaRepository<Discente, Long> {
    @Query("SELECT d FROM Discente d WHERE d.nome=:nome")
    List<Discente> findByName(String nome);

    List<Discente> findByNomeAndCognome(String nome, String cognome);
}
