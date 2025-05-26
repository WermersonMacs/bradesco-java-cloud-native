package collectionsJavaApi.set.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

// Classe que representa uma lista de tarefas
public class ListaTarefas {

    // Lista que armazena objetos do tipo Tarefa
    private List<Tarefa> tarefaList;

    // Construtor padrao que inicializa a lista de tarefas como uma nova ArrayList
    public  ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    // Construtor com parametro, mas ainda assim inicializa uma nova lista vazia
    public ListaTarefas(List<Tarefa> tarefaList) {
        this.tarefaList = new ArrayList<>();
    }

    // Metodo para adicionar uma nova tarefa com a descricao fornecida
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Metodo para remover todas as tarefas que tenham a descricao igual (ignorando maiusculas/minusculas)
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Metodo que retorna o numero total de tarefas na lista
    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }

    // Metodo que imprime no console as descricoes das tarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    // Metodo principal para executar o codigo
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Exibe o numero de tarefas antes de adicionar
        System.out.println("O numero total de elemento na lista e " + listaTarefas.obterNumeroTotalTarefa());

        // Adiciona tarefas a lista
        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 02");
        listaTarefas.adicionarTarefa("Tarefa 03");
        listaTarefas.adicionarTarefa("Tarefa 04");

        // Exibe o numero de tarefas apos adicionar
        System.out.println("O numero total de elemento na lista e " + listaTarefas.obterNumeroTotalTarefa());

        // Remove uma tarefa especifica
        listaTarefas.removerTarefa("Tarefa 01");

        // Exibe o numero de tarefas apos remover
        System.out.println("O numero total de elemento na lista e " + listaTarefas.obterNumeroTotalTarefa());

        // Exibe as descricoes das tarefas restantes
        listaTarefas.obterDescricoesTarefas();
    }
}