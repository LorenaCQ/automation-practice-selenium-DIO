package pages;

import org.openqa.selenium.By;

public class ProductsPageOptionName extends BasePage {
	//Locators
	private By optionName = By.cssSelector("#inventory_filter_container > select");
	private By submenuPriceLowToHighLocator = By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[3]");
	private By titlePageH1Locator = By.tagName("div");
	
	public void viewProductsPage() {
		if(super.isDisplayed(optionName)) {
			super.actionMoveToElementClickPerform(optionName);
			super.actionMoveToElementPerform(submenuPriceLowToHighLocator);
			super.actionMoveToElementClickPerform(submenuPriceLowToHighLocator);
		} else {
			System.out.println("Button was not found");
		}
	}
	//Verifica se conseguiu entrar na página de ABOUT
	public String getTextH1() {
		return super.getText(titlePageH1Locator);
	}
}
