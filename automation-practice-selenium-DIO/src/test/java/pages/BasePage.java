package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
	private WebDriver driver;
	
	public BasePage() {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver"); //diz onde está o driver
		driver = new ChromeDriver(); //referência do objeto
		//driver.manage().window().maximize();
	}
	
	public void visit(String url) {
		this.driver.get(url); //URL que eu quero que meu drive abra
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public void quitWebDriver() {
		this.driver.quit(); //depois de passar por todos os testes, a aplicação é fechada
	}
	
	public WebElement findElement(By locator) {
		return this.driver.findElement(locator);
	}
	
	public void type (String input, By locator) {
		this.driver.findElement(locator).sendKeys(input);
	}
	
	//método para verificar se o elemento está visível na página
	public Boolean isDisplayed(By locator) {
		try {
			return this.driver.findElement(locator).isDisplayed();
		}catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public void click (By locator) {
		this.driver.findElement(locator).click();
	}
	
	public String getText (By locator) {
		return this.driver.findElement(locator).getText();
	}
}
