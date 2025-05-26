package collectionsJavaApi.map.OperacoesaBasicas.Pesquisa;

public class Produto {

    // Atributo que representa o nome do produto
    private String nome;

    // Atributo que representa o preco do produto
    private double preco;

    // Atributo que representa a quantidade do produto
    private int quantidade;

    // Construtor para inicializar o produto com nome, preco e quantidade
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Metodo para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Metodo para obter o preco do produto
    public double getPreco() {
        return preco;
    }

    // Metodo para obter a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Metodo toString para representar o produto em formato de texto
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}' + "\n";
    }

}
