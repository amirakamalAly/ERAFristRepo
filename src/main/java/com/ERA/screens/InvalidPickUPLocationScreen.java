package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.framework.Assert;

public class InvalidPickUPLocationScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/clAddress")
	private MobileElement DEST;

	public void Destinationbox() {

		DEST.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/etSearch")
	private MobileElement SearchResultItem;

	public void SendDestLocation(String Description, String LocationInvalidValue) {

		SearchResultItem.sendKeys(LocationInvalidValue);
	}

	@AndroidFindBy(id = "com.eci.era:id/currentLocation")
	private MobileElement SearchresultItem;

	public void ClickSearchresultItem() {

		SearchresultItem.click();
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"خدمات مساعده الطريق غير متوفره فى هذا المكان حاليا\")")
//@AndroidFindBy (id="com.eci.era:id/svErrorMessage")
	private MobileElement ErrorMessage;

	public void AssertInvalidLocationWithSearch() {
		// TODO Auto-generated method stub

		String Error = ErrorMessage.getText();

		System.out.println("here is error " + Error);

		String validErrorText = "خدمات مساعده الطريق غير متوفره فى هذا المكان حاليا";

		Assert.assertEquals(Error, validErrorText);

		// Assert.assertNotNull(Error);
	}

	@AndroidFindBy(id = "com.eci.era:id/btnMenu")
	private MobileElement MenuIcon;

	public void clickMenuIconFromHome() {
		MenuIcon.click();

	}
	
	@AndroidFindBy(id = "com.eci.era:id/homeContainerItem")
	private MobileElement NewRequest;

	public void ClickNewRequest() {
		NewRequest.click();

		
	}

}
