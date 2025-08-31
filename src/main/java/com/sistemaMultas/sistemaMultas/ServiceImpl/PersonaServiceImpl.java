package com.sistemaMultas.sistemaMultas.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.sistemaMultas.sistemaMultas.DTOs.PersonaDTO;
import com.sistemaMultas.sistemaMultas.Models.Persona;
import com.sistemaMultas.sistemaMultas.Repository.PersonaRepository;
import com.sistemaMultas.sistemaMultas.Service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public PersonaDTO crearPersona(PersonaDTO dto) {
        Persona persona = mapToEntity(dto);
        Persona guardada = personaRepository.save(persona);
        return mapToDTO(guardada);
    }

    
    public PersonaDTO obtenerPorId(Long id) {
        return personaRepository.findById(id)
                .map(this::mapToDTO)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada con ID: " + id));
    }

    public List<PersonaDTO> listarTodas() {
        return personaRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private Persona mapToEntity(PersonaDTO dto) {
        Persona p = new Persona();
        p.setApellido(dto.getApellido());
        p.setNombre(dto.getNombre());
        p.setDni(dto.getDni());
        p.setCuil(dto.getCuil());
        p.setFechaNacimiento(dto.getFechaNacimiento());
        p.setGenero(dto.getGenero());
        p.setNacionalidad(dto.getNacionalidad());
        p.setEstadoCivil(dto.getEstadoCivil());
        p.setOcupacion(dto.getOcupacion());
        p.setDomicilio(dto.getDomicilio());
        p.setTelefono(dto.getTelefono());
        p.setEmail(dto.getEmail());
        p.setObservaciones(dto.getObservaciones());
        return p;
    }

    private PersonaDTO mapToDTO(Persona p) {
        PersonaDTO dto = new PersonaDTO();
        dto.setApellido(p.getApellido());
        dto.setNombre(p.getNombre());
        dto.setDni(p.getDni());
        dto.setCuil(p.getCuil());
        dto.setFechaNacimiento(p.getFechaNacimiento());
        dto.setGenero(p.getGenero());
        dto.setNacionalidad(p.getNacionalidad());
        dto.setEstadoCivil(p.getEstadoCivil());
        dto.setOcupacion(p.getOcupacion());
        dto.setDomicilio(p.getDomicilio());
        dto.setTelefono(p.getTelefono());
        dto.setEmail(p.getEmail());
        dto.setObservaciones(p.getObservaciones());
        return dto;
    }
}
