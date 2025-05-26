package collectionsJavaApi.set.Ordenacao.Produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Classe responsavel pelo cadastro e organizacao de produtos
public class CadastroProdutos {

    // Conjunto que armazena os produtos, sem ordem definida e sem duplicatas
    private Set<Produto> produtoSet;

    // Construtor que inicializa o HashSet
    public CadastroProdutos (){
        this.produtoSet = new HashSet<>();
    }

    // Metodo para adicionar um produto ao conjunto
    public void adicionarProduto (long cod, String  nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    // Retorna os produtos ordenados por nome
    // A classe Produto precisa implementar Comparable para que isso funcione
    public Set<Produto> exibirProdutosPorNomes(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    // Retorna os produtos ordenados por preco
    // Usa um comparador customizado (ComparatorProPreco)
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosProPreco = new TreeSet<>(new ComparatorProPreco());
        produtosProPreco.addAll(produtoSet);
        return produtosProPreco;
    }

    // Metodo principal para testar as funcionalidades da classe
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adiciona produtos ao cadastro
        cadastroProdutos.adicionarProduto(1l,"Produto 5",15d,5);
        cadastroProdutos.adicionarProduto(2l,"Produto 1",50d,51);
        cadastroProdutos.adicionarProduto(7l,"Produto 3",5d,500);
        cadastroProdutos.adicionarProduto(8l,"Produto 2",1d,20);
        cadastroProdutos.adicionarProduto(9l,"Produto 4",7d,78);

        // Exibe o conjunto original (sem ordem definida)
        System.out.println(cadastroProdutos.produtoSet);

        // Exibe os produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNomes());

        // Exibe os produtos ordenados por preco
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

}
