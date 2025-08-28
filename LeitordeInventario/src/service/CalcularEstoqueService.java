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

        //Verifica se a lista de produtos esta vazia e retorna um valor double padrão
        if (produtos == null || produtos.isEmpty()) {
            System.out.println("A lista de produtos esta vazia");
            return 0.0;
        }
        for (Produto p : produtos) {
            soma += p.getPreco();
        }
        return soma;
    }

    public double calculaPrecoMedio(List<Produto> produtos) {
        //Inicializa as variáveis
        double mediaProdutos = 0.0;
        double somaPrecos = calculaTotalEstoque(produtos);
        int somaQuantProd = 0;

        //Verifica se a lista de produtos esta vazia e retorna um valor double padrão
        if (produtos == null || produtos.isEmpty()) {
            System.out.println("A lista de produtos esta vazia");
            return 0.0;
        }

        //Percorre todos os produtos realizar a soma de todos os precos e quantidades
        for (Produto p : produtos) {
            somaQuantProd += p.getQuantidadeEmEstoque();
        }
        //Calcula o preço medio
        mediaProdutos = somaPrecos / somaQuantProd;

        return mediaProdutos;
    }

// Funçao que retornar o produto com o menor preço
    public Produto calculaMaiorPreco(List<Produto> produtos) {
        Produto produto;

        //Inicializa o objeto com o preço do primeiro produto caso não estiver vazia
        if (!produtos.isEmpty()) {
            produto = produtos.get(0);
        } else {
            throw new IllegalArgumentException("A lista de produtos não pode estar vazia");
        }

        //percorre a lista de produtos atribuindo o maior preço ao objeto produto
        for (Produto p : produtos) {
            if (p.getPreco() > produto.getPreco()) {
                produto = p;
            }
        }
        return produto;
    }

//    Funçao que retornar o produto com o maior preço
    public Produto calculaMenorPreco(List<Produto> produtos) {
        Produto produto;

        //Inicializa a variável com o preço do primeiro produto caso não estiver vazia
        if (!produtos.isEmpty()) {
            produto = produtos.get(0);
        } else {
            throw new IllegalArgumentException("A lista de produtos não pode estar vazia");
        }

        //Percorre a lista de produtos atribuindo o menor preco entre a variavel menorPreco
        for (Produto p : produtos) {
            if (p.getPreco() < produto.getPreco()) {
                produto = p;
            }
        }
        return produto;
    }

    //Funcao que calcula se um produto precisa de reposicao de estoque
    public void reposicaoProdutos(List<Produto> produtos) {
        //Incializa as variaveis
        int quantEstoque = 0;
        //percorre a lista de produtos 
        for (Produto p : produtos) {
            quantEstoque = p.getQuantidadeEmEstoque();
            //Verifica se a quantidade em estoque é menor que 10
            if (quantEstoque <= 10) {
                //Imprime o produto que precisa de reposicao
                System.out.println(p.getNome() + "(Estoque: " + quantEstoque + " unidades )\n");
            }
        }
    }

    //Funcao que calcula itens de luxo
    public void calculaItemLuxo(List<Produto> produtos) {
        for (Produto p : produtos) {
            if (p.getPreco() > 500.0) {
                System.out.printf("-  %s (Preço: R$ %.2f)\n", p.getNome(), p.getPreco());
            }
        }
    }
    
    //Funcao que procura um produto na base de dados e retorna ele
    public void findByName(List<Produto> produtos, String entradaUsuario){
        String entrada = entradaUsuario.toLowerCase();
        String nomeProd = " ";
        
        for (Produto p : produtos) {
            nomeProd = p.getNome().toLowerCase();
            if(nomeProd.contains(entrada)){
                p.exibirInformacoes();
            }
        }
    }
    
    
}//end class
