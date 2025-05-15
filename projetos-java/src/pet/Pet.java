package pet;

// Classe que representa um pet
public class Pet {
    // Nome do pet (final, nao muda)
    private final String name;

    // Indica se o pet esta limpo ou nao
    private boolean clean;

    // Retorna o nome do pet
    public String getName() {
        return name;
    }

    // Retorna se o pet esta limpo
    public boolean isClean() {
        return clean;
    }

    // Define se o pet esta limpo ou nao
    public void setClean(boolean clean) {
        this.clean = clean;
    }

    // Construtor que cria um pet com nome e marca como sujo inicialmente
    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }
}
