package collectionsJavaApi.set.Pesquisa.Biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPlubicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPlubicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro:{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao='" + anoPublicacao + '\'' +
                '}';
    }
}
