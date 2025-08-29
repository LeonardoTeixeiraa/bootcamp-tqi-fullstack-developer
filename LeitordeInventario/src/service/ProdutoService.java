/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.empresa.model.Produto;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author leonardo-teixeira
 */
public class ProdutoService {

    /**
     * Calcula o valor total do estoque somando o preço de todos os produtos.
     *
     * @param produtos lista de produtos disponíveis
     * @return soma dos preços ou 0.0 se a lista estiver vazia/nula
     */
    public double calculaTotalEstoque(List<Produto> produtos) {
        double soma = 0;

        if (produtos == null || produtos.isEmpty()) {
            System.out.println("A lista de produtos esta vazia");
            return 0.0;
        }
        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        return soma;
    }

    /**
     * Calcula o valor total do estoque somando o preço de todos os produtos.
     *
     * @param produtos lista de produtos disponíveis
     * @return soma dos preços ou 0.0 se a lista estiver vazia/nula
     */
    public double calculaPrecoMedio(List<Produto> produtos) {
        double mediaProdutos = 0.0;
        double somaPrecos = calculaTotalEstoque(produtos);
        int somaQuantProd = 0;

        if (produtos == null || produtos.isEmpty()) {
            System.out.println("A lista de produtos esta vazia");
            return 0.0;
        }

        for (Produto p : produtos) {
            somaQuantProd += p.getQuantidadeEmEstoque();
        }
        mediaProdutos = somaPrecos / somaQuantProd;

        return mediaProdutos;
    }

    /**
     * Retorna o produto de maior preço.
     *
     * @param produtos lista de produtos disponíveis (não pode ser vazia)
     * @return produto com maior valor de preço
     * @throws IllegalArgumentException se a lista estiver vazia
     */
    public Produto calculaMaiorPreco(List<Produto> produtos) {
        Produto produto;

        if (!produtos.isEmpty()) {
            produto = produtos.get(0);
        } else {
            throw new IllegalArgumentException("A lista de produtos não pode estar vazia");
        }

        for (Produto p : produtos) {
            if (p.getPreco() > produto.getPreco()) {
                produto = p;
            }
        }
        return produto;
    }

    /**
     * Retorna o produto de menor preço.
     *
     * @param produtos lista de produtos disponíveis (não pode ser vazia)
     * @return produto com menor valor de preço
     * @throws IllegalArgumentException se a lista estiver vazia
     */
    public Produto calculaMenorPreco(List<Produto> produtos) {
        Produto produto;
        if (!produtos.isEmpty()) {
            produto = produtos.get(0);
        } else {
            throw new IllegalArgumentException("A lista de produtos não pode estar vazia");
        }

        for (Produto p : produtos) {
            if (p.getPreco() < produto.getPreco()) {
                produto = p;
            }
        }
        return produto;
    }

    /**
     * Lista os produtos que estão abaixo do nível mínimo de estoque. Nível
     * mínimo = 10 unidades.
     */
    public List<Produto> getProdutosParaReposicao(List<Produto> produtos) {
        return produtos.stream()
                .filter(p -> p.getQuantidadeEmEstoque() <= 10)
                .collect(Collectors.toList());
    }

    /**
     * Retorna os produtos considerados de luxo. Critério: preço acima de R$
     * 500,00.
     *
     * @param produtos lista de produtos disponíveis
     */
    public List<Produto> getProdutosDeLuxo(List<Produto> produtos) {
        return produtos.stream()
                .filter(p -> p.getPreco() > 500.0)
                .collect(Collectors.toList());
    }

    /**
     * Busca produtos pelo nome, ignorando maiúsculas/minúsculas.
     *
     * @param produtos lista de produtos disponíveis
     * @param entradaUsuario termo de busca digitado pelo usuário
     */
    public List<Produto> findByName(List<Produto> produtos, String entradaUsuario) {
        String entrada = entradaUsuario.toLowerCase();
        return produtos.stream()
                .filter(p -> p.getNome().contains(entrada))
                .collect(Collectors.toList());
    }

}//end class
