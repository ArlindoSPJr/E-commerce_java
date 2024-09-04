package test;

import entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOrcamento {

  private Orcamento orcamento;
  private ItemDeOrcamento itemDeOrcamento;
  private Pagamento pagamento;
  private Pagamento pagamento2;

  @Before
  public void setUp() {
    this.orcamento = new Orcamento(1, 1000);
    this.itemDeOrcamento = new ItemDeOrcamento(new Produto(1, "Mouse", 65, 2),1);
    this.pagamento = new Pagamento(1000, new MeioDePgto("PIX", 1, 0));
    this.pagamento2 = new Pagamento(900, new MeioDePgto("PIX", 1, 0));
  }

  @Test
  public void testGetCodOrcamento() {
    Assert.assertEquals(1, orcamento.getCodOrcamento());
  }

  @Test
  public void testGetValorTotal() {
    Assert.assertEquals(1000, orcamento.getValorTotal(), 0);
  }

  @Test
  public void testAdicionarItem(){
    Assert.assertTrue(orcamento.adicionarItem(itemDeOrcamento));
  }

  @Test
  public void testConfirmarPgtosIgual(){
    orcamento.incrementaPgtos(pagamento);
    Assert.assertTrue(orcamento.confirmarPgtos());
  }

  @Test
  public void testConfirmarPgtosMenor(){
    orcamento.incrementaPgtos(pagamento2);
    Assert.assertFalse(orcamento.confirmarPgtos());
  }

  @Test
  public void testIncrementaPgtos(){
    Assert.assertEquals(0, orcamento.getPagamentos().size());
    orcamento.incrementaPgtos(pagamento);
    Assert.assertEquals(1,orcamento.getPagamentos().size());
  }

}
