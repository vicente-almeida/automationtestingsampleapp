package projeto.sampleapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSendQuoteObjects {
	
	private WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement inputEmail;
	
	@FindBy(id = "phone")
	private WebElement inputPhone;
	
	@FindBy(id = "username")
	private WebElement inputUserName;
	
	@FindBy(id = "password")
	private WebElement inputPassword;
	
	@FindBy(id = "confirmpassword")
	private WebElement inputConfirmPassword;
	
	@FindBy(id = "Comments")
	private WebElement inputComments;
	
	@FindBy(id = "sendemail")
	private WebElement clickBtnSend;

	public FormSendQuoteObjects(WebDriver driver) {
    PageFactory.initElements(driver,this);
		this.setDriver(driver);
	}

	public WebElement getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(WebElement inputEmail) {
		this.inputEmail = inputEmail;
	}

	public WebElement getInputPhone() {
		return inputPhone;
	}

	public void setInputPhone(WebElement inputPhone) {
		this.inputPhone = inputPhone;
	}

	public WebElement getInputUserName() {
		return inputUserName;
	}

	public void setInputUserName(WebElement inputUserName) {
		this.inputUserName = inputUserName;
	}

	public WebElement getInputPassword() {
		return inputPassword;
	}

	public void setInputPassword(WebElement inputPassword) {
		this.inputPassword = inputPassword;
	}

	public WebElement getInputConfirmPassword() {
		return inputConfirmPassword;
	}

	public void setInputConfirmPassword(WebElement inputConfirmPassword) {
		this.inputConfirmPassword = inputConfirmPassword;
	}

	public WebElement getInputComments() {
		return inputComments;
	}

	public void setInputComments(WebElement inputComments) {
		this.inputComments = inputComments;
	}

	public WebElement getClickBtnSend() {
		return clickBtnSend;
	}

	public void setClickBtnSend(WebElement clickBtnSend) {
		this.clickBtnSend = clickBtnSend;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	

}
