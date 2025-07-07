package dataStructure.generics1.carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      Exemplo de declaração de uma lista com elementos
        List<String> fruitList = List.of("apple", "banana", "cherry");

//        Exemplo de declaração utilizando alocação dinâmica para listas inicialmente vazias
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java Generics");

//        Exemplo de recuperação de dados por meio do index
        System.out.println(list.get(2));
        System.out.println("List: " + list);

//        Exemplo de Lista do tipo set(Não permite duplicatas)

        Set<String> setStrings =  new HashSet<>();
        setStrings.add("Hello");
        setStrings.add("Java");
        setStrings.add("Leonardo");
        setStrings.add("Teixeira");
        setStrings.add("Leonardo");

        System.out.println("setStrings: " + setStrings);
        System.out.println("Set: " + setStrings.contains("Docker"));

//      Exemplo de uma implementação de uma estrutura map
        Map<String, String>  map = new HashMap<>();
        map.put("name", "Leonardo");
        map.put("lastName ", "Teixeira");
        map.put("language", "Java");

        System.out.println(map.get("name"));
        System.out.println(map.get("language"));

//        Exemplo de Filas(Queue) que são listas ligadas e duplamente encadeadas
        Queue<String> queue =  new LinkedList<>();
        queue.add("Spring");
        queue.add("Framework");
        queue.add("Docker");
//        Método pool remove o primeiro valor da lista para processar o dado
        System.out.println("Queue: " + queue.poll());
//        .peek retorna o valor sem remove-lô
        System.out.println(queue.peek());
//        Remove o elemento porém lança uma exceção caso haja, ex: Lista vazia
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(" ");
//        Criação de um objeto imutável por meio de records ajudando na eliminação de código Boilerplate
        Carro sandero =  new Carro("Sandero", "Preto", 2020, "ABC-1234");
//        Métodos getter, retornam dados
        System.out.println(sandero.ano());
        System.out.println(sandero.cor());
        System.out.println(" ");
//        STREAM API:
//       Criação de uma lista de nomes
        List<String> nameList = new ArrayList<>();
        nameList.add("Rodrigo Goes");
        nameList.add("Rodrigo Santos");
        nameList.add("Fernanda Nogueira");
        nameList.add("Fernanda Moreira");
        nameList.add("Fred Rodrigues");
        nameList.add("Fabrício Santana");
        nameList.add("Eduarda Aguiar");

//        Exemplo de filtro de dados com o filter
         List<String> fernandaList= nameList
                 .stream()
                 .filter(nome -> nome.startsWith("Fernanda"))
//                 Exemplo utilizando funçoes lambdas
                 .map(String::toUpperCase)
                 .toList();
        System.out.println("Lista de nomes (Fernanda): " + fernandaList);


    }
}
