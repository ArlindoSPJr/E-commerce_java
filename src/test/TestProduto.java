package test;

import entities.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProduto {
    private Produto produto;

    @Before
    public void criarProduto() {
        this.produto = new Produto(0, "", 0, 0);
    }

    @Test
    public void testSetQuantidade() {
        produto.setQuantidade(2);
        Assert.assertEquals(2, produto.getQuantidade());
    }

    @Test
    public void testGetNome() {
        produto.setNomeProduto("Mouse");
        Assert.assertEquals("Mouse", produto.getNomeProduto());
    }

    @Test
    public void testGetValor() {
        produto.setValorProduto(65);
        Assert.assertEquals(65.0, produto.getValorProduto(), 0);
    }

    @Test
    public void testGetCodigo() {
        produto.setCodProduto(1);
        Assert.assertEquals(1, produto.getCodProduto());
    }
}
