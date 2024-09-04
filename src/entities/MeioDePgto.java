package entities;

import java.util.ArrayList;

public class MeioDePgto {
  private static final int numMaxDeParcelas = 3;
  private String nomePgto;
  private int numParcelas;
  private double taxaCartao;
  private ArrayList<Pagamento> pagamentos = new ArrayList<>();

  public MeioDePgto() {}

  public MeioDePgto(String nomePgto, int numParcelas, double taxaCartao) {

    this.nomePgto = nomePgto;
    this.setNumParcelas(numParcelas);
    this.taxaCartao = taxaCartao;
  }

  public static int getNumMaxDeParcelas() {
    return numMaxDeParcelas;
  }

  public String getNomePgto() {
    return nomePgto;
  }

  public void setNomePgto(String nomePgto) {
    this.nomePgto = nomePgto;
  }

  public int getNumParcelas() {
    return numParcelas;
  }

  public void setNumParcelas(int numParcelas) {
    if (numParcelas > numMaxDeParcelas) {
      System.out.println("Erro!, numero de parcelas ultrpassando o limite");
    } else {
      this.numParcelas = numParcelas;
    }
  }

  public double getTaxaCartao() {
    return taxaCartao;
  }

  public void setTaxaCartao(double taxaCartao) {
    this.taxaCartao = taxaCartao;
  }

  @Override
  public String toString() {
    return "MeioDePgto{"
        + "nomePgto='"
        + nomePgto
        + '\''
        + ", numParcelas="
        + numParcelas
        + ", taxaCartao="
        + taxaCartao
        + '}';
  }
}
