package entities;

public class ItemDeOrcamento {
    private int quantidade;
    private Produto p;

    public ItemDeOrcamento() {}

    public ItemDeOrcamento (Produto produto ,int qualidade){
        p = produto;
        this.quantidade = qualidade;
    }

    public int getQualidade() {
        return quantidade;
    }

    public void setQualidade(int qualidade) {
        this.quantidade = qualidade;
    }

}
