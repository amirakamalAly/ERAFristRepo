package com.ERA.testcases;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.InvalidPickUPLocationScreen;

public class InvalidPickUPLocationTest extends Base {

	@Test(priority = 12)
	public void AddingDestination()

	{
		InvalidPickUPLocationScreen Ds = new InvalidPickUPLocationScreen();
		Ds.Destinationbox();

	}

	@Test(dataProvider = "InvalidLocations", priority = 13)
	public void SendDestLocation(String Description, String LocationValue)

	{
		System.out.println("get Invalidlocation fromExcelsheet  " + LocationValue);
		InvalidPickUPLocationScreen Dv = new InvalidPickUPLocationScreen();
		Dv.SendDestLocation(Description, LocationValue);

	}

	@Test(priority = 14)
	public void ClickSearchresultItem()

	{
		InvalidPickUPLocationScreen Dv = new InvalidPickUPLocationScreen();
		Dv.ClickSearchresultItem();

	}

	@Test(priority = 15)
	public void AssertInvalidLocationWithSearch()

	{
		InvalidPickUPLocationScreen Dvw = new InvalidPickUPLocationScreen();
		Dvw.AssertInvalidLocationWithSearch();

	}
	
	@Test(priority = 16)
	public void clickMenuIconFromHome()

	{
		InvalidPickUPLocationScreen Dvw = new InvalidPickUPLocationScreen();
		Dvw.clickMenuIconFromHome();

	}
	
	@Test(priority = 17)
	public void ClickNewRequest()

	{
		InvalidPickUPLocationScreen Dvw = new InvalidPickUPLocationScreen();
		Dvw.ClickNewRequest();

	}

}
