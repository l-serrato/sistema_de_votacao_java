package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * GerenciamentoVotação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas;
  private final ArrayList<PessoaEleitora> pessoasEleitoras;
  private final ArrayList<String> cpfsComputados;
  /**
   * GerenciamentoVotação.
   */
  public GerenciamentoVotacao() {
    this.pessoasCandidatas = new ArrayList<>();
    this.pessoasEleitoras = new ArrayList<>();
    this.cpfsComputados = new ArrayList<>();
  }

  /**
   * cadastrarPessoaCandidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    if (pessoasCandidatas.isEmpty()) {
      PessoaCandidata novoCandidato = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novoCandidato);
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        if (candidato.getNumero() == numero) {
          System.out.println("Número da pessoa candidata já utilizado!");
          return;
        }
      }
      PessoaCandidata novoCandidato = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novoCandidato);
    }
  }

  /**
   * cadastrarPessoaEleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (pessoasEleitoras.isEmpty()) {
      PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novoEleitor);
    } else {
      for (PessoaEleitora eleitor : pessoasEleitoras) {
        if (eleitor.getCpf().equals(cpf)) {
          System.out.println("Pessoa eleitora já cadastrada!");
          return;
        }
      }
      PessoaEleitora novoEleitor = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novoEleitor);
    }
  }

  /**
   * votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (!cpfsComputados.isEmpty()) {
      for (String cpf : cpfsComputados) {
        if (cpf.equals(cpfPessoaEleitora)) {
          System.out.println("Pessoa eleitora já votou!");
          return;
        }
      }
    }
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numeroPessoaCandidata) {
        candidato.receberVoto();
      }
    }
    cpfsComputados.add(cpfPessoaEleitora);
  }

  /**
   * mostrarResultado.
   */
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    for (PessoaCandidata candidato : pessoasCandidatas) {
      int porcentagemvotos = Math.round(
          (float) candidato.getVotos() / cpfsComputados.size() * 100);
      System.out.println(
          "Nome: " + candidato.getNome() + " - " + candidato.getVotos() + " votos ( "
              + porcentagemvotos + "% )");
    }
    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
