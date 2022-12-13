package dev.lorena.automation.practice.selenium.DIO;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	private WebDriver driver;
	
	@Test
    public void helloSelenium() {
		//setar a variavel webdriver e dizer onde está o drive
		//https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver"); //diz onde está o driver
		driver = new ChromeDriver(); //referência do objeto
		//driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/shop"); //URL que eu quero que meu drive abra
		
		String currentURL = driver.getCurrentUrl(); //pega URL atual
		String expected = "https://todomvc.com/examples/vanillajs";
		
		Assertions.assertEquals(expected, currentURL);
		
		//driver.quit();
    }
	
	
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}
