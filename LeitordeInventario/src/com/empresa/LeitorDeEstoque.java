/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresa;

/**
 *
 * @author leonardo-teixeira
 */
import com.empresa.model.Produto; // Importa a classe Produto
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import service.CalcularEstoqueService;

public class LeitorDeEstoque {

    public static void main(String[] args) {
        // ATENÇÃO: Altere este caminho para o local onde você salvou o arquivo CSV!
        String caminhoDoArquivo = "src/data/produtos.csv";
        System.out.println("--- Iniciando Leitura do Inventário ---");

        //Cria uma lista dinâmica de produtos
        List<Produto> produtos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivo))) {

            String linha;
            br.readLine(); // Pula a primeira linha (cabeçalho)
            // Loop para ler todas as linhas de dados do arquivo
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(","); // Divide a linha em um array de String
                // Extrai os dados do array
                String nome = dados[0];
                // Converte (parse) o preço de String para double
                double preco = Double.parseDouble(dados[1]);
                // Converte (parse) a quantidade de String para int
                int estoque = Integer.parseInt(dados[2]);
                // Cria (instancia) um novo objeto Produto usando o construtor
                Produto produto = new Produto(nome, preco, estoque);
//             Adiciona o produto na lista de produtos
                produtos.add(produto);
                // Chama o método do objeto para exibir suas informações
                produto.exibirInformacoes();
            }
            CalcularEstoqueService calcularEstoqueService = new CalcularEstoqueService();
            System.out.println(" ");
            System.out.println("---------------------------");
            double valorTotalInventario = calcularEstoqueService.calculaTotalEstoque(produtos);
            System.out.printf("Valor total do inventario: %.2f R$", valorTotalInventario);

            System.out.println(" ");
            System.out.println("---------------------------");
            double precoMedioProdutos = calcularEstoqueService.calculaPrecoMedio(produtos);
            System.out.printf("Preço médio de todos os produtos: %.2f R$", precoMedioProdutos);

            System.out.println(" ");
            System.out.println("---------------------------");
            Produto produtoMaisCaro = calcularEstoqueService.calculaMaiorPreco(produtos);
            produtoMaisCaro.exibirInformacoes();

            System.out.println(" ");
            System.out.println("---------------------------");

            Produto produtoMaisBarato = calcularEstoqueService.calculaMenorPreco(produtos);
            produtoMaisBarato.exibirInformacoes();
            
            System.out.println(" ");
            System.out.println("--- Relatório de Produtos para Reposição ---");
            calcularEstoqueService.reposicaoProdutos(produtos);
            
            System.out.println(" ");
            System.out.println("--- Relatório de Itens de Luxo ---");
            calcularEstoqueService.calculaItemLuxo(produtos);
            
             System.out.println(" ");
             String entrada = "Teclado";
            System.out.println("---Resultado da Busca por 'teclado---'\n");
            calcularEstoqueService.findByName(produtos, entrada);
            
        } catch (IOException e) {
            System.out.println("ERRO: Não foi possível ler o arquivo. Verifique o caminho");
            e.printStackTrace(); // Imprime o rastreamento do erro para depuração
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Formato numérico inválido em uma das linhas do arquivo");
            e.printStackTrace();
        }
        System.out.println("\n--- Leitura do Inventário Concluída ---");
    }
}
