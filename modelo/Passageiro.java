package model;

import java.time.LocalDate;

public class Passageiro {
    private String nomePassageiro;
    private String rg;
    private String cpf;
    private String numeroPassaporte;
    private String telefoneContato;
    private String telefoneEmergencia;
    private String destino;
    private LocalDate dataIda;
    private LocalDate dataVolta;
    
    public Passageiro(){

    }


    public Passageiro(String nomePassageiro, String rg, String cpf, String numeroPassaporte,
                      String telefoneContato, String telefoneEmergencia,
                      String destino, LocalDate dataIda, LocalDate dataVolta) {
        this.nomePassageiro = nomePassageiro;
        this.rg = rg;
        this.cpf = cpf;
        this.numeroPassaporte = numeroPassaporte;
        this.telefoneContato = telefoneContato;
        this.telefoneEmergencia = telefoneEmergencia;
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public void setDataIda(LocalDate dataIda) {
        this.dataIda = dataIda;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(LocalDate dataVolta) {
        this.dataVolta = dataVolta;
    }
}
