package com.example.GRASP.PadraoAltaCoesao;

import com.example.GRASP.PadraoCreator.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe que gerencia os empréstimos
class GerenciadorDeEmprestimos {
    private List<Emprestimo1> emprestimos = new ArrayList<>();

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        if (livro != null) {
            //Emprestimo1 emprestimo = new Emprestimo1(livro, nomeDoUsuario, dataDeDevolucao);
            //emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
        } else {
            System.out.println("Erro: Livro não encontrado.");
        }
    }

    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo1 emprestimo : emprestimos) {
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
