package com.example.discenti_docenti_service.mapstruct;

import com.example.discenti_docenti_service.dto.DiscenteDTO;
import com.example.discenti_docenti_service.dto.DocenteDTO;
import com.example.discenti_docenti_service.dto.DocenteDTOLight;
import com.example.discenti_docenti_service.entity.Discente;
import com.example.discenti_docenti_service.entity.Docente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocenteMapper {
    DocenteDTO toDto(Docente docente);
    Docente toEntity(DocenteDTO dto);

//    DocenteDTOLight toDtoLight(Docente docente);
//    Docente toEntityLight(DocenteDTOLight dto);
}
