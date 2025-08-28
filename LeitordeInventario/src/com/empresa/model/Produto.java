/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa.model;

/**
 *
 * @author leonardo-teixeira
 */
/**
 * Representa o modelo de um produto da loja.
 */
public class Produto {
    // Atributos da classe

    String nome;
    double preco;
    int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    /**
     * Construtor da classe Produto. Um construtor é um método especial usado
     * para inicializar um objeto recém-criado. Ele é chamado automaticamente
     * quando usamos a palavra-chave 'new'.
     *
     * @param nome Nome do produto.
     * @param preco Preço unitário do produto.
     * @param quantidadeEmEstoque Quantidade disponível em estoque.
     */
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    /**
     * Exibe os detalhes do produto no console.
     */
    public void exibirInformacoes() {
        System.out.println("---------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco); // Usando printf para formatar
        System.out.println("Estoque: " + this.quantidadeEmEstoque + " unidades");
    }
}
