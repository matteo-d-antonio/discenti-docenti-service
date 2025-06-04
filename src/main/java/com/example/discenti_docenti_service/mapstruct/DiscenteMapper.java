package com.example.discenti_docenti_service.mapstruct;

import java.util.List;
import com.example.discenti_docenti_service.dto.DiscenteDTO;
import com.example.discenti_docenti_service.dto.DiscenteDTOLight;
import com.example.discenti_docenti_service.entity.Discente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DiscenteMapper {
    DiscenteDTO toDto(Discente discente);
    Discente toEntity(DiscenteDTO discenteDTO);

    List<DiscenteDTO> toDtoList(List<Discente> discenti); //aggiunto ora

//    DiscenteDTOLight toDtoLight(Discente discente);
//    Discente toEntityLight(DiscenteDTOLight dto);
}
