package geometriaCalc; // Declara que esta classe pertence ao pacote geometriaCalc

import java.util.Scanner; // Importa a classe Scanner para leitura de dados do teclado

public class Main {

    private static final Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuario

    public static void main(String[] args) {

        int option; // Variavel para armazenar a opcao escolhida pelo usuario
        GeometricForm geometricForm = null; // Variavel para armazenar a forma geometrica escolhida

        while (true){ // Loop infinito ate que o usuario escolha sair
            System.out.println("Escolha a forma geometrica para calcular a area:");
            System.out.println("1 - Quadrado"); // Opcao 1: quadrado
            System.out.println("2 - Retangulo"); // Opcao 2: retangulo
            System.out.println("3 - Circulo"); // Opcao 3: circulo
            System.out.println("4 - Sair do programa!"); // Opcao 4: sair
            option = scanner.nextInt(); // Le a opcao digitada

            if (option == 1 ){
                geometricForm = createSquare(); // Cria um quadrado
            } else if (option == 2) {
                geometricForm = createRectangle(); // Cria um retangulo
            } else if (option == 3){
                geometricForm = createCircle(); // Cria um circulo

            } else if (option == 4) {
                break; // Sai do loop

            } else {
                System.out.println("Opcao invalida!"); // Informa erro se a opcao nao for valida
                continue; // Continua para o proximo ciclo do loop
            }

            System.out.println("O resultado do calculo da area foi de " + geometricForm.getArea()); // Mostra o resultado da area
        }
    }

    private static GeometricForm createSquare(){
        System.out.println("Informe os tamanho dos lados:"); // Solicita o tamanho dos lados
        var side = scanner.nextDouble(); // Le o valor digitado
        return new Square(side); // Cria e retorna um objeto Square
    }

    private static GeometricForm createRectangle(){
        System.out.println("Informe a Base:"); // Solicita a base
        var base = scanner.nextDouble(); // Le a base
        System.out.println("Informe a Altura:"); // Solicita a altura
        var heigth = scanner.nextDouble(); // Le a altura
        return new Rectangle(base,heigth); // Cria e retorna um objeto Rectangle
    }

    private static GeometricForm createCircle(){
        System.out.println("Informe Raio:"); // Solicita o raio
        var radius = scanner.nextDouble(); // Le o raio
        return  new Circle(radius); // Cria e retorna um objeto Circle
    }
}