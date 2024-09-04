package entities;

public class ItemDeOrcamento {
    private int qualidade;
    private Produto p;

    public ItemDeOrcamento() {}

    public ItemDeOrcamento (Produto produto ,int qualidade){
        p = produto;
        this.qualidade = qualidade;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

}
