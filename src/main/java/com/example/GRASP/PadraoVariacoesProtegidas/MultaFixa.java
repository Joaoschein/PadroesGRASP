package com.example.GRASP.PadraoVariacoesProtegidas;

import java.time.LocalDate;

// Implementação de multa fixa (2 reais por dia de atraso)
public class MultaFixa implements EstrategiaCalculoMulta {
    @Override
    public double calcularMulta(Emprestimo5 emprestimo) {
        long diasAtraso = LocalDate.now().toEpochDay() - emprestimo.getDataDeDevolucao().toEpochDay();
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}
