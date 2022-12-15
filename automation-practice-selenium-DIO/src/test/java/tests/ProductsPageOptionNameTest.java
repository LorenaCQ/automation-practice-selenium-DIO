package tests;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.ProductsPageOptionName;

class ProductsPageOptionNameTest {
	private ProductsPageOptionName productsPage;
	private final String URL = "https://www.saucedemo.com/v1/inventory.html";
	
	@BeforeEach
	void setUp() throws Exception {
		productsPage = new ProductsPageOptionName();
		productsPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		//productsPage.quitWebDriver();
	}

	@Test
	void test() {
		//When
		this.productsPage.viewProductsPage();
		
		//Then
	    //Assertions.assertEquals("Sauce Labs Onesie", this.productsPage.getTextH1());
	   // Assertions.assertFalse(this.URL.equals(productsPage.getCurrentUrl()));
	}

}
