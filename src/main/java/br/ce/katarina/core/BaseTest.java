package br.ce.katarina.core;

import static br.ce.katarina.core.DriverFactory.getDriver;
import static br.ce.katarina.core.DriverFactory.killDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.ce.katarina.page.LoginPage;

public class BaseTest {

	private LoginPage page = new LoginPage();
	@Rule
	public TestName testName = new TestName(); 
	
	@Before
	public void InnitialMethod() {
		page.acessarTelaInicial();
		page.logar("katarinagaldin@gmail.com", "Teste@1234");
	}
	@After
	public void FinalMethod() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) getDriver();
		File arquivo = screen.getScreenshotAs(OutputType.FILE);	
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshots" + File.separator + testName.getMethodName()+".jpg"));
		if(Properties.FECHAR_BROWSER) {
			killDriver();
		}
		
	}
}
