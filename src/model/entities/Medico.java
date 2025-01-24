package model.entities;

import java.util.ArrayList;
import java.util.List;

import model.enums.Sexo;

public class Medico {
    private String nome;
    private int idade;
    private String funcao;
    private Sexo sexo;
    private List<Paciente> listaPacientes;

    public Medico(String nome, int idade, String funcao, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.sexo = sexo;
        this.listaPacientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public List<Paciente> getListaPacientes() {
        if(listaPacientes.isEmpty()) {
        	System.out.println("Vazia");
        	return null;	
        }
        return listaPacientes;
    }

    public void adicionarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        listaPacientes.remove(paciente);
    }
}