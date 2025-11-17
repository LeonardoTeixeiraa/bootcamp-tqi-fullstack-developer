package org.leonardoteixeira.service;

import org.leonardoteixeira.client.ViaCepClient;
import org.leonardoteixeira.dto.EnderecoDTO;
import org.leonardoteixeira.model.Endereco;

public class EnderecoService {
    private final ViaCepClient client = new ViaCepClient();

    public Endereco obterEnderecoPorCep(String cep) throws Exception {
        validarCep(cep);
        cep = cep.replace("-", "");
        EnderecoDTO enderecoDTO = client.buscarCep(cep);
        return new Endereco(cep, enderecoDTO);
    }

    private void validarCep(String cep) {
        cep = cep.replace("-", "");
        if (cep.length() != 8)
            throw new IllegalArgumentException("CEP inválido: deve ter 8 caracteres");
    }
}
