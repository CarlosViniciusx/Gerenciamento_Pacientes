package application;

import java.util.Scanner;

import model.entities.Doenca;
import model.entities.Medico;
import model.entities.Paciente;
import model.enums.Gravidade;
import model.enums.Sexo;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medico medico = new Medico("Vinicius", 26, "Clínico Geral", Sexo.MASCULINO);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\nMenu do Médico:");
            System.out.println("1. Adicionar paciente");
            System.out.println("2. Listar pacientes");
            System.out.println("3. Remover paciente");
            System.out.println("4. Minhas Informações");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o estado civil: ");
                    String estadoCivil = sc.nextLine();
                    System.out.print("Digite o endereço: ");
                    String endereco = sc.nextLine();
                    System.out.print("Digite a profissão: ");
                    String profissao = sc.nextLine();
                    System.out.print("Digite a doença: ");
                    String nomeDoenca = sc.nextLine();
                    System.out.print("Gravidade (LEVE, MODERADA, GRAVE): ");
                    Gravidade gravidade = Gravidade.valueOf(sc.nextLine().toUpperCase());
                    System.out.print("Sexo (MASCULINO, FEMININO): ");
                    Sexo sexo = Sexo.valueOf(sc.nextLine().toUpperCase());

                    Paciente paciente = new Paciente(nome, idade, estadoCivil, endereco, profissao, new Doenca(nomeDoenca, gravidade), sexo);
                    medico.adicionarPaciente(paciente);
                    break;

                case 2:
                	System.out.println("\nLista de Pacientes:");
                    for (Paciente p : medico.getListaPacientes()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do paciente para remover: ");
                    String nomeRemover = sc.nextLine();
                    Paciente pacienteRemover = medico.getListaPacientes().stream()
                        .filter(p -> p.getNome().equalsIgnoreCase(nomeRemover))
                        .findFirst()
                        .orElse(null);
                    if (pacienteRemover != null) {
                        medico.removerPaciente(pacienteRemover);
                    } else {
                        System.out.println("Paciente não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("\nInformações do Médico:");
                    System.out.println("Nome: " + medico.getNome());
                    System.out.println("Idade: " + medico.getIdade());
                    System.out.println("Função: " + medico.getFuncao());
                    System.out.println("Sexo: " + medico.getSexo());
                    break;

                case 0:
                    System.out.println("Fechando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}