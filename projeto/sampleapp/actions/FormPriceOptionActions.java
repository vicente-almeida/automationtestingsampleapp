package projeto.sampleapp.actions;

import org.openqa.selenium.WebDriver;

import projeto.sampleapp.pageobjects.FormPriceOptionObjects;

public class FormPriceOptionActions {

	static FormPriceOptionObjects objSelectPriceOption;

	public FormPriceOptionActions(WebDriver driver) {
		objSelectPriceOption = new FormPriceOptionObjects(driver);
	}

	public void selectPriceOption() {

		objSelectPriceOption.getInputPrice().click();
		objSelectPriceOption.getClickBtnNext().click();

	}

}
