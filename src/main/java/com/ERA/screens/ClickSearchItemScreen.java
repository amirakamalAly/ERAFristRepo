package com.ERA.screens;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClickSearchItemScreen extends Base {
	@AndroidFindBy (id="com.eci.era:id/details")
	private MobileElement SearchResultItem;
	
	
	public void ClickSearchItem() {
		// TODO Auto-generated method stub
		SearchResultItem.click();
	}

}
//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout
