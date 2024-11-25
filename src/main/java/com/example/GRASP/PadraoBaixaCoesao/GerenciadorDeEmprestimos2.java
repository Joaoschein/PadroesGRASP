package com.example.GRASP.PadraoBaixaCoesao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class GerenciadorDeEmprestimos2 {
    private List<Emprestimo2> emprestimos = new ArrayList<>();

    public void registrarEmprestimo(Livro2 livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        if (livro != null) {
            emprestimos.add(new Emprestimo2(livro, nomeDoUsuario, dataDeDevolucao));
            System.out.println("Empréstimo registrado: \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
        } else {
            System.out.println("Erro: Livro não encontrado.");
        }
    }

    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo2 emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }

    public void calcularMultas() {
        emprestimos.stream()
                .filter(emprestimo -> !emprestimo.isDevolvido())
                .forEach(emprestimo -> {
                    double multa = emprestimo.calcularMulta();
                    System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
                });
    }
}