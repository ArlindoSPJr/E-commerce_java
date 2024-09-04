package entities;

public class Pagamento {
    private boolean confirmacao;
    private double valorPgto;
    private MeioDePgto meioDePagto;

    public Pagamento() {}

    public Pagamento(double valorPgto, MeioDePgto meioDePagto) {
        this.valorPgto = valorPgto;
        this.meioDePagto = meioDePagto;
    }

    public void setConfirmacao(boolean confirmacao) {
        this.confirmacao = confirmacao;
    }

    public void setValorPgto(double valorPgto) {
        this.valorPgto = valorPgto;
    }

    public boolean isConfirmacao() {
        return confirmacao;
    }

    public double getValorPgto() {
        return valorPgto;
    }

    public boolean confirmarPgto() {
        return confirmacao;
    }

    public void setMeioDePagto(MeioDePgto meioDePagto) {
        this.meioDePagto = meioDePagto;
    }

    public MeioDePgto getMeioDePagto() {
        return meioDePagto;
    }
}
