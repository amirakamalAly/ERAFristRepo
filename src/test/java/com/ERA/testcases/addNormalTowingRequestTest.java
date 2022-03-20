package com.ERA.testcases;

import com.ERA.base.Base;

import com.ERA.screens.addNormalTowingRequest;

import org.testng.annotations.Test;


public class addNormalTowingRequestTest extends Base {

	@Test(priority = 10)
	public void selectTowingService()

	{
		addNormalTowingRequest Towing = new addNormalTowingRequest();
		Towing.SelectTowing();

	}
	
	@Test(priority = 11)
	public void selectNormalTowing()

	{
		addNormalTowingRequest NormalTowing = new addNormalTowingRequest();
		NormalTowing.SelectNormalTowing();

	}

	@Test(priority = 12)
	public void AddingDestination()

	{
		addNormalTowingRequest Ds = new addNormalTowingRequest();
		Ds.Destinationbox();

	}
	
	@Test(priority = 13)
	public void ClickSearchDest()

	{
		addNormalTowingRequest Dv = new addNormalTowingRequest();
		Dv.DestinationSearch();

	}
	
	


	
	@Test(dataProvider ="Locations",priority = 14)
	public void SendDestLocation(String Description,String LocationValue)

	{System.out.println("get location fromExcelsheet  "+ LocationValue );
	addNormalTowingRequest Dv = new addNormalTowingRequest();
		Dv.SendDestLocation(Description,LocationValue);

		
	}

	@Test(priority = 15)
	public void ClickSearchItem()

	{
		addNormalTowingRequest Dvw = new addNormalTowingRequest();
		Dvw.ClickSearchItem();

		
	}
	@Test(priority = 16)
	public void ConfirmDestination()

	{
		addNormalTowingRequest Dvw = new addNormalTowingRequest();
		Dvw.ConfirmDestination();

		
	}
	
	@Test(priority = 17)
	public void ConfirmTowingRequest()

	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
	Confirm.confirmTowingRequest();

		
	}
	
	@Test(priority = 18)
	public void ConfirmPaymentTowingRequest()

	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
	Confirm.confirmPaymrntTowingRequest();

		
	}
	
	@Test(priority = 19)
	public void CancelTowingRequest()

	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
	Confirm.confirmCancelTowingRequest();

		
	}
	
	@Test(priority = 20)
	public void ClickCancelTowingRequest()

	{addNormalTowingRequest ConfirmBn = new addNormalTowingRequest();
	ConfirmBn.ClickCancelTowingRequest();

		
	}
}

