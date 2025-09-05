package com.leonardoTeixeira;

import com.leonardoTeixeira.model.Cliente;
import com.leonardoTeixeira.model.TipoCliente;
import com.leonardoTeixeira.model.TipoPagamento;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Leonardo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Fernanda", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente4 = new Cliente("Isa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1 + "\n" +
               TipoPagamento.DEBITO.calcularDesconto(100) );
        System.out.println(cliente2 + "\n" +
               TipoPagamento.CREDITO.calcularDesconto(500) );
        System.out.println(cliente3 + "\n" +
               TipoPagamento.DEBITO.calcularDesconto(60) );
        System.out.println(cliente4 + "\n" +
               TipoPagamento.CREDITO.calcularDesconto(170) );
    }
}
