package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
	private WebDriver driver;
	private Actions action; //simular ação do mouse clicando em um elemento
	private Select select;
	
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
	
	public void actionMoveToElementPerform(By locator) {
		if(this.action == null) {
			this.action = new Actions(this.driver);
		}
		
		WebElement element = this.driver.findElement(locator);
		action.moveToElement(element).perform();
	}
	
	public void actionMoveToElementClickPerform(By locator) {
		if(this.action == null) {
			this.action = new Actions(this.driver);
		}
		
		WebElement element = this.driver.findElement(locator);
		action.moveToElement(element).click().build().perform();
	}
	
	//metodo de selecionar o filtro dos produtos
	public void selectElementPerform(By locator, String value) {
		select = new Select(findElement(locator));
		select.selectByValue(value);
	}
	
	public void clear (By locator) {
		this.driver.findElement(locator).clear();
		findElement(locator).clear();
	}
}
