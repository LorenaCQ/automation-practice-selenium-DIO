package tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.LoginPage;

class LoginPageTest {
	private LoginPage loginPage;
	private final String URL = "https://www.saucedemo.com";
	
	@BeforeEach
	void setUp() throws Exception {
		loginPage = new LoginPage();
		
		loginPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		loginPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		loginPage.signin();
		
		//then
		Assertions.assertTrue(this.loginPage.getSpanProductsMessage().equals("PRODUCTS"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL)); //verifica se a url muda, porque acessa outra pagina
	}

}
