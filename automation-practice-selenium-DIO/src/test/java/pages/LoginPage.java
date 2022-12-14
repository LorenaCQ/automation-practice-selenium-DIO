package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	//Locators
	private By emailAddressLocator = By.id("username");
	private By passwordLocator = By.name("password"); 
	private By submitBtnLocator = By.xpath("//*[@id=\\\"customer_login\\\"]/div[1]/form/p[3]/input[3]");
	private By tagTextEmailAccount = By.tagName("strong"); 
	
	public void signin() {
		if(super.isDisplayed(emailAddressLocator)) {
			super.type("lorena123queiroz@gmail.com", emailAddressLocator);
			super.type("123456*/Lo11", passwordLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("Email textbox was not present");
		}
	}
	
	//Verifica se está conseguindo entrar na página
	public String getEmailAccountMessage() {
		return super.getText(tagTextEmailAccount);
	}
}
