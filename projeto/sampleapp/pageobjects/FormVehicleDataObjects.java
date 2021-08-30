package projeto.sampleapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormVehicleDataObjects {

	private WebDriver driver;

	@FindBy(id = "nav_automobile")
	private WebElement clickAutomobile;

	@FindBy(id = "make")
	private WebElement inputMake;

	@FindBy(id = "engineperformance")
	private WebElement inputEnginePerformance;

	@FindBy(id = "dateofmanufacture")
	private WebElement inputDateManufacture;

	@FindBy(id = "numberofseats")
	private WebElement inputNumberOfSeats;

	@FindBy(id = "fuel")
	private WebElement inputFuel;

	@FindBy(id = "listprice")
	private WebElement inputListPrice;

	@FindBy(id = "licenseplatenumber")
	private WebElement inputLicensePlate;

	@FindBy(id = "annualmileage")
	private WebElement inputAnnualMileage;
	
	@FindBy(id = "nextenterinsurantdata")
	private WebElement btnNextInsurantData;

	public FormVehicleDataObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickAutomobile() {
		return clickAutomobile;
	}

	public void setClickAutomobile(WebElement clickAutomobile) {
		this.clickAutomobile = clickAutomobile;
	}

	public WebElement getInputMake() {
		return inputMake;
	}

	public void setInputMake(WebElement inputMake) {
		this.inputMake = inputMake;
	}

	public WebElement getInputEnginePerformance() {
		return inputEnginePerformance;
	}

	public void setInputEnginePerformance(WebElement inputEnginePerformance) {
		this.inputEnginePerformance = inputEnginePerformance;
	}

	public WebElement getInputDateManufacture() {
		return inputDateManufacture;
	}

	public void setInputDateManufacture(WebElement inputDateManufacture) {
		this.inputDateManufacture = inputDateManufacture;
	}

	public WebElement getInputNumberOfSeats() {
		return inputNumberOfSeats;
	}

	public void setInputNumberOfSeats(WebElement inputNumberOfSeats) {
		this.inputNumberOfSeats = inputNumberOfSeats;
	}

	public WebElement getInputFuel() {
		return inputFuel;
	}

	public void setInputFuel(WebElement inputFuel) {
		this.inputFuel = inputFuel;
	}

	public WebElement getInputListPrice() {
		return inputListPrice;
	}

	public void setInputListPrice(WebElement inputListPrice) {
		this.inputListPrice = inputListPrice;
	}

	public WebElement getInputLicensePlate() {
		return inputLicensePlate;
	}

	public void setInputLicensePlate(WebElement inputLicensePlate) {
		this.inputLicensePlate = inputLicensePlate;
	}

	public WebElement getInputAnnualMileage() {
		return inputAnnualMileage;
	}

	public void setInputAnnualMileage(WebElement inputAnnualMileage) {
		this.inputAnnualMileage = inputAnnualMileage;
	}
	
	public WebElement getBtnNextInsurantData() {
		return btnNextInsurantData;
	}

	public void setBtnNextInsurantData(WebElement btnNextInsurantData) {
		this.btnNextInsurantData = btnNextInsurantData;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	
	

}
