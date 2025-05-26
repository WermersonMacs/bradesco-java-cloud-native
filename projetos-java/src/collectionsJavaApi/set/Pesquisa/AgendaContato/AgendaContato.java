package collectionsJavaApi.set.Pesquisa.AgendaContato;

import java.util.HashSet;
import java.util.Set;

// Classe principal que representa uma agenda de contatos utilizando um Set para garantir que nao haja duplicatas
public class AgendaContato {

    // Conjunto onde os contatos sao armazenados
    private Set<Contato> contatoSet;

    // Construtor que inicializa o HashSet
    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    // Metodo para adicionar um contato ao conjunto
    // Obs: ha um pequeno erro de digitacao no nome do metodo: 'adiciorContato' em vez de 'adicionarContato'
    public void adiciorContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Exibe todos os contatos cadastrados
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    // Pesquisa contatos cujo nome comeca com o parametro informado
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    // Atualiza o numero de um contato com base no nome (ignora maiusculas/minusculas)
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    // Metodo principal para testar a funcionalidade da agenda
    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        // Exibe contatos inicialmente (vai estar vazio)
        agendaContato.exibirContatos();

        // Adiciona contatos na agenda
        agendaContato.adiciorContato("Camila",12545);
        agendaContato.adiciorContato("jose",524163);
        agendaContato.adiciorContato("joao",748596);
        agendaContato.adiciorContato("Camila",12545); // Duplicata, sera ignorada pelo Set

        // Exibe os contatos apos insercao
        agendaContato.exibirContatos();

        // Pesquisa contatos com nome "Camila"
        System.out.println(agendaContato.pesquisarPorNome("Camila"));

        // Atualiza o numero do contato "joao"
        System.out.println("Contato Atualizado: "+agendaContato.atualizarNumeroContato("joao", 564645));

        // Pesquisa contato "joao" para verificar atualizacao
        System.out.println(agendaContato.pesquisarPorNome("joao"));
    }

}