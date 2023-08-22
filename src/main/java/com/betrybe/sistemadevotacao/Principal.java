package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GerenciamentoVotacao gerenciamento = new GerenciamentoVotacao();

    boolean continuar = true;

    while (continuar) {
      System.out.println("Menu:");
      System.out.println("1 - Cadastrar pessoa candidata");
      System.out.println("2 - Cadastrar pessoa eleitora");
      System.out.println("3 - Votar");
      System.out.println("4 - Resultado Parcial");
      System.out.println("5 - Finalizar Votação");
      System.out.println("Entre com o número correspondente à opção desejada:");

      int opcao = scanner.nextInt();
      scanner.nextLine(); // Limpar o buffer

      switch (opcao) {
        case 1:
          System.out.println("Entre com o nome da pessoa candidata:");
          String nomeCandidata = scanner.nextLine();
          System.out.println("Entre com o número da pessoa candidata:");
          int numeroCandidata = scanner.nextInt();
          gerenciamento.cadastrarPessoaCandidata(nomeCandidata, numeroCandidata);
          break;
        case 2:
          System.out.println("Entre com o nome da pessoa eleitora:");
          String nomeEleitora = scanner.nextLine();
          System.out.println("Entre com o CPF da pessoa eleitora:");
          String cpfEleitora = scanner.nextLine();
          gerenciamento.cadastrarPessoaEleitora(nomeEleitora, cpfEleitora);
          break;
        case 3:
          System.out.println("Entre com o CPF da pessoa eleitora:");
          String cpfVotante = scanner.nextLine();
          System.out.println("Entre com o número da pessoa candidata:");
          int numeroVotado = scanner.nextInt();
          gerenciamento.votar(cpfVotante, numeroVotado);
          break;
        case 4:
          gerenciamento.mostrarResultadoParcial();
          break;
        case 5:
          gerenciamento.mostrarResultadoFinal();
          continuar = false;
          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    }
  }
}

