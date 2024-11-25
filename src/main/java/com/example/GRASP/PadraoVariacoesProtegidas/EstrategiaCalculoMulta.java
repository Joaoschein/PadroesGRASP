package com.example.GRASP.PadraoVariacoesProtegidas;

// Interface para diferentes estratégias de cálculo de multa
public interface EstrategiaCalculoMulta {
    double calcularMulta(Emprestimo5 emprestimo);
}
