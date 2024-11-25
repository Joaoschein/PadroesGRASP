package com.example.GRASP.PadraoBaixaCoesao;

import java.util.ArrayList;
import java.util.List;

class GerenciadorDeLivros2 {
    private List<Livro2> livros = new ArrayList<>();

    public void adicionarLivro(String titulo) {
        livros.add(new Livro2(titulo));
        System.out.println("Livro \"" + titulo + "\" adicionado.");
    }

    public Livro2 encontrarLivro(String titulo) {
        return livros.stream().filter(livro -> livro.getTitulo().equals(titulo)).findFirst().orElse(null);
    }
}
