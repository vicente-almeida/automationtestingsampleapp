package projeto.sampleapp.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import projeto.sampleapp.pageobjects.FormProductDataObjects;

public class FormProductDataActions {
	static FormProductDataObjects objProductdata;

	public FormProductDataActions(WebDriver driver) {
		objProductdata = new FormProductDataObjects(driver);
	}

	public void enterProductData() {

		objProductdata.getInputDate().click();
	    objProductdata.getInputDate().sendKeys("08/26/2022");
		objProductdata.getSelectInsuranceSum().click();
		objProductdata.getSelectInsuranceSum().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		objProductdata.getSelectMeritRating().click();
		objProductdata.getSelectMeritRating().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		objProductdata.getSelectDamageInsurance().click();
		objProductdata.getSelectDamageInsurance().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		objProductdata.getInputOptionalProducts().click();
		objProductdata.getSelectCourtesyCar().click();
		objProductdata.getSelectCourtesyCar().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		objProductdata.getBtnNextPriceOption().click();

	}

}
