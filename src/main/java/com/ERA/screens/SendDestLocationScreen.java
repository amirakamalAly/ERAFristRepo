package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SendDestLocationScreen  extends Base {

	@AndroidFindBy (id="com.eci.era:id/etSearch")
	private MobileElement DestLocation;

	
	
	//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout
	public void SendDestLocation() {
		// TODO Auto-generated method stub
		DestLocation.sendKeys("مستشفي شفا التخصصي - شارع, التسعين الشمالي، محافظة القاهرة‬");
	}
	
	
	
	

}