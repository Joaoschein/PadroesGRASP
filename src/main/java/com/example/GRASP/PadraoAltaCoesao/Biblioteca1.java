package com.example.GRASP.PadraoAltaCoesao;

import com.example.GRASP.PadraoCreator.Livro;

import java.time.LocalDate;

// Classe que orquestra os gerenciadores
class Biblioteca1 {
    private GerenciadorDeLivros gerenciadorDeLivros = new GerenciadorDeLivros();
    private GerenciadorDeEmprestimos gerenciadorDeEmprestimos = new GerenciadorDeEmprestimos();

    public void adicionarLivro(String titulo) {
        gerenciadorDeLivros.adicionarLivro(titulo);
    }

    public void registrarEmprestimo(String tituloDoLivro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Livro livro = gerenciadorDeLivros.encontrarLivro(tituloDoLivro);
        gerenciadorDeEmprestimos.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
    }

    public void devolverLivro(String tituloDoLivro) {
        gerenciadorDeEmprestimos.devolverLivro(tituloDoLivro);
    }

    public void calcularMultas() {
        gerenciadorDeEmprestimos.calcularMultas();
    }
}
