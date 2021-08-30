package projeto.sampleapp.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import projeto.sampleapp.actions.FormInsurantDataActions;
import projeto.sampleapp.actions.FormPriceOptionActions;
import projeto.sampleapp.actions.FormProductDataActions;
import projeto.sampleapp.actions.FormSendQuoteActions;
import projeto.sampleapp.actions.FormVehicleDataActions;
import projeto.sampleapp.actions.MessageSuccessActions;
import suport.Web;

@TestMethodOrder(OrderAnnotation.class)
public class SampleAppTests {

	static WebDriver driver;
	static FormVehicleDataActions actVehicleData;
	static FormInsurantDataActions actInsurantData;
	static FormProductDataActions actProductData;
	static FormPriceOptionActions actPriceOption;
	static FormSendQuoteActions actSendQuote;
	static MessageSuccessActions actMessageSuccess;

	@BeforeAll
	public static void openSampleApp() {

		driver = Web.createChrome();

		driver.get("http://sampleapp.tricentis.com/101/app.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Instâncias das actions

		actVehicleData = new FormVehicleDataActions(driver);
		actInsurantData = new FormInsurantDataActions(driver);
		actProductData = new FormProductDataActions(driver);
		actPriceOption = new FormPriceOptionActions(driver);
		actSendQuote = new FormSendQuoteActions(driver);
		actMessageSuccess = new MessageSuccessActions(driver);

	}

	@Order(1)
	@Test
	public void fillVehicleData() throws Exception {
		System.out.println("Os testes foram iniciados.");
		assertEquals("http://sampleapp.tricentis.com/101/app.php", driver.getCurrentUrl());
		assertTrue(driver.getTitle().contains("Enter Vehicle Data"), "A frase do títutlo da página está errada!");

		actVehicleData.enterVehicleData();

	}

	@Order(2)
	@Test
	public void fillInsurantData() throws Exception {
		assertTrue(driver.getTitle().contains("Enter Insurant Data"), "A frase do título da página está errada!");
		actInsurantData.enterInsurantData();

	}

	@Order(3)
	@Test
	public void fillProductData() throws Exception {
		assertTrue(driver.getTitle().contains("Enter Product Data"), "A frase do título da página está errada!");
		actProductData.enterProductData();
	}

	@Order(4)
	@Test
	public void fillPriceOption() {
		assertTrue(driver.getTitle().contains("Select Price Option"), "A frase do título da página está errada!");
		actPriceOption.selectPriceOption();

	}

	@Order(5)
	@Test
	public void fillSendQuote() {
		assertTrue(driver.getTitle().contains("Send Quote"), "A frase do título da página está errada!");
		actSendQuote.sendQuoteError();

	}

	@Order(6)
	@Test
	public void messageSuccess() {
		assertEquals(driver.findElement(By.cssSelector("body > div.sweet-alert.visible.showSweetAlert > h2")).getText(),
				"Sending e-mail success!");
		actMessageSuccess.messageSuccess(); 

	}

	@Order(7)
	@AfterAll
	static void closeWindow() {
		System.out.println("Os testes foram finalizados.");
		driver.quit();

	}

}
