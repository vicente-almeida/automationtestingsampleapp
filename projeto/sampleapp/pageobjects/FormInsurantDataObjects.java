
package projeto.sampleapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormInsurantDataObjects {

	private WebDriver driver;

	@FindBy(id = "firstname")
	private WebElement inputFirstName;

	@FindBy(id = "lastname")
	private WebElement inputLasttName;

	@FindBy(id = "birthdate")
	private WebElement inputDateOfBirth;

	@FindBy(className = "ideal-radio")
	private WebElement clickGender;

	@FindBy(id = "streetaddress")
	private WebElement inputStreet;

	@FindBy(id = "country")
	private WebElement selectCountry;

	@FindBy(id = "zipcode")
	private WebElement inputZipCode;

	@FindBy(id = "city")
	private WebElement inputCity;

	@FindBy(id = "occupation")
	private WebElement selectOccupation;

	@FindBy(className = "ideal-check")
	private WebElement selectHobbies;

	@FindBy(id = "website")
	private WebElement inputWebSite;

	@FindBy(id = "enterproductdata")
	private WebElement lnkProductData;

	public FormInsurantDataObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getInputFirstName() {
		return inputFirstName;
	}

	public void setInputFirstName(WebElement inputFirstName) {
		this.inputFirstName = inputFirstName;
	}

	public WebElement getInputLasttName() {
		return inputLasttName;
	}

	public void setInputLasttName(WebElement inputLasttName) {
		this.inputLasttName = inputLasttName;
	}

	public WebElement getInputDateOfBirth() {
		return inputDateOfBirth;
	}

	public void setInputDateOfBirth(WebElement inputDateOfBirth) {
		this.inputDateOfBirth = inputDateOfBirth;
	}

	public WebElement getClickGender() {
		return clickGender;
	}

	public void setClickGender(WebElement clickGender) {
		this.clickGender = clickGender;
	}

	public WebElement getInputStreet() {
		return inputStreet;
	}

	public void setInputStreet(WebElement inputStreet) {
		this.inputStreet = inputStreet;
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public void setSelectCountry(WebElement selectCountry) {
		this.selectCountry = selectCountry;
	}

	public WebElement getInputZipCode() {
		return inputZipCode;
	}

	public void setInputZipCode(WebElement inputZipCode) {
		this.inputZipCode = inputZipCode;
	}

	public WebElement getInputCity() {
		return inputCity;
	}

	public void setInputCity(WebElement inputCity) {
		this.inputCity = inputCity;
	}

	public WebElement getSelectOccupation() {
		return selectOccupation;
	}

	public void setSelectOccupation(WebElement selectOccupation) {
		this.selectOccupation = selectOccupation;
	}

	public WebElement getSelectHobbies() {
		return selectHobbies;
	}

	public void setSelectHobbies(WebElement selectHobbies) {
		this.selectHobbies = selectHobbies;
	}

	public WebElement getInputWebSite() {
		return inputWebSite;
	}

	public void setInputWebSite(WebElement inputWebSite) {
		this.inputWebSite = inputWebSite;
	}

	public WebElement getLnkProductDara() {
		return lnkProductData;
	}

	public void setLnkProductDara(WebElement lnkProductData) {
		this.lnkProductData = lnkProductData;
	}

}
