package entities;

import java.util.ArrayList;

public class Clientes {
    private int codClientes;
    private String nome;
    private String cpf;
    private ArrayList<Orcamento> orcamento = new ArrayList<>();
    private ArrayList <Endereco> endereco = new ArrayList<>();

    public Clientes() {}

    public Clientes(int codClientes, String nome, String cpf) {
        this.codClientes = codClientes;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCodClientes() {
        return codClientes;
    }

    public void setCodClientes(int codClientes) {
        this.codClientes = codClientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Clientes [codClientes=" + codClientes + ", nome=" + nome + ", cpf=" + cpf + "]";
    }

}
