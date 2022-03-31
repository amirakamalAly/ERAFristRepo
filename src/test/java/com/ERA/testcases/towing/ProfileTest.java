package com.ERA.testcases.towing;

import com.ERA.base.Base;

import com.ERA.screens.addNormalTowingRequest;
import com.ERA.screens.profile.profiletabFromMenu;

import org.testng.annotations.Test;


public class ProfileTest extends Base {

	@Test(priority = 1)
	public void clickprofiletabFromMenu()

	{
		profiletabFromMenu profile = new profiletabFromMenu();
		profile.clickprofiletabFromMenu();

	}
	

}

