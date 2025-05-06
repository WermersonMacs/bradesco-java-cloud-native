package candidatura;

import java.util.concurrent.ThreadLocalRandom;

// Seguindo convenções Java, a primeira letra da classe deve ser maiúscula
public class ProcessoSeletivo {

    public static void main(String[] args) {
        // Chama o metodo que faz a seleção dos candidatos
        selecaoCandidatos();
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "João", "Pedro", "Flavio"};

        System.out.println("Imprimindo a lista de candidatos infomando o indice do elemento");

        for (int indice=0; indice<candidatos.length;indice++){
            System.out.println("O candidato de n° " + (indice+1)+" é " + candidatos[indice]);
        }
    }

    // Metodo responsável por selecionar os candidatos
    static void selecaoCandidatos() {
        // Lista de candidatos disponíveis
        String[] candidatos = {"Felipe", "Marcia", "João", "Pedro", "Flavio", "Joaquim"};

        int candidatosSelecionados = 0; // Contador de candidatos aprovados
        int candidatosAtual = 0;        // Índice do candidato atual
        double salarioBase = 2000.0;    // Salário base oferecido para a vaga

        // Enquanto menos de 5 candidatos forem selecionados e ainda houver candidatos para avaliar
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];          // Pega o nome do candidato atual
            double salarioPretendido = valorPretendido();            // Gera um valor aleatório para o salário pretendido

            System.out.printf("O candidato %s solicitou este valor de salário: R$ %.2f%n", candidato, salarioPretendido);

            // Verifica se o salário pretendido é compatível com o salário base
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga.%n", candidato);
                candidatosSelecionados++;
            }

            // Passa para o próximo candidato
            candidatosAtual++;
        }
    }

    // Gera um valor de salário pretendido aleatório entre R$1800 e R$2000
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Metodo para analisar individualmente o salário pretendido de um candidato
    static void analisandoCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        // Avalia o salário pretendido em relação ao salário base
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
