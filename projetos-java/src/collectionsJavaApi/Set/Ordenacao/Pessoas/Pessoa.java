package collectionsJavaApi.Set.Ordenacao.Pessoas;

import java.util.Comparator;

// Classe Pessoa que implementa a interface Comparable para permitir ordenacao por idade
public class Pessoa implements Comparable<Pessoa> {
    // Atributos da pessoa: nome, idade e altura
    private String nome;
    private int idade;
    private double altura;

    // Construtor da classe que inicializa os atributos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Implementacao do metodo compareTo para comparar pessoas pela idade
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    // Metodo para obter a altura da pessoa
    public double getAltura() {
        return altura;
    }

    // Metodo para obter a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Metodo para obter o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Representacao em texto do objeto Pessoa
    @Override
    public String toString() {
        return " Pessoa: {" +
                "nome= " + nome +
                ", idade= " + idade +
                ", altura= " + altura + "}" + "\n";
    }
}

// Classe que implementa Comparator para comparar pessoas por altura
class ComparatorPorAltura implements Comparator<Pessoa> {

    // Metodo compare que compara duas pessoas com base na altura
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}