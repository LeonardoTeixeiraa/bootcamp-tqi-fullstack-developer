/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.empresa.model.Produto;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author leonardo-teixeira
 */
public class CalcularEstoqueService {

    public double calculaTotalEstoque(List<Produto> produtos) {
        double soma = 0;

        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        return soma;
    }

    public List<Double> calculaPrecoMedio(List<Produto> produtos) {
        List<Double> mediaProdutos = new ArrayList<>();

        for (Produto p : produtos) {
            double precoUnit = p.getPreco();
            double quantidade = p.getQuantidadeEmEstoque();
            double precoMedio = 0.0;

            precoMedio = precoUnit / quantidade;
            mediaProdutos.add(precoMedio);
        }
        return mediaProdutos;
    }

    public double calculaMaiorPreco(List<Produto> produtos) {
        double maiorPreco = 0.0;

        //Inicializa a variável com o preço do primeiro produto caso não estiver vazia
        if (!produtos.isEmpty()) {
            maiorPreco = produtos.get(0).getPreco();
        } else {
            throw new IllegalArgumentException("A lista de produtos não pode estar vazia");
        }

        //percorre a lista de produtos atribuindo o maior preço a variavel maiorPreco
        for (Produto p : produtos) {
            if (p.getPreco() > maiorPreco) {
                maiorPreco = p.getPreco();
            }
        }
        return maiorPreco;
    }

    public double calculaMenorPreco(List<Produto> produtos) {
        double menorPreco = 0.0;
        
        //Inicializa a variável com o preço do primeiro produto caso não estiver vazia
        if (!produtos.isEmpty()) {
            menorPreco = produtos.get(0).getPreco();
        } else {
            throw new IllegalArgumentException("A lista de produtos não pode estar vazia");
        }

        //Percorre a lista de produtos atribuindo o menor preco entre a variavel menorPreco
        for (Produto p : produtos) {
            if (p.getPreco() < menorPreco) {
                menorPreco = p.getPreco();
            }
        }
        return menorPreco;
    }

}
