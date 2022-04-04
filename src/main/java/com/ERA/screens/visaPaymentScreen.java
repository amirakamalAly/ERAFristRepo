package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class visaPaymentScreen extends Base {
	//@AndroidFindBy(id = "anotherPayOption")
	//@AndroidFindBy(uiAutomator = "new UiSelector().text(\"+ Pay using another payment option.\")")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[2]/android.view.View[2]/android.view.View[8]")
	public MobileElement link;

	public void link() {
		link.click();

	}

	//@AndroidFindBy(id = "creditCardNumber")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	public MobileElement credit;

	public void addcreditNumber() {
		// TODO Auto-generated method stub
		credit.sendKeys("5204740009900014");
	}

	
	//@AndroidFindBy(id = "expiryMonthCreditCard")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Spinner[1]")
	public MobileElement ExpiryMonth;

	
	public void MonthClick() {
		// TODO Auto-generated method stub
		ExpiryMonth.click();
		
	}


	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
	public MobileElement Feb;

	public void selectFeb() {
		// TODO Auto-generated method stub
		Feb.click();
	}
	
	//@AndroidFindBy(id = "expiryYearCreditCard")
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Spinner[2]")
	public MobileElement YearyMonth;

	
	public void YearClick() {
		// TODO Auto-generated method stub
		YearyMonth.click();
		
	}


	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	public MobileElement year;

	public void selectYear() {
		// TODO Auto-generated method stub
		year.click();
	}
	
	

	//@AndroidFindBy(id ="CVVNumberCreditCard")
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.EditText")
	public MobileElement CSV;

	public void addCSV() {
		// TODO Auto-generated method stub
		CSV.sendKeys("123");
	}
	
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[5]/android.view.View[2]")
	public MobileElement Element1;
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.Spinner[2]")
	public MobileElement Element2;

	public void ScrollUp() {
		Actions act = new Actions(driver);
		act.dragAndDrop(Element2, Element1).build().perform();
	

	}
	
	//@AndroidFindBy(id ="SubmitBillShip")
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View[9]/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View[1]")
	public MobileElement submitBill;
	public void SubmitBillShip() {
		// TODO Auto-generated method stub
		submitBill.click();
		
	}
	
}
