package com.ERA.screens.profile;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import junit.framework.Assert;

public class profiletabFromMenu extends Base {

	@AndroidFindBy(id = "com.eci.era:id/itemNavProfile")
	private MobileElement profile;

	public void clickprofiletabFromMenu() {
		// TODO Auto-generated method stub
		profile.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/fullNameEt")
	private MobileElement name;

	public void EditNamewithvalidNumber(String Name, String MobileNumber, String Email) {
		// TODO Auto-generated method stub
		name.sendKeys(Name);
	}

	@AndroidFindBy(id = "com.eci.era:id/emailAddressEt")
	private MobileElement email;

	public void EditEmailwithvalidNumber(String name2, String mobileNumber, String Email) {
		// TODO Auto-generated method stub
		email.sendKeys(Email);

	}

	@AndroidFindBy(id = "com.eci.era:id/emailAddressEt")
	private MobileElement Emaill;

	public void EditEmailwithinvalidEmail(String name2, String mobileNumber, String Email) {
		// TODO Auto-generated method stub
		Emaill.sendKeys(Email);
	}

	@AndroidFindBy(id = "com.eci.era:id/fullNameEt")
	private MobileElement Name;

	public void EditNamewithInvalidName(String Name, String MobileNumber, String Email) {
		// TODO Auto-generated method stub
		name.sendKeys(Name);
	}

	@AndroidFindBy(id = "com.eci.era:id/btnConfirmRequest")
	private MobileElement Save;

	public void clickSave() {
		// TODO Auto-generated method stub
		Save.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/fullNameTv")
	public MobileElement listItem1;
	@AndroidFindBy(id = "com.eci.era:id/mobileNumberTv")
	public MobileElement listItem2;

	public void scrollitems() {
		Actions act = new Actions(driver);
		act.dragAndDrop(listItem2, listItem1).build().perform();
	}

	@AndroidFindBy(id = "com.eci.era:id/emailErrorTv")
	public MobileElement InvalidMail;

	public void ckeckemail() {
		// TODO Auto-generated method stub

		String ErrorInvalidEmail = InvalidMail.getText();
		System.out.println("here is error " + ErrorInvalidEmail);
		String validErrorText = "برجاء إدخال عنوان بريد إلكتروني صحيح";
		Assert.assertEquals(ErrorInvalidEmail, validErrorText);
		Assert.assertNotNull(ErrorInvalidEmail);

	}

	public void ckeckemailFormat() {
		// TODO Auto-generated method stub

		String ErrorInvalidEmail = InvalidMail.getText();
		System.out.println("here is error " + ErrorInvalidEmail);
		String validErrorText = "عنوان بريد إلكتروني مستخدم بالفعل";
		Assert.assertEquals(ErrorInvalidEmail, validErrorText);
		Assert.assertNotNull(ErrorInvalidEmail);

	}

	@AndroidFindBy(id = "com.eci.era:id/errorFullName")
	public MobileElement Invalidname;

	public void ckeckInvalidName() {

		String ErrorInvalidName = Invalidname.getText();
		System.out.println("here is error " + ErrorInvalidName);
		String validErrorText = "  برجاء إدخال اسم صحيح يتكون من 5 وحتى 50 حرف بحد أقصى";
		// Assert.assertEquals(ErrorInvalidName, validErrorText);
		Assert.assertNotNull(ErrorInvalidName);
	}

	@AndroidFindBy(id = "com.eci.era:id/rightTakePhotoBtn")
	public MobileElement ImageOptions;

	public void ClickImageOptions() {
		// TODO Auto-generated method stub
		ImageOptions.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/deletePhotoTV")
	public MobileElement deleteImage;

	public void ClickDeleteImage() {
		// TODO Auto-generated method stub
		deleteImage.click();
	}
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public MobileElement allowPermission;
	
	public void ClickAllowPermission() {
		// TODO Auto-generated method stub
		allowPermission.click();
	}

}
