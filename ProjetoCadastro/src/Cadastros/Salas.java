package Cadastros;

import java.util.Scanner;
public class Salas {
  private String nome;
  private String lotacao;

  public String getNome (){
    return nome;
  }

  public void setNome(String nome){
    this.nome=nome;
  }

   public String getLotacao (){
    return lotacao;
  }

  public void setLotacao(String lotacao){
    int i = Integer.parseInt(lotacao);
    this.lotacao=lotacao;
  }

}