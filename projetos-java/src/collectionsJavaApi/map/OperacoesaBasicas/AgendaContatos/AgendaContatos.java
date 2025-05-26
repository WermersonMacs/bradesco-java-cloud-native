package collectionsJavaApi.map.OperacoesaBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

// Classe que representa uma agenda de contatos usando um Map
// Cada nome e associado a um numero de telefone
public class AgendaContatos {

    // Mapa onde a chave e o nome do contato e o valor e o telefone
    private Map<String,Integer> agendaContatoMap;

    // Construtor que inicializa o HashMap
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // Adiciona ou atualiza um contato no mapa
    public void adicionarContato(String nome,Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    // Remove um contato do mapa pelo nome, se o mapa nao estiver vazio
    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    // Exibe todos os contatos no formato chave=valor
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    // Retorna o telefone associado ao nome fornecido, ou null se nao existir
    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    // Metodo principal para testar as funcionalidades da agenda
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adiciona contatos na agenda
        agendaContatos.adicionarContato("joao",1234);
        agendaContatos.adicionarContato("joaquim",1234);
        agendaContatos.adicionarContato("julio",1234);
        agendaContatos.adicionarContato("jose",1274);
        agendaContatos.adicionarContato("jesse",1234);
        agendaContatos.adicionarContato("juliano",1234);

        // Exibe todos os contatos
        agendaContatos.exibirContatos();

        System.out.println("--------------------------------------------");

        // Pesquisa e exibe o telefone de jose
        System.out.println(agendaContatos.pesquisaPorNome("jose"));

        System.out.println("--------------------------------------------");

        // Remove o contato jose e exibe a agenda atualizada
        agendaContatos.removerContato("jose");
        agendaContatos.exibirContatos();
    }
}
