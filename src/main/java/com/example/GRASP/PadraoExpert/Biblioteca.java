package com.example.GRASP.PadraoExpert;

import com.example.GRASP.PadraoCreator.Livro;
import com.example.GRASP.PadraoExpert.Emprestimo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Livro livro, String nomeDoUsuario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        Emprestimo emprestimo = new Emprestimo(livro, nomeDoUsuario, dataEmprestimo, dataDevolucao);
        emprestimos.add(emprestimo);
    }

    // Método que exibe as multas, delegando o cálculo para Emprestimo
    public void exibirMultas() {
        for (Emprestimo emprestimo : emprestimos) {
            double multa = emprestimo.calcularMulta();
            System.out.println("Usuário: " + emprestimo.getNomeDoUsuario() + ", Multa: R$ " + multa);
        }
    }
}