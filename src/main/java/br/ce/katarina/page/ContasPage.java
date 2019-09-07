package br.ce.katarina.page;

import br.ce.katarina.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String texto) {
		dsl.escreve("nome", texto);
	}
	
	public void salvar() {
		dsl.clicarBotaoXpath("//button[.='Salvar']");
	}
	
	public String getMensagemSucesso() {
		return dsl.obterTextoPorXpath("//div[@class='alert alert-success']");
	}
}
