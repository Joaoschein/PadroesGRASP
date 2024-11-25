package com.example.GRASP.PadraoPolimorfismo;

public class Livro3 implements Midia {
    private String titulo;
    private String autor;

    public Livro3(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void exibirDetalhes() {

    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}
