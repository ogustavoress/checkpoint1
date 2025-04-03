package br.com.fiap.checkpoint1.dto;

import org.springframework.http.ResponseEntity;

import br.com.fiap.checkpoint1.model.Paciente;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class PacienteResponse {
    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefone_completo;
 
public ResponseEntity<PacienteResponse> create(@RequestBody PacienteRequestCreate dto){

    Paciente pacienteCreated = new Paciente();
    PacienteResponse response = new PacienteResponse();

    response.setId(pacienteCreated.getId());
    response.setNome(pacienteCreated.getNome());
    response.setEndereco(pacienteCreated.getEndereco());
    response.setBairro(pacienteCreated.getBairro());
    response.setEmail(pacienteCreated.getEmail());
    response.setTelefone_completo(pacienteCreated.getTelefone_completo());
    
    return ResponseEntity.status(201).body(response);
}

public PacienteResponse toDto(Paciente paciente){
    this.setId(paciente.getId());
    this.setNome(paciente.getNome());
    this.setEndereco(paciente.getEndereco());
    this.setBairro(paciente.getBairro());
    this.setEmail(paciente.getEmail());
    this.setTelefone_completo(paciente.getTelefone_completo());
    return this;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEndereco() {
    return endereco;
}

public void setEndereco(String endereco) {
    this.endereco = endereco;
}

public String getBairro() {
    return bairro;
}

public void setBairro(String bairro) {
    this.bairro = bairro;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getTelefone_completo() {
    return telefone_completo;
}

public void setTelefone_completo(String telefone_completo) {
    this.telefone_completo = telefone_completo;
}

    

}
