package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<String> cpfsComputados;
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
}