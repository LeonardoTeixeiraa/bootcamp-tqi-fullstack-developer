package com.leonardoTeixeira.model;

public enum TipoCliente {
        PESSOA_JURIDICA(1, "PESSOA JURIDICA"),
        PESSOA_FISICA(2, "PESSOA FISICA");

        private int valor;
        private String nomeRelatorio;
        TipoCliente(int valor, String nomeRelatorio){
                this.valor = valor;
                this.nomeRelatorio = nomeRelatorio;
        }

        public String getNomeRelatorio() {
                return nomeRelatorio;
        }

        public int getValor() {
                return valor;
        }
}
