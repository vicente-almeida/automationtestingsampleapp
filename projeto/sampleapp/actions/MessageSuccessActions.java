package projeto.sampleapp.actions;

import org.openqa.selenium.WebDriver;

import projeto.sampleapp.pageobjects.MessageSuccessObjects;

public class MessageSuccessActions {
	
	static MessageSuccessObjects objMessageSuccess;
	
	public MessageSuccessActions (WebDriver driver) {
		objMessageSuccess = new MessageSuccessObjects(driver);
	}
	
	public void messageSuccess() {
		
		objMessageSuccess.getClickBtnOk().click();
		
	
		
	}

}
