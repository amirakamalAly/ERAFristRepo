package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class addBatteryRequestTestScreen extends Base {

	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
	public MobileElement From;
	@AndroidFindBy(id = "com.eci.era:id/clAddress")
	public MobileElement To;

	public void dragsheet() {
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"إعادة تشغيل البطارية\")")
	public MobileElement Battery;

	public void selectBattery() {
		Battery.click();
	

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"حدد طريقة الدفع\")")

	public MobileElement ConfirmSummery;

	public void cnfirmSummery() {

		ConfirmSummery.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/continueBtn")
	public MobileElement ConfirmBaymnet;

	public void ConfmBaymnet() {

		ConfirmBaymnet.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/tvCancelRequest")
	public MobileElement CancelLk;

	public void Cancellink() {

		CancelLk.click();

	}

	@AndroidFindBy(id = "com.eci.era:id/btnCancel")
	public MobileElement cnclBn;

	public void CancelBn() {

		cnclBn.click();

	}

	
		@AndroidFindBy(id = "com.eci.era:id/clAddress")
		public MobileElement MapElement1;
		@AndroidFindBy(id = "com.eci.era:id/marker")
		public MobileElement MapElement2;

		public void mapmove() {
			Actions act = new Actions(driver);
			act.dragAndDrop(MapElement2, MapElement1).build().perform();

		}	
	
    	@AndroidFindBy (id="com.eci.era:id/backImg")
    	private MobileElement backarrow;
    	public void clcikBackarrow() {
    		// TODO Auto-generated method stub
    		backarrow.click();
    	}	
    	
    	@AndroidFindBy (id="com.eci.era:id/btnBackToHome")
    	private MobileElement comfirmbackhome;
    	public void comfirmbackhome() {
    		// TODO Auto-generated method stub
    		comfirmbackhome.click();
    	}	
    	
    	@AndroidFindBy (id="com.eci.era:id/closeImg")
    	private MobileElement dissmisscaution;
    	public void dissmisscaution() {
    		// TODO Auto-generated method stub
    		dissmisscaution.click();
    	}	
}
