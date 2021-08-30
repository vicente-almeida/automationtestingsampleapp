package projeto.sampleapp.actions;

import org.openqa.selenium.WebDriver;

import projeto.sampleapp.pageobjects.FormSendQuoteObjects;

public class FormSendQuoteActions {
	
	static FormSendQuoteObjects objSendQuote;
	
	public FormSendQuoteActions(WebDriver driver) {
		objSendQuote = new FormSendQuoteObjects(driver);
	}
	
	public void sendQuoteError() {
		objSendQuote.getInputEmail().sendKeys("emaildeteste@gmail.com");
		objSendQuote.getInputPhone().sendKeys("11998512304");
		objSendQuote.getInputUserName().sendKeys("Adenilson_Santos");
		objSendQuote.getInputPassword().sendKeys("Vi_1201");
		objSendQuote.getInputConfirmPassword().sendKeys("Vi_1201");
		objSendQuote.getInputComments().sendKeys("Fluxo finalizado.");
		objSendQuote.getClickBtnSend().click();
	}

}
