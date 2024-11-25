package com.example.GRASP.PadraoIndirecao;

import com.example.GRASP.PadraoPolimorfismo.Midia;

import java.util.ArrayList;
import java.util.List;

public class RepositorioMidiaMemoria implements RepositorioDeMidias{
    private List<Midia> midias;

    public RepositorioMidiaMemoria() {
        this.midias = new ArrayList<>();
    }

    @Override
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    @Override
    public List<Midia> listarMidias() {
        return midias;
    }
}
