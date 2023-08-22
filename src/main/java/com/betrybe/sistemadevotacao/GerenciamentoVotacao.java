package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public abstract class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  public GerenciamentoVotacao() {
    ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
    ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
    ArrayList<String> cpfsComputados = new ArrayList<>();
  }

}
