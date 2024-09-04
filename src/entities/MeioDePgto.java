package entities;

import java.util.ArrayList;

public class MeioDePgto {
    private static final int numMaxDeParcelas = 3;
    private String nomePgto;
    private int numParcelas;
    private double taxaCartao;
    private ArrayList<MeioDePgto> meioDePgto = new ArrayList<>();

    public MeioDePgto () {}

    public MeioDePgto(String nomePgto, int numParcelas, double taxaCartao) {
        this.nomePgto = nomePgto;
        this.numParcelas = numParcelas;
        this.taxaCartao = taxaCartao;
    }

    public static int getNummaxdeparcelas() {
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
        this.numParcelas = numParcelas;
    }

    public double getTaxaCartao() {
        return taxaCartao;
    }

    public void setTaxaCartao(double taxaCartao) {
        this.taxaCartao = taxaCartao;
    }

}
