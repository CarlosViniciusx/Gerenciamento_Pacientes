package model.entities;

import model.enums.Gravidade;

public class Doenca {
    private String nome;
    private Gravidade gravidade;

    public Doenca(String nome, Gravidade gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    @Override
    public String toString() {
        return nome + " (Gravidade: " + gravidade + ")";
    }
}