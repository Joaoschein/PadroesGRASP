/*package com.example.GRASP.PadraoControlador;

import com.example.GRASP.PadraoCreator.Biblioteca;
import com.example.GRASP.PadraoCreator.Emprestimo;
import com.example.GRASP.PadraoCreator.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {
    private Biblioteca biblioteca;

    public BibliotecaController() {
        this.biblioteca = new Biblioteca();
    }

    // Funcionalidade 1: Registrar empréstimos
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        biblioteca.registrarEmprestimo(livro, nomeDoUsuario, dataDeDevolucao);
        System.out.println("Empréstimo registrado: " + livro.getTitulo() + " para " + nomeDoUsuario);
    }

    // Funcionalidade 2: Devolver livros
    public void devolverLivro(Livro livro) {
        biblioteca.devolverLivro(livro);
    }

    // Funcionalidade 3: Exibir multas
    public void exibirMultas() {
        System.out.println("Multas registradas:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                double multa = emprestimo.calcularMulta();
                System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() +
                        ", Livro: " + emprestimo.getLivro().getTitulo() + ", Multa: R$ " + multa);
            }
        }
    }

    // Funcionalidade 4: Consultar livros em atraso
    public void consultarLivrosAtrasados() {
        System.out.println("\nLivros em atraso:");
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (emprestimo.estaAtrasado()) {
                System.out.println(emprestimo);
            }
        }
    }
}*/
