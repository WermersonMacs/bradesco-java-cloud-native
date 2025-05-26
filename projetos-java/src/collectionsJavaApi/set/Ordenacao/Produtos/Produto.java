package collectionsJavaApi.set.Ordenacao.Produtos;

import java.util.Comparator;
import java.util.Objects;

// Classe que representa um produto com codigo, nome, preco e quantidade
public class Produto implements Comparable<Produto>{

    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor que inicializa todos os atributos do produto
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Implementacao da interface Comparable para ordenar por nome (ordem alfabetica ignorando maiusculas/minusculas)
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // Getters dos atributos
    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Define igualdade com base no codigo do produto
    // Isso garante que dois produtos com o mesmo codigo sao tratados como iguais em Sets
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    // Gera o hashCode com base no codigo, coerente com o equals
    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    // Representacao textual do produto, formatada para facilitar leitura ao imprimir
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}'+"\n";
    }
}

// Classe comparadora para ordenar produtos por preco (em ordem crescente)
class ComparatorProPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
