package geometriaCalc; // define o pacote onde a classe está localizada

// declara um record chamado Rectangle que implementa a interface GeometricForm
public record Rectangle(double base, double heigth) implements GeometricForm {

    // implementação do método da interface GeometricForm para calcular a área do retângulo
    @Override
    public double getArea() {
        return heigth * base; // fórmula da área do retângulo: base * altura
    }
}
