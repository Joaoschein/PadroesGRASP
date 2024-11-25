package com.example.GRASP.PadraoVariacoesProtegidas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca5 {
    private List<Emprestimo5> emprestimos;

    public Biblioteca5() {
        this.emprestimos = new ArrayList<>();
    }

    // Registro de empréstimo com escolha da estratégia de multa
    public void registrarEmprestimo(Livro5 livro, String nomeDoUsuario, LocalDate dataDeDevolucao, EstrategiaCalculoMulta estrategiaMulta) {
        Emprestimo5 emprestimo = new Emprestimo5(livro, nomeDoUsuario, dataDeDevolucao, estrategiaMulta);
        emprestimos.add(emprestimo);
        System.out.println("Empréstimo registrado: Livro \"" + livro.getTitulo() + "\" para " + nomeDoUsuario);
    }

    // Exibe as multas para todos os empréstimos
    public void calcularMultas() {
        for (Emprestimo5 emprestimo : emprestimos) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
            }
        }
    }

    // Devolve um livro
    public void devolverLivro(String tituloDoLivro) {
        for (Emprestimo5 emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(tituloDoLivro) && !emprestimo.isDevolvido()) {
                emprestimo.setDevolvido(true);
                System.out.println("Livro \"" + tituloDoLivro + "\" devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Erro: Livro \"" + tituloDoLivro + "\" não encontrado ou já devolvido.");
    }
}

