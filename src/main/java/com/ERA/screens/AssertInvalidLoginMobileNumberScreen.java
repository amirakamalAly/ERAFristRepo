package com.ERA.screens;

import org.testng.asserts.SoftAssert;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AssertInvalidLoginMobileNumberScreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/validationDescription")
	private MobileElement ErrorMessage;

	public void AssertInvalidLoginMobileNumber() {

		SoftAssert softAssert = new SoftAssert();
		String Error = ErrorMessage.getText();

		System.out.println("here is error " + Error);

		String validErrorText = "برجاء إدخال رقم هاتف صحيح. ";

		softAssert.assertEquals(Error, validErrorText);

		softAssert.assertNotNull(Error);
		softAssert.assertAll();
	}

}
