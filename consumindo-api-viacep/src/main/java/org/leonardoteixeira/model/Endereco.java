package org.leonardoteixeira.model;

import org.leonardoteixeira.dto.EnderecoDTO;
import org.leonardoteixeira.exception.IllegalCepException;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String estado;
    private String numeroCasa;
    private String cep;

    public Endereco(String cep, EnderecoDTO enderecoDTO) {
        this.logradouro = enderecoDTO.logradouro();
        this.bairro = enderecoDTO.bairro();
        this.estado = enderecoDTO.uf();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
