package br.com.fiap.checkpoint1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")

public class PacienteController {

    @PostMapping
    public ResponseEntity<String> create(){
        return ResponseEntity.status(201).body("Paciente criado");
    }

    public ResponseEntity<String> update(){
        return ResponseEntity.status(200).body("Paciente atualizado");
    }
    
    public ResponseEntity<Void> delete(){
        return ResponseEntity.status(204).build();
    }

    public ResponseEntity<String> getPacienteById(){
        return ResponseEntity.status(200).body("Paciente");
    }

}
