package geometriaCalc; // define o pacote onde a classe está localizada

// declara um record chamado Circle que implementa a interface GeometricForm
public record Circle(double radius) implements GeometricForm {

    // constante que representa o valor de pi
    public static final double pi = 3.14;

    // implementação do método da interface GeometricForm para calcular a área do círculo
    @Override
    public double getArea() {
        return pi * (radius * radius); // fórmula da área do círculo: pi * raio ao quadrado
    }
}
