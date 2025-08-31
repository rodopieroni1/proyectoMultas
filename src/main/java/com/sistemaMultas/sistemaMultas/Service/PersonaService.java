package com.sistemaMultas.sistemaMultas.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sistemaMultas.sistemaMultas.DTOs.PersonaDTO;

@Service
public interface PersonaService {
    PersonaDTO crearPersona(PersonaDTO dto);
    PersonaDTO obtenerPorId(Long id);
    List<PersonaDTO> listarTodas();
}
