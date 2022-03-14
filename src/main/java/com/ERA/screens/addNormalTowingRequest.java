package com.ERA.screens;


import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;




public class addNormalTowingRequest extends Base {
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout")
	public MobileElement towingRequest;

    public void SelectTowing()
{
    	towingRequest.click();	

}
}


	


	

