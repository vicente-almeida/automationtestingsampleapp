package projeto.sampleapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPriceOptionObjects {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")
	private WebElement inputPrice;
	
	@FindBy(id = "nextsendquote")
	private WebElement clickBtnNext;

	public FormPriceOptionObjects(WebDriver driver) {
	PageFactory.initElements(driver,this);	
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getInputPrice() {
		return inputPrice;
	}

	public void setInputPrice(WebElement inputPrice) {
		this.inputPrice = inputPrice;
	}

	public WebElement getClickBtnNext() {
		return clickBtnNext;
	}

	public void setClickBtnNext(WebElement clickBtnNext) {
		this.clickBtnNext = clickBtnNext;
	}

	
	

	
	
	
	
	
	

}
