package pet;

import java.util.Scanner;

public class MainPet {

    // Scanner para ler dados do usuario no console
    private final static Scanner scanner = new Scanner(System.in);
    // Instancia da maquina de banho para pets
    private final static PetMachine petMachine = new PetMachine();

    public static void main (String[] args){
        // Configura o scanner para ler linhas completas
        scanner.useDelimiter("\\n");

        var opcao = -1;

        // Loop principal para mostrar o menu ate o usuario sair
        do {
            System.out.println("Escolha uma das opcoes:");
            System.out.println("1 - dar banho no pet");
            System.out.println("2 - abastecer a maquina com agua");
            System.out.println("3 - abastecer a maquina com shampoo");
            System.out.println("4 - verificar a agua da maquina");
            System.out.println("5 - verificar shampoo da maquina");
            System.out.println("6 - verificar se tem pet no banho");
            System.out.println("7 - colocar pet na maquina");
            System.out.println("8 - retirar pet da maquina");
            System.out.println("9 - limpar a maquina");
            System.out.println("0 - sair");

            // Le a opcao escolhida pelo usuario
            opcao = scanner.nextInt();

            // Executa a acao conforme a opcao
            switch (opcao){
                case 1 -> petMachine.takeShower();          // Dar banho no pet
                case 2 -> setWater();                        // Abastecer agua
                case 3 -> setShampoo();                      // Abastecer shampoo
                case 4 -> verifyWater();                     // Mostrar agua disponivel
                case 5 -> verifyShampoo();                   // Mostrar shampoo disponivel
                case 6 -> checkIfHasPetInMachine();          // Verificar se ha pet na maquina
                case 7 -> setPetInPetMachine();              // Colocar pet na maquina
                case 8 -> petMachine.removePet();            // Remover pet da maquina
                case 9 -> petMachine.wash();                  // Limpar maquina
                case 0 -> System.exit(0);                     // Sair do programa
                default -> System.out.println("Opcao Invalida"); // Caso opcao invalida
            }
        } while(true);  // Loop infinito ate escolher sair (0)
    }

    // Metodo para abastecer shampoo na maquina
    private static void setShampoo(){
        System.out.println("Tentando colocar shampoo na maquina.");
        petMachine.addShampoo();
    }

    // Metodo para abastecer agua na maquina
    private static void setWater(){
        System.out.println("Tentando colocar agua na maquina.");
        petMachine.addWater();
    }

    // Metodo para mostrar quantidade atual de agua na maquina
    private static void verifyWater(){
        var amount = petMachine.getWater();
        System.out.println("A maquina esta no momento com " + amount + " litros de agua.");
    }

    // Metodo para mostrar quantidade atual de shampoo na maquina
    private static void verifyShampoo(){
        var amount = petMachine.getShampoo();
        System.out.println("A maquina esta no momento com " + amount + " litros de shampoo.");
    }

    // Metodo para verificar se ha um pet na maquina
    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na maquina" : "Nao tem pet na maquina");
    }

    // Metodo para colocar um pet na maquina, so se estiver limpa e sem pet
    public static void setPetInPetMachine(){
        if (!petMachine.isClean()) {
            System.out.println("A maquina esta suja. Limpe a maquina antes de colocar um pet.");
            return;
        }
        if (petMachine.getPet() != null){
            System.out.println("O pet " + petMachine.getPet().getName() + " ja esta na maquina.");
            return;
        }
        var name = "";
        // Pede o nome do pet ate o usuario informar um nome valido (nao vazio)
        while (name == null || name.trim().isEmpty()){
            System.out.println("Informe o nome do pet:");
            name = scanner.next();
        }

        var pet = new Pet(name);   // Cria novo pet com o nome informado
        petMachine.setPet(pet);    // Coloca o pet na maquina
        System.out.println("O pet " + pet.getName() + " foi colocado na maquina");
    }
}