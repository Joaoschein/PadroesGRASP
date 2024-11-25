package com.example.GRASP.PadraoCreator;

public class Emprestimo {
    private Livro livro;
    private String nomeDoUsuario;

    public Emprestimo(Livro livro, String nomeDoUsuario) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
    }

    @Override
    public String toString() {
        return "Livro emprestado: " + livro.getTitulo() + " para " + nomeDoUsuario;
    }

    /*public boolean isDevolvido() {
    }

    public double calcularMulta() {
    }

    public String getNomeDoUsuario() {
    }

    public Livro getLivro() {
    }

    public boolean estaAtrasado() {
    }*/
}
