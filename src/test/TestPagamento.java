package test;

import entities.MeioDePgto;
import entities.Pagamento;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPagamento {
    private Pagamento pagamento;

    @Before
    public void setUp(){
        pagamento = new Pagamento(0, new MeioDePgto("Crédito", 3, 0));
    }

    @Test
    public void testSetConfirmarPgtoTrue(){
        pagamento.setConfirmacao(true);
        Assert.assertTrue( pagamento.confirmarPgto());
    }

    @Test
    public void testSetConfirmarPgtoFalse(){
        pagamento.setConfirmacao(false);
        Assert.assertFalse( pagamento.confirmarPgto());
    }

    @Test
    public void testSetValorPgto(){
        pagamento.setValorPgto(1200);
        Assert.assertEquals(1200, pagamento.getValorPgto(),0);
    }

    @Test
    public void testSetMeioPgto(){
        MeioDePgto meioDePgto = new MeioDePgto("Crédito", 3, 0);
        pagamento.setMeioDePagto(meioDePgto);
        
        Assert.assertEquals("Crédito",pagamento.getMeioDePagto().getNomePgto());
        Assert.assertEquals(3,pagamento.getMeioDePagto().getNumParcelas());
        Assert.assertEquals(0,pagamento.getMeioDePagto().getTaxaCartao(),0);
    }
}
