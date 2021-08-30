package projeto.sampleapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageSuccessObjects {
	private WebDriver driver;

	@FindBy(className = "confirm")
	private WebElement clickBtnOk;

	public MessageSuccessObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClickBtnOk() {
		return clickBtnOk;
	}

	public void setClickBtnOk(WebElement clickBtnOk) {
		this.clickBtnOk = clickBtnOk;
	}
	
	

}
