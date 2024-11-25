package com.example.GRASP.PadraoCreator;

// Classe que gerencia a biblioteca
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    // Método para registrar o empréstimo
    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataDeDevolucao) {
        Emprestimo emprestimo = livro.criarEmprestimo(nomeDoUsuario);
        emprestimos.add(emprestimo);
    }

    public void exibirEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
    }

    public void devolverLivro(Livro livro) {
    }

}