package com.example.GRASP.PadraoIndirecao;

import com.example.GRASP.PadraoPolimorfismo.Midia;

public class Biblioteca4 {
    private RepositorioDeMidias repositorio;

    // O repositório é injetado no construtor
    public Biblioteca4(RepositorioDeMidias repositorio) {
        this.repositorio = repositorio;
    }

    // Adiciona mídia usando o repositório
    public void adicionarMidia(Midia midia) {
        repositorio.adicionarMidia(midia);
        System.out.println("Mídia adicionada: " + midia.getTitulo());
    }

    // Exibe todas as mídias do repositório
    public void exibirMidias() {
        for (Midia midia : repositorio.listarMidias()) {
            midia.exibirDetalhes();
        }
    }
}

