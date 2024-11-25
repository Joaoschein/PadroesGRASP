package com.example.GRASP.PadraoPolimorfismo;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca3 {
    private List<Midia> midias; // Lista de mídias usando a interface comum

    public Biblioteca3() {
        this.midias = new ArrayList<>();
    }

    // Adiciona uma mídia à biblioteca
    public void adicionarMidia(Midia midia) {
        midias.add(midia);
        System.out.println("Mídia adicionada: " + midia.getDescricao());
    }

    // Exibe informações de todas as mídias
    public void exibirMidias() {
        for (Midia midia : midias) {
            System.out.println(midia.getDescricao());
        }
    }
}

