package projeto.sampleapp.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import projeto.sampleapp.pageobjects.FormInsurantDataObjects;

public class FormInsurantDataActions {

	static FormInsurantDataObjects objInsurantData;

	public FormInsurantDataActions(WebDriver driver) {
		objInsurantData = new FormInsurantDataObjects(driver);
	}

	public void enterInsurantData() {
		
		objInsurantData.getInputFirstName().sendKeys("Vicente");
		objInsurantData.getInputLasttName().sendKeys("Luiz");
		objInsurantData.getInputDateOfBirth().sendKeys("02/25/1981");
		objInsurantData.getClickGender().click();
		objInsurantData.getInputStreet().sendKeys("Avenida Ipiranga");
		objInsurantData.getSelectCountry().click();
		objInsurantData.getSelectCountry().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		objInsurantData.getInputZipCode().sendKeys("90030130");
		objInsurantData.getInputCity().sendKeys("SÃ£o Paulo");
		objInsurantData.getSelectOccupation().click();
		objInsurantData.getSelectOccupation().sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		objInsurantData.getSelectHobbies().click();
		objInsurantData.getInputWebSite().sendKeys("www.facebook.com");
		objInsurantData.getLnkProductDara().click();
		

	}
 
}
