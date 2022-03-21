package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClickloginbuttonfromHomescreen extends Base {

	@AndroidFindBy(id = "com.eci.era:id/loginBtnMain")
	private MobileElement clcikLogin;

	public void Clickloginbutton() {
		clcikLogin.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/countryCodePickerContainer")
	private MobileElement countrycode;

	public void Clickcounrtycode() {
		countrycode.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/searchview_countryTv")
	private MobileElement serchformuber;

	public void Searchcounrtycode() {

		serchformuber.sendKeys("20");
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]")
	private MobileElement selectegypt;

	public void ClickEgypt() {
		// TODO Auto-generated method stub
		selectegypt.click();
	}

	@AndroidFindBy(id = "com.eci.era:id/phoneEdt")
	private MobileElement addMobile;

	public void AddMobileNumberScreen(String name, String mobileNumber) {

		addMobile.sendKeys(mobileNumber);
	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	private MobileElement continueBtn;

	public void continueBtnclk() {
		continueBtn.click();

	}
	
	@AndroidFindBy(id = "com.eci.era:id/back_image_container")
	private MobileElement Back;

	public void ClickBackArrow() {
		Back.click();

	}

	
	@AndroidFindBy(id = "com.eci.era:id/closeImg")
	private MobileElement BackHome;

	public void ClickBackHome() {
		BackHome.click();

	}
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText[1]")
	private MobileElement A;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText[2]")
	private MobileElement B;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText[3]")
	private MobileElement C;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText[4]")
	private MobileElement D;

	public void addInvalidOtp(String a, String b, String c, String d) {

		a = "1";
		b = "1";
		c = "1";
		d = "1";
		A.setValue(a);
		B.setValue(b);
		C.setValue(c);
		D.setValue(d);
	}
	@AndroidFindBy(id = "com.eci.era:id/editbtn")
	private MobileElement Edit;
	public void EditMobileNumber() {
		Edit.click();		
	}
	
	@AndroidFindBy(id = "com.eci.era:id/loginBtn")
	private MobileElement Logout;
	public void Logout() {
		// TODO Auto-generated method stub
		Logout.click();
	}
	
	
	@AndroidFindBy(id = "com.eci.era:id/resendBtn")
	private MobileElement Resend;
	public void ClickResndOTP() {
		// TODO Auto-generated method stub
		Resend.click();
		
	}
}
