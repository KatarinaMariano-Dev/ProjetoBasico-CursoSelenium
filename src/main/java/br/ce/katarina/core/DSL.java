package br.ce.katarina.core;

import static br.ce.katarina.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {

	public void escreve(By by, String texto){
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}

	public void escreve(String id_campo, String texto){
		escreve(By.id(id_campo), texto);
	}
	
	public void clicarBotao(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarBotaoXpath(String xpath) {
		clicarBotao(By.xpath(xpath));
	}
	
	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();;
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public String obterTextoPorXpath(String xpath) {
		return obterTexto(By.xpath(xpath));
	}
}
