package br.com.fabriciocurvello.TesteUnitarioBasicoJUnit.model;

import org.junit.Assert;
import org.junit.Test;

public class ContrachequeTest {

	@Test
	public void relatiorioTest() {
		// Cenario
		String nomeTest = "Manuel";
		double salarioBrutoTest = 6000.00;
		double totalDescontosTest = 1000.00;
		Contracheque cTest = new Contracheque(nomeTest, salarioBrutoTest, totalDescontosTest);

		// Ação
		cTest.relatorio();

		// Verificação
		Assert.assertEquals("Falha no atributo nome", nomeTest, cTest.getNome());
		Assert.assertEquals("Falha no atributo salarioBruto", salarioBrutoTest, cTest.getSalarioBruto(), 0.01);
		Assert.assertEquals("Falha no atributo totalDescontos", totalDescontosTest, cTest.getTotalDescontos(), 0.01);
		Assert.assertEquals("Falha no atributo salarioLiquido", (salarioBrutoTest - totalDescontosTest), cTest.getSalarioLiquido(), 0.01);
	}

}



