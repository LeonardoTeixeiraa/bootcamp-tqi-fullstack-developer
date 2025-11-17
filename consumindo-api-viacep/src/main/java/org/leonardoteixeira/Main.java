package org.leonardoteixeira;

import org.leonardoteixeira.model.Endereco;
import org.leonardoteixeira.service.EnderecoFileService;
import org.leonardoteixeira.service.EnderecoService;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o CEP: ");
        String cep = sc.nextLine();

        EnderecoService service = new EnderecoService();
        Endereco endereco = service.obterEnderecoPorCep(cep);

        EnderecoFileService fileService = new EnderecoFileService();
        fileService.salvar(endereco);

    }
}