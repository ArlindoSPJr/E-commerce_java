package entities;

public class Endereco {
    private int codEndereco;
    private String logradouro;
    private int numero;
    private String completo;
    private String bairro;
    private int cep;
    private String cidade;
    private String estado;

    public Endereco() {}

    public Endereco(
            int codEndereco,
            String logradouro,
            int numero,
            String completo,
            String bairro,
            int cep,
            String cidade,
            String estado) {
        this.codEndereco = codEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.completo = completo;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCompleto() {
        return completo;
    }

    public void setCompleto(String completo) {
        this.completo = completo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco [codEndereco=" + codEndereco + ", logradouro=" + logradouro + ", numero=" + numero
                + ", completo=" + completo + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado="
                + estado + "]";
    }

}
