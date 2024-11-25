package com.example.GRASP.PadraoAltaCoesao;

class Livro1 {
    private String titulo;

    public Livro1(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
