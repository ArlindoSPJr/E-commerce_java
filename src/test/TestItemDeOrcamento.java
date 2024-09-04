package test;

import entities.ItemDeOrcamento;
import entities.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestItemDeOrcamento {
    private ItemDeOrcamento itemDeOrcamento;

    @Before
    public void setUp(){
        itemDeOrcamento = new ItemDeOrcamento(new Produto(0, "", 0, 0),0);
    }

    @Test
    public void testSetQuantidae(){
        itemDeOrcamento.setQuantidade(2);
        Assert.assertEquals(2, itemDeOrcamento.getQuantidade());

    }
}
