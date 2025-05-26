package collectionsJavaApi.map.OperacoesaBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // Mapa para armazenar os produtos, onde a chave e o codigo do produto
    private Map<Long, Produto> estoqueProdutosMap;

    // Construtor que inicializa o mapa
    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    // Metodo para adicionar um produto ao estoque
    public void adicionarProduto(long cod, String nome,int quantidade,double preco){
        estoqueProdutosMap.put(cod,new Produto(nome,preco,quantidade));
    }

    // Metodo para exibir todos os produtos no estoque
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);;
    }

    // Metodo para calcular o valor total do estoque
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque= 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque+=p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    // Metodo para obter o produto mais caro do estoque
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco()> maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }return produtoMaisCaro;
    }

    // Metodo principal para testar a classe EstoqueProdutos
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // Adicionando produtos ao estoque
        estoqueProdutos.adicionarProduto(1L,"Produto a", 10,50.1);
        estoqueProdutos.adicionarProduto(2L,"Produto b", 5,40.1);
        estoqueProdutos.adicionarProduto(3L,"Produto c", 3,35.1);
        estoqueProdutos.adicionarProduto(4L,"Produto d", 1,24.1);

        System.out.println("---------------------------------------------------------------");
        // Exibindo todos os produtos
        estoqueProdutos.exibirProdutos();
        System.out.println("---------------------------------------------------------------");
        // Exibindo valor total do estoque
        System.out.println("Valor total do estoque: R$ "+ estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("---------------------------------------------------------------");
        // Exibindo o produto mais caro
        System.out.println("O produto mais barato: "+estoqueProdutos.obterProdutoMaisCaro());
    }
}
