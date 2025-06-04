package com.example.discenti_docenti_service.repository;

import com.example.discenti_docenti_service.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
    @Query("SELECT COUNT(d) FROM Docente d")
    Long contaDocenti();

    @Query("SELECT d FROM Docente d WHERE d.nome = :nome")
    List<Docente> findByNome(@Param("nome") String nome);

    Docente findByNomeAndCognome(String nome, String cognome);
}
