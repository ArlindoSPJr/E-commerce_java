package test;

import entities.MeioDePgto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMeioDePgto {
    private MeioDePgto meioDePgto;

    @Before
    public void setUp(){
        meioDePgto = new MeioDePgto("", 0, 0);
    }

    @Test
    public void testSetNumParcelasIguaisNumMaxParcelas(){
        meioDePgto.setNumParcelas(3);
        Assert.assertEquals(3,meioDePgto.getNumParcelas());
    }

    @Test
    public void testSetNumParcelasExcedendoNumMaxParcelas(){
        meioDePgto.setNumParcelas(4);
        Assert.assertEquals(0,meioDePgto.getNumParcelas());
    }

    @Test
    public void testSetNomePgto(){
        meioDePgto.setNomePgto("Crédito");
        Assert.assertEquals("Crédito", meioDePgto.getNomePgto());
    }

    @Test
    public void testSetTaxaCartao(){
        meioDePgto.setTaxaCartao(0.03);
        Assert.assertEquals(0.03, meioDePgto.getTaxaCartao(),0);
    }

}
