package com.leonardoTeixeira;

import com.leonardoTeixeira.model.Cliente;
import com.leonardoTeixeira.model.TipoCliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Fernanda", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Isa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
