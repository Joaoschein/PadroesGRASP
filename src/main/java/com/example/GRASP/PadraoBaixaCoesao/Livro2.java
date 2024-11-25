package com.example.GRASP.PadraoBaixaCoesao;

class Livro2 {
    private String titulo;

    public Livro2(String titulo) {
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
