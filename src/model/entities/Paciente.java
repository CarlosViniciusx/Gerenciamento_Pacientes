package model.entities;

import model.enums.Sexo;

public class Paciente {
    private String nome;
    private int idade;
    private String estadoCivil;
    private String endereco;
    private String profissao;
    private Doenca doenca;
    private Sexo sexo;

    public Paciente(String nome, int idade, String estadoCivil, String endereco, String profissao, Doenca doenca, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.profissao = profissao;
        this.doenca = doenca;
        this.sexo = sexo;
    }

    public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public Doenca getDoenca() {
		return doenca;
	}

	public Sexo getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("======================================\n");
		sb.append("Nome: " + nome + "\n");
		sb.append("Idade: " + idade + "\n");
		sb.append("Sexo: " + getSexo() + "\n");
		sb.append("Estado Civil: " + estadoCivil + "\n");
		sb.append("Endereço: " + endereco + "\n");
		sb.append("Profissão: " + profissao + "\n");
		sb.append("Doença: " + doenca);
		sb.append("======================================\n");
		
		return sb.toString();
	}
}