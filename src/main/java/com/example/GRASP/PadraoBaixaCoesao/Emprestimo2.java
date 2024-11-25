package com.example.GRASP.PadraoBaixaCoesao;

import java.time.LocalDate;

class Emprestimo2 {
    private Livro2 livro;
    private String nomeDoUsuario;
    private LocalDate dataDeDevolucao;
    private boolean devolvido;

    public Emprestimo2(Livro2 livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        this.livro = livro;
        this.nomeDoUsuario = nomeDoUsuario;
        this.dataDeDevolucao = dataDeDevolucao;
        this.devolvido = false;
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

    public Livro2 getLivro() {
        return livro;
    }

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public double calcularMulta() {
        long diasAtraso = LocalDate.now().toEpochDay() - dataDeDevolucao.toEpochDay();
        double multaPorDia = 2.0;
        return diasAtraso > 0 ? diasAtraso * multaPorDia : 0.0;
    }
}
