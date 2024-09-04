package entities;

import java.util.ArrayList;

public class Orcamento {
    private int codOrcamento;
    private double valorTotal;
    private ArrayList<ItemDeOrcamento> itemDeOrcamento = new ArrayList<>();
    public ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public Orcamento() {
    }

    public Orcamento(int codOrcamento, double valorTotal) {
        this.codOrcamento = codOrcamento;
        this.valorTotal = valorTotal;
    }

    public int getCodOrcamento() {
        return codOrcamento;
    }

    public void setCodOrcamento(int codOrcamento) {
        this.codOrcamento = codOrcamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean adicionarItem(ItemDeOrcamento item) {
        if (itemDeOrcamento.add(item)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean confirmarPgtos(){
        double sum = 0;
        for (Pagamento pgtos : this.pagamentos) {
            sum += pgtos.getValorPgto();
        }
        return sum >= this.valorTotal;
    }

    public void incrementaPgtos(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }
}
