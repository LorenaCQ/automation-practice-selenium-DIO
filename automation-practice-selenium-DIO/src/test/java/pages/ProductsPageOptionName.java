package pages;

import org.openqa.selenium.By;

public class ProductsPageOptionName extends BasePage {
	//Locators
	private By optionName = By.cssSelector("#inventory_filter_container > select");
	private By submenuPriceLowToHighLocator = By.cssSelector("#inventory_filter_container > select > option:nth-child(3)");
	private By titlePageH1Locator = By.tagName("div");
	
	public void viewProductsPage() {
		if(super.isDisplayed(optionName)) {
			//super.actionMoveToElementClickPerform(optionName);
			selectElementPerform(optionName, "lohi");
		} else {
			System.out.println("Button was not found");
		}
	}
	//Verifica se conseguiu entrar na página de ABOUT
	public String getTextH1() {
		return super.getText(titlePageH1Locator);
	}
}
