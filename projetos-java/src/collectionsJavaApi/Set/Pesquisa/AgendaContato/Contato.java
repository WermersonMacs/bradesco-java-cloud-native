package collectionsJavaApi.Set.Pesquisa.AgendaContato;

import java.util.Objects;

// Classe que representa um contato da agenda, com nome e numero de telefone
public class Contato {
    private String nome;
    private int numero;

    // Construtor da classe, recebe nome e numero
    public Contato(String nome, int numero) {
        this.numero = numero;
        this.nome = nome;
    }

    // Retorna o nome do contato
    public String getNome() {
        return nome;
    }

    // Retorna o numero do contato
    public int getNumero() {
        return numero;
    }

    // Permite alterar o numero do contato
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Sobrescreve o metodo equals para considerar dois contatos iguais se tiverem o mesmo nome
    // Isso e importante para funcionamento correto do Set, evitando duplicatas por nome
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    // Gera o hashCode com base apenas no nome, coerente com o equals
    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    // Representacao textual do contato, usada por exemplo ao imprimir o Set
    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
