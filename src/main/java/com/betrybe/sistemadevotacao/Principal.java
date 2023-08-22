package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Javadoc.
 */
public class Principal {

  /**
   * Javadoc.
   * a.
   * b.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    boolean sair = false;
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    while (!sair) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      int opcao = Integer.parseInt(scanner.nextLine());
      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());

        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      } else {
        sair = true;
      }
    }

    sair = false;

    while (!sair) {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      int opcao = Integer.parseInt(scanner.nextLine());
      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.nextLine();
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String numero = scanner.nextLine();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, numero);
      } else {
        sair = true;
      }
    }

    sair = false;

    while (!sair) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      int opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 1) {
        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.nextLine());

        gerenciamentoVotacao.votar(cpf, numero);
      } else if (opcao == 2) {
        System.out.println("Resultado Parcial");
        gerenciamentoVotacao.mostrarResultado();
      } else {
        gerenciamentoVotacao.mostrarResultado();

        sair = true;
      }
    }

    sair = false;

    scanner.close();
  }

}