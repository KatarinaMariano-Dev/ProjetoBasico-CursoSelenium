package br.ce.katarina.test;
import br.ce.katarina.core.BaseTest;
import br.ce.katarina.page.ContasPage;
import br.ce.katarina.page.MenuPage;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest extends BaseTest{

	MenuPage menuPage = new MenuPage();
	ContasPage contaPage = new ContasPage();
	
	@Test
	public void testeInserirConta() {
		menuPage.acessarTelaInserirConta();
		contaPage.setNome("Conta de Teste");
		contaPage.salvar();
		
		Assert.assertEquals("Conta adicionada com sucesso!", contaPage.getMensagemSucesso());
	}
}
