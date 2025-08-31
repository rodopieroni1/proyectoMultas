package com.sistemaMultas.sistemaMultas.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sistemaMultas.sistemaMultas.DTOs.PersonaDTO;
import com.sistemaMultas.sistemaMultas.Service.PersonaService;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping
    public ResponseEntity<PersonaDTO> crear(@RequestBody PersonaDTO dto) {
        PersonaDTO creada = personaService.crearPersona(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(creada);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonaDTO> obtenerPorId(@PathVariable Long id) {
        PersonaDTO persona = personaService.obtenerPorId(id);
        return ResponseEntity.ok(persona);
    }

    @GetMapping
    public ResponseEntity<List<PersonaDTO>> listarTodas() {
        List<PersonaDTO> personas = personaService.listarTodas();
        return ResponseEntity.ok(personas);
    }
}
