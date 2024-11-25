package com.example.GRASP.PadraoCreator;

public class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Método para criar um empréstimo
    public Emprestimo criarEmprestimo(String nomeDoUsuario) {
        return new Emprestimo(this, nomeDoUsuario);
    }
}
