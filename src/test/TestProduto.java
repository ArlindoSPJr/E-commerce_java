package test;

import entities.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProduto {
    private Produto produto;

    @Before
    public void criarProduto() {
        this.produto = new Produto(1, "Mouse", 65.0, 2);
    }

    @Test
    public void testGetQuantidade() {
        Assert.assertEquals(2, produto.getQuantidade());
    }

    @Test
    public void testGetNome() {
        Assert.assertEquals("Mouse", produto.getNomeProduto());
    }

    @Test
    public void testGetValor() {
        Assert.assertEquals(65.0, produto.getValorProduto(), 0);
    }

    @Test
    public void testGetCodigo() {
        Assert.assertEquals(1, produto.getCodProduto());
    }
}
