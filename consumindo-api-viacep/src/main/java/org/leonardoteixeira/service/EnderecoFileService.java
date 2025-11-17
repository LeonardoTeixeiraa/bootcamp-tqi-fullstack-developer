package org.leonardoteixeira.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.leonardoteixeira.model.Endereco;

import java.io.FileWriter;

public class EnderecoFileService {

    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void salvar(Endereco endereco) throws Exception {
        FileWriter writer = new FileWriter("endereco.json");
        gson.toJson(endereco, writer);
        writer.close();
    }
}
