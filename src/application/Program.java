package application;

import entities.*;

public class Program {
  public static void main(String[] args) throws Exception {

    Clientes clientes = new Clientes(1, "Arlindo", "0189555068A");
    System.out.println(clientes);

    Produto produto = new Produto(1, "Mouse", 220, 5);
    System.out.println(produto);

    Endereco endereco = new Endereco(1, "Canario", 805, "Casa", "Goaiania", 31950390, "Bh", "MG");
    System.out.println(endereco);

    Categoria categoria = new Categoria(1, "Perifericos", "Tecnologia");
    System.out.println(categoria);

    MeioDePgto meioDePgto = new MeioDePgto("Credito", 3, 0.04);
    System.out.println(meioDePgto);
  }
}
