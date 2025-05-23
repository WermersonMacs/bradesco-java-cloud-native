package collectionsJavaApi.Set.Ordenacao;

import java.util.*;

// Classe que gerencia uma lista de pessoas e permite ordena-las por idade ou altura
public class OdernacaoPessoa {

    // Lista que armazena objetos do tipo Pessoa
    private List<Pessoa> pessoaList;

    // Construtor que inicializa a lista
    public OdernacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    // Metodo para adicionar uma nova pessoa na lista
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Metodo que retorna a lista de pessoas ordenada por idade
    public List<Pessoa> ordenadaPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade); // Usa a implementacao de Comparable (idade)
        return pessoaPorIdade;
    }

    // Metodo que retorna a lista de pessoas ordenada por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura()); // Usa ComparatorPorAltura
        return pessoaPorAltura;
    }

    // Metodo principal para testar a ordenacao
    public static void main(String[] args) {
        OdernacaoPessoa odernacaoPessoa = new OdernacaoPessoa();

        // Adiciona algumas pessoas a lista
        odernacaoPessoa.adicionarPessoa("nome 1", 25, 1.65);
        odernacaoPessoa.adicionarPessoa("nome 2", 36, 1.95);
        odernacaoPessoa.adicionarPessoa("nome 3", 58, 1.45);
        odernacaoPessoa.adicionarPessoa("nome 4", 12, 1.99);

        // Exibe a lista ordenada por altura
        System.out.println(odernacaoPessoa.ordenarPorAltura());

        // Exibe a lista ordenada por idade
        System.out.println(odernacaoPessoa.ordenadaPorIdade());
    }
}