package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.framework.Assert;

public class TowingRateButtomsheetScreen extends Base {
	@AndroidFindBy(id = "com.eci.era:id/closeImg")
	private MobileElement XIcon;

	public void Clickdismiss() {
		// TODO Auto-generated method stub
		XIcon.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	private MobileElement ClickButton;

	public void ClickButton() {
		// TODO Auto-generated method stub

		ClickButton.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/ratingBar")
	private MobileElement ratingBar;

	public void clickratingBar() {
		// TODO Auto-generated method stub

		ratingBar.click();
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"الرجاء اختيار احد اسباب التقييم\")")
	private MobileElement errorMessage;

	public void errorMessage() {

		String Error = errorMessage.getText();

		System.out.println("here is error " + Error);

		String validErrorText = "الرجاء اختيار احد اسباب التقييم";

		Assert.assertEquals(Error, validErrorText);

		Assert.assertNotNull(Error);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"مستوى تواصل ضعيف\")")
	private MobileElement Reason;

	public void SelectReason() {
		// TODO Auto-generated method stub
		Reason.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/driverIssues")
	private MobileElement driverIssues;

	public void driverIssuesQuestion() {
		{
			String Errorr = driverIssues.getText();

			System.out.println("here is error " + Errorr);

			String validErrorTextt = "ما هي المشكلة التي واجهتك؟";

			Assert.assertEquals(Errorr, validErrorTextt);

			Assert.assertNotNull(Errorr);

		}
	}

	@AndroidFindBy(id = "com.eci.era:id/ratingBar")
	private MobileElement allstars;

	public void allstarts() throws InterruptedException {
		// TODO Auto-generated method stub
		String s = allstars.getText();
		System.out.println(s);
		//allstars.setValue("10.0");
		Thread.sleep(2000);
//		allstars.click();
//		Thread.sleep(2000);
	}
	@AndroidFindBy(id = "com.eci.era:id/doneRequestBtn")
	private MobileElement doneBtn;

	public void doneRequestBtn() {
		// TODO Auto-generated method stub
		doneBtn.click();
		
	}

}
