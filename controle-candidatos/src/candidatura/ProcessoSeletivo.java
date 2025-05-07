package candidatura; // Pacote onde o arquivo está localizado

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Seguindo convenção Java: nomes de classes iniciam com letra maiúscula
public class ProcessoSeletivo {

    public static void main(String[] args) {
        // Lista de candidatos a serem contatados
        String[] candidatos = {"Felipe", "Marcia", "João", "Pedro", "Flavio"};

        // Para cada candidato, tentamos entrar em contato
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    // Metodo que simula a tentativa de contato com um candidato
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;   // Contador de tentativas
        boolean continuarTentando = true; // Flag para continuar tentando
        boolean atendeu = false;          // Flag que indica se o candidato atendeu

        // Loop que permite até 3 tentativas de contato
        do {
            atendeu = atender(); // Simula se o candidato atendeu
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++; // Incrementa tentativa se não atendeu
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        // Mensagem final com base no resultado
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas: " + tentativasRealizadas);
        }
    }

    // Metodo que simula se o candidato atende ou não (1 chance em 3)
    static boolean atender() {
        return new Random().nextInt(3) == 1; // Retorna true se número aleatório (0-2) for 1
    }

    // Metodo que imprime todos os candidatos com seus índices
    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "João", "Pedro", "Flavio"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    // Metodo responsável por selecionar até 5 candidatos com base no salário pretendido
    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "João", "Pedro", "Flavio", "Joaquim"};
        int candidatosSelecionados = 0;  // Contador de candidatos aprovados
        int candidatosAtual = 0;         // Índice do candidato atual
        double salarioBase = 2000.0;     // Salário máximo que a empresa pode pagar

        // Continua até selecionar 5 candidatos ou acabar a lista
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual]; // Candidato atual
            double salarioPretendido = valorPretendido();   // Gera salário aleatório

            System.out.printf("O candidato %s solicitou este valor de salário: R$ %.2f%n", candidato, salarioPretendido);

            // Se o salário pretendido for menor ou igual ao salário base, seleciona o candidato
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga.%n", candidato);
                candidatosSelecionados++;
            }

            // Passa para o próximo candidato
            candidatosAtual++;
        }
    }

    // Gera um valor aleatório entre R$1800,00 e R$2200,00 simulando o salário que o candidato pede
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Analisa o salário pretendido individualmente e dá uma resposta apropriada
    static void analisandoCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
