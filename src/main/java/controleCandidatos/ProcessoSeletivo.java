package controleCandidatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    private static final List<String> listaSelecionados = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();

        System.out.println("\nCandidatos selecionado: ");
        imprimirSelecionado();

        System.out.println("\nEntrando em contato com os candidatos selecionados: ");
        for (String candidato: listaSelecionados){
            System.out.println("Candidato(a) " + candidato);
            entrarEmContato(candidato);
            System.out.println(" ");
        }
    }
    public static void entrarEmContato(String candidato){
        final int max_tentativas = 3;
        int tentativas = 1;
        boolean continuarTentando = true;

        do {
            if (atender()) {
                continuarTentando = false;
                System.out.println("Sucesso ao entrar em contato com o candidato!");
            } else {
                System.out.println("Falha ao tentar entrar em contato com o candidato!");
                tentativas++;
            }
        }while (continuarTentando && tentativas <= max_tentativas);
    }

    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    //Método para imprimir a lista de candidatos
    public static void imprimirSelecionado() {
        for (String candidato: listaSelecionados) {
            System.out.println(candidato);
        }
    }

    //Método que gera um valor aleátorio de salário para simulação
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    //Método que irá filtrar os candidatos por meio da pretensão salarial
    public static List selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Julia", "Marcia", "Paulo", "Augusto", "Monica", "Fabrício", "Mirela", "Daniela"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];

            double salarioPretendido = valorPretendido();
            System.out.printf("\nO candidato(a)" + candidato + " solicitou este valor salarial: %.2f ", salarioPretendido );

            if (salarioBase >= salarioPretendido) {
                System.out.println("\nO candidato(a) " + candidato + " foi selecionado(a) para a vaga! ");
                listaSelecionados.add(candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
        //Retorna a lista de candidatos que foram selecionados
        return listaSelecionados;
    }
}