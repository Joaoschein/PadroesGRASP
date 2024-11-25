package com.example.GRASP.PadraoVariacoesProtegidas;

import java.time.LocalDate;

import java.time.LocalDate;

public class Emprestimo5 {
    private Livro5 livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;
    private EstrategiaCalculoMulta estrategiaMulta;

    public Emprestimo5(Livro5 livro, String nomeDoUsuario, LocalDate dataDeDevolucao, EstrategiaCalculoMulta estrategiaMulta) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
        this.estrategiaMulta = estrategiaMulta;
    }

    public Emprestimo5(Livro5 livro, String nomeDoUsuario, String emailDoUsuario, LocalDate dataDeDevolucao) {
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDate getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public Livro5 getLivro() {
        return livro;
    }

    // Delegando o cálculo da multa para a estratégia
    public double calcularMulta() {
        return estrategiaMulta.calcularMulta(this);
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() + ", Usuário: " + nomeDoUsuario + ", Data de Devolução: " + dataDeDevolucao;
    }

    public long calcularDiasAtraso() {
        return 0;
    }

    public String getEmailDoUsuario() {
        return "";
    }
}


