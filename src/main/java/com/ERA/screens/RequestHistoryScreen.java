package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RequestHistoryScreen extends Base{
//	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"طلباتي\")")
@AndroidFindBy(id = "com.eci.era:id/itemNavRequests")
	private MobileElement MenuRequestHistory;

	
	public void MenuRequestHistory() {
		// TODO Auto-generated method stub
		MenuRequestHistory.click();
	}

	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView")
	private MobileElement FristItemList;
	public void ClickFristItemRequestHistory() {
		// TODO Auto-generated method stub
		FristItemList.click();
	}
	
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageView")
		public MobileElement listItem1;
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView")
		public MobileElement listItem2;

		public void scrollitems() {
			Actions act = new Actions(driver);
			act.dragAndDrop(listItem2, listItem1).build().perform();

		}
		
		@AndroidFindBy(id = "com.eci.era:id/tripImage")
		public MobileElement item1;
		@AndroidFindBy(id = "com.eci.era:id/tvDriverName")
		public MobileElement item2;
	//	private FindsByAndroidUIAutomator<MobileElement> wd;

		public void scrollitemetails() {
			Actions act = new Actions(driver);
			act.dragAndDrop(item2, item1).build().perform();
		}
			
//			wd = null;
//			MobileElement radioGroup = (MobileElement) wd
//
//					.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//
//					+ ".resourceId(\"com.eci.era:id/constraintLayout\")).scrollIntoView("
//
//					+ "new UiSelector().resourceId(\"com.eci.era:id/tvRequestFeesTxT\"));");
//					radioGroup.click();

						
			@AndroidFindBy(id = "com.eci.era:id/ratingBarImage")
			public MobileElement ratebar;
		

			public void ratedriver() {
				ratebar.click();
	}

			@AndroidFindBy(id = "com.eci.era:id/ib_call")
			public MobileElement calldriver;
			public void calldriver() {
				// TODO Auto-generated method stub
				calldriver.click();
				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));


			}
}
