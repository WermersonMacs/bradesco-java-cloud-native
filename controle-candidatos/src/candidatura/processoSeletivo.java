package candidatura;

public class processoSeletivo {
    public static void main(String[] args) {
        analisandoCandidato(1920);
        analisandoCandidato(2200);
        analisandoCandidato(2000);
    }

    static void analisandoCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }
}
