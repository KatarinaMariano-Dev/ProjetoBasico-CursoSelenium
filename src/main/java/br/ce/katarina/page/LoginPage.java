package br.ce.katarina.page;
import static br.ce.katarina.core.DriverFactory.getDriver;
import br.ce.katarina.core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		getDriver().get("https://seubarriga.wcaquino.me");
	}
	
	public void setEmail(String email) {
		dsl.escreve("email", email);
	}
	
	public void setSenha(String senha) {
		dsl.escreve("senha", senha);
	}
	
	public void clicarBtnEntrar() {
		dsl.clicarBotaoXpath("//button[.='Entrar']");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		clicarBtnEntrar();
	}
}
