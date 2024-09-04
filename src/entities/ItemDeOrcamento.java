package entities;

public class ItemDeOrcamento {
    private int quantidade;
    private Produto p;

    public ItemDeOrcamento() {}

    public ItemDeOrcamento (Produto produto ,int quantidade){
        p = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
