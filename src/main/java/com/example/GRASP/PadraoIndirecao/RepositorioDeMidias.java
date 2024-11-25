package com.example.GRASP.PadraoIndirecao;

import com.example.GRASP.PadraoPolimorfismo.Midia;

import java.util.List;

public interface RepositorioDeMidias {
    void adicionarMidia(Midia midia);
    List<Midia> listarMidias();
}
