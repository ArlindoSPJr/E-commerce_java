package entities;

import java.util.ArrayList;

public class Categoria {
    private int codCategoria;
    private String nomeCategoria;
    private String departamento;
    private ArrayList<Produto> produto = new ArrayList<>();

    public Categoria() {}

    public Categoria(int codCategoria, String nomeCategoria, String departamento) {
        this.codCategoria = codCategoria;
        this.nomeCategoria = nomeCategoria;
        this.departamento = departamento;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void addProduto(Produto produto){
        this.produto.add(produto);
    }

    @Override
    public String toString() {
        return "Categoria [codCategoria=" + codCategoria + ", nomeCategoria=" + nomeCategoria + ", departamento="
                + departamento + ", produto=" + produto + "]";
    }
}
