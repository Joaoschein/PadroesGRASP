package com.example.GRASP.PadraoVariacoesProtegidas;

import java.time.LocalDate;

// Multa que varia conforme o tipo do livro
public class MultaPorTipo implements EstrategiaCalculoMulta {
    @Override
    public double calcularMulta(Emprestimo5 emprestimo) {
        long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
        if (diasAtraso <= 0) return 0.0;

        // Exemplo: Multa maior para livros mais caros ou raros
        String titulo = emprestimo.getLivro().getTitulo();
        if (titulo.equalsIgnoreCase("O Senhor dos Anéis")) {
            return diasAtraso * 5.0; // Multa maior para títulos premium
        } else {
            return diasAtraso * 1.5; // Multa padrão
        }
    }
}

