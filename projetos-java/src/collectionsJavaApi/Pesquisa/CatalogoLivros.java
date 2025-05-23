package collectionsJavaApi.Pesquisa;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo,autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor));
                livrosPorAutor.add(l);
            }

        }
        return livrosPorAutor;
    }

    public List<Livro>pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisaPorTitulo(String titulo){
        Livro livroProTitulo = null;
        if (!livroList .isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroProTitulo = l;
                    break;
                }
            }
        }
        return livroProTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 01","Autor 01", 2024);
        catalogoLivros.adicionarLivro("Livro 01","Autor 01", 2024);
        catalogoLivros.adicionarLivro("Livro 02","Autor 02", 2023);
        catalogoLivros.adicionarLivro("Livro 03","Autor 03", 2022);
        catalogoLivros.adicionarLivro("Livro 04","Autor 04", 2021);
        catalogoLivros.adicionarLivro("Livro 04","Autor 04", 2021);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 02"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2024,2025));
        System.out.println(catalogoLivros.pesquisaPorTitulo("livro 01"));

    }
}
