package dev.lorena.automation.practice.selenium.DIO;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver"); //diz onde está o driver
		driver = new ChromeDriver(); //referência do objeto
		//driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/my-account"); //URL que eu quero que meu drive abra
	}

	@AfterEach
	void tearDown() throws Exception { //depois de passar por todos os testes, a aplicação é fechada
		driver.quit();
	}

	@Test
	void test() {
		WebElement emailAddressElement = driver.findElement(By.id("username"));
		emailAddressElement.sendKeys("lorena123queiroz@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("123456*/Lo11");
		
		//O xpath é utilizado quando o elemento não tem ID ou name
		WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		submitBtnElement.click();
		
		WebElement emailAccountStrongElement = driver.findElement(By.tagName("strong"));
		String emailAccount = emailAccountStrongElement.getText();
		
		Assertions.assertTrue(emailAccount.equals("lorena123queiroz"));
	}

}
