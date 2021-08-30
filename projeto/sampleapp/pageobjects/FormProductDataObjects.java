package projeto.sampleapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormProductDataObjects {

	private WebDriver driver;

	@FindBy(id = "startdate")
	private WebElement inputDate;

	@FindBy(id = "insurancesum")
	private WebElement selectInsuranceSum;

	@FindBy(id = "meritrating")
	private WebElement selectMeritRating;

	@FindBy(id = "damageinsurance")
	private WebElement selectDamageInsurance;

	@FindBy(xpath = "//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	private WebElement inputOptionalProducts;

	@FindBy(id = "courtesycar")
	private WebElement selectCourtesyCar;

	@FindBy(id = "nextselectpriceoption")
	private WebElement btnNextPriceOption;

	public FormProductDataObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getInputDate() {
		return inputDate;
	}

	public void setInputDate(WebElement inputDate) {
		this.inputDate = inputDate;
	}

	public WebElement getSelectInsuranceSum() {
		return selectInsuranceSum;
	}

	public void setSelectInsuranceSum(WebElement selectInsuranceSum) {
		this.selectInsuranceSum = selectInsuranceSum;
	}

	public WebElement getSelectMeritRating() {
		return selectMeritRating;
	}

	public void setSelectMeritRating(WebElement selectMeritRating) {
		this.selectMeritRating = selectMeritRating;
	}

	public WebElement getSelectDamageInsurance() {
		return selectDamageInsurance;
	}

	public void setSelectDamageInsurance(WebElement selectDamageInsurance) {
		this.selectDamageInsurance = selectDamageInsurance;
	}

	public WebElement getInputOptionalProducts() {
		return inputOptionalProducts;
	}

	public void setInputOptionalProducts(WebElement inputOptionalProducts) {
		this.inputOptionalProducts = inputOptionalProducts;
	}

	public WebElement getSelectCourtesyCar() {
		return selectCourtesyCar;
	}

	public void setSelectCourtesyCar(WebElement selectCourtesyCar) {
		this.selectCourtesyCar = selectCourtesyCar;
	}

	public WebElement getBtnNextPriceOption() {
		return btnNextPriceOption;
	}

	public void setBtnNextPriceOption(WebElement btnNextPriceOption) {
		this.btnNextPriceOption = btnNextPriceOption;
	}

}
