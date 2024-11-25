package com.example.GRASP.PadraoAltaCoesao;

import com.example.GRASP.PadraoCreator.Livro;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeLivros {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo) {
        livros.add(new Livro(titulo));
        System.out.println("Livro \"" + titulo + "\" adicionado à biblioteca.");
    }

    public Livro encontrarLivro(String titulo) {
        return livros.stream().filter(livro -> livro.getTitulo().equals(titulo)).findFirst().orElse(null);
    }
}
