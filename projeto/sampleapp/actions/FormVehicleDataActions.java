package projeto.sampleapp.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import projeto.sampleapp.pageobjects.FormVehicleDataObjects;

public class FormVehicleDataActions {

	static FormVehicleDataObjects objVehicleData;

	public FormVehicleDataActions(WebDriver driver) {

		objVehicleData = new FormVehicleDataObjects(driver);
	}

	public void enterVehicleData() { 
		objVehicleData.getClickAutomobile().click();
		objVehicleData.getInputMake().sendKeys("Audo");
		objVehicleData.getInputEnginePerformance().sendKeys("250");
		objVehicleData.getInputDateManufacture().sendKeys("08/26/2021");
		objVehicleData.getInputNumberOfSeats().sendKeys("2");
		objVehicleData.getInputFuel().click();
		objVehicleData.getInputFuel().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ENTER);
		objVehicleData.getInputListPrice().sendKeys("800"); 
		objVehicleData.getInputLicensePlate().sendKeys("250958");
		objVehicleData.getInputAnnualMileage().sendKeys("2000");
		objVehicleData.getBtnNextInsurantData().click();

	}

}
