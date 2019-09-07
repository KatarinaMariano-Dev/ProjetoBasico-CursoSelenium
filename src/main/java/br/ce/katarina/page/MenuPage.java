package br.ce.katarina.page;

import br.ce.katarina.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarTelaInserirConta() {
		dsl.clicarLink("Contas");
		dsl.clicarLink("Adicionar");
	}
}
