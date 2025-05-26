package collectionsJavaApi.set.OperacoesBasicas.ListaConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // Declaracao de um Set de convidados
    private Set<Convidado> convidadoSet;

    // Construtor da classe, inicializa o Set de convidados
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Metodo para adicionar um convidado ao Set, recebendo nome e codigo de convite
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    // Metodo para remover um convidado do Set pelo codigo de convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        // Percorre o Set para encontrar o convidado com o codigo de convite correspondente
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c; // Encontra o convidado a ser removido
                break;
            }
        }

        // Remove o convidado encontrado
        convidadoSet.remove(convidadoParaRemover);
    }

    // Metodo que retorna a quantidade de convidados no Set
    public int contarConvidado(){
        return convidadoSet.size(); // Retorna o tamanho do Set
    }

    // Metodo para exibir todos os convidados no Set
    public void exibirConvidado(){
        System.out.println(convidadoSet); // Exibe o Set de convidados
    }

    public static void main(String[] args) {
        // Criacao do objeto ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Exibe a quantidade inicial de convidados (espera-se que seja 0)
        System.out.println("Existem "+ conjuntoConvidados.contarConvidado() + " dentro do Set de convidados");

        // Adiciona varios convidados ao Set
        conjuntoConvidados.adicionarConvidado("joao", 321);
        conjuntoConvidados.adicionarConvidado("bruno", 321);
        conjuntoConvidados.adicionarConvidado("joao", 125);
        conjuntoConvidados.adicionarConvidado("pedro", 987);
        conjuntoConvidados.adicionarConvidado("joao", 123);

        // Exibe a quantidade de convidados apos as adicoes (pode ser menor do que o numero de adicoes, pois o Set nao aceita duplicados)
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " dentro do Ser de convidados");

        // Remove um convidado pelo codigo de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(987);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " dentro do Ser de convidados");

        // Exibe os convidados restantes no Set
        conjuntoConvidados.exibirConvidado();
    }

}
