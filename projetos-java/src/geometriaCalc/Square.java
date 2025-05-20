package geometriaCalc; // define o pacote onde a classe está localizada

// declara um record chamado Square que implementa a interface GeometricForm
public record Square(double side) implements GeometricForm {

    // implementação do método da interface GeometricForm para calcular a área do quadrado
    @Override
    public double getArea() {
        return side * side; // fórmula da área do quadrado: lado * lado
    }
}
