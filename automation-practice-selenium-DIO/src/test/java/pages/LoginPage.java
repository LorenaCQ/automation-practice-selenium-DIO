package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	//Locators
	private By usernameLocator = By.id("user-name");
	private By passwordLocator = By.name("password"); 
	private By loginBtnLocator = By.xpath("//*[@id=\"login-button\"]"); //O xpath é utilizado quando o elemento não tem ID ou name
	private By tagTextProducts = By.tagName("span"); 
	
	public void signin() {
		if(super.isDisplayed(usernameLocator)) {
			super.type("standard_user", usernameLocator);
			super.type("secret_sauce", passwordLocator);
			super.click(loginBtnLocator);
		} else {
			System.out.println("Email textbox was not present");
		}
	}
	
	//Verifica se está conseguindo entrar na página
	public String getSpanProductsMessage() {
		return super.getText(tagTextProducts);
	}
}
