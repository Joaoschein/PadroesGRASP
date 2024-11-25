package com.example.GRASP.PadraoBaixaCoesao;

import java.time.LocalDate;

class Biblioteca2 {
    private GerenciadorDeLivros2 gerenciadorDeLivros = new GerenciadorDeLivros2();
    private GerenciadorDeEmprestimos2 gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos2();

    public void adicionarLivro(String titulo) {
        gerenciadorDeLivros.adicionarLivro(titulo);
    }

    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro2 livro = gerenciadorDeLivros.encontrarLivro(tituloDoLivro);
        gerenciadorDeEmprestimos.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
    }

    public void devolverLivro(String tituloDoLivro) {
        gerenciadorDeEmprestimos.devolverLivro(tituloDoLivro);
    }

    public void calcularMultas() {
        gerenciadorDeEmprestimos.calcularMultas();
    }
}
