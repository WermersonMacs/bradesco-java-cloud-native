package collectionsJavaApi.Set.OperacoesBasicas.ListaConvidados;

import java.util.Objects;

public class Convidado {

    // Atributos da classe, nome e codigo de convite
    private String nome;
    private int codigoConvite;

    // Construtor que inicializa o nome e o codigo de convite
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Getter para o codigo de convite
    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Sobrescreve o metodo equals, para comparar dois convidados
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;  // Verifica se o objeto é nulo ou de classe diferente
        Convidado convidado = (Convidado) o;  // Cast para Convidado
        return codigoConvite == convidado.codigoConvite; // Considera dois convidados iguais se tiverem o mesmo codigo de convite
    }

    // Sobrescreve o metodo hashCode, que deve ser consistente com o equals
    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);  // Utiliza o codigoConvite como base para o hashCode
    }

    // Sobrescreve o metodo toString para exibir as informacoes do convidado
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
