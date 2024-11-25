package com.example.GRASP.PadraoPolimorfismo;

public class Revista implements Midia {
    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void exibirDetalhes() {

    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String getDescricao() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}
