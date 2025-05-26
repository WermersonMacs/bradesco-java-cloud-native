package collectionsJavaApi.set.OperacoesBasicas.ListaTarefas;

// Classe que representa uma tarefa
public class Tarefa {

    // Atributo que guarda a descricao da tarefa
    private String descricao;

    // Construtor que inicializa a descricao da tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Metodo para obter a descricao da tarefa
    public String getDescricao() {
        return descricao;
    }

    // Sobrescrita do metodo toString para retornar a descricao da tarefa
    @Override
    public String toString() {
        return descricao;
    }
}
