package com.ERA.testcases;

import com.ERA.base.Base;
import com.ERA.screens.CancelTowingRequestScreen;
import com.ERA.screens.ClickSearchItemScreen;
import com.ERA.screens.ConfirmDestinationScreen;
import com.ERA.screens.ConfirmTowingRequestScreen;
import com.ERA.screens.DestinationScreen;
import com.ERA.screens.DestinationValidationScreen;
import com.ERA.screens.SendDestLocationScreen;
import com.ERA.screens.addNormalTowingRequest;
import com.ERA.screens.subRequestScreen;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
		subRequestScreen NormalTowing = new subRequestScreen();
		NormalTowing.SelectNormalTowing();

	}

	@Test(priority = 12)
	public void AddingDestination()

	{
		DestinationScreen Ds = new DestinationScreen();
		Ds.Destinationbox();

	}
	
	@Test(priority = 13)
	public void ClickSearchDest()

	{
		DestinationValidationScreen Dv = new DestinationValidationScreen();
		Dv.DestinationSearch();

	}
	
	@Test(priority = 14)
	public void SendDestLocation()

	{
		SendDestLocationScreen Dv = new SendDestLocationScreen();
		Dv.SendDestLocation();

		
	}

	@Test(priority = 15)
	public void ClickSearchItem()

	{
		ClickSearchItemScreen Dvw = new ClickSearchItemScreen();
		Dvw.ClickSearchItem();

		
	}
	@Test(priority = 16)
	public void ConfirmDestination()

	{
		ConfirmDestinationScreen Dvw = new ConfirmDestinationScreen();
		Dvw.ConfirmDestination();

		
	}
	
	@Test(priority = 17)
	public void ConfirmTowingRequest()

	{ConfirmTowingRequestScreen Confirm = new ConfirmTowingRequestScreen();
	Confirm.confirmTowingRequest();

		
	}
	
	@Test(priority = 18)
	public void ConfirmPaymentTowingRequest()

	{ConfirmTowingRequestScreen Confirm = new ConfirmTowingRequestScreen();
	Confirm.confirmPaymrntTowingRequest();

		
	}
	
	@Test(priority = 19)
	public void CancelTowingRequest()

	{CancelTowingRequestScreen Confirm = new CancelTowingRequestScreen();
	Confirm.confirmCancelTowingRequest();

		
	}
	
	@Test(priority = 20)
	public void ClickCancelTowingRequest()

	{CancelTowingRequestScreen ConfirmBn = new CancelTowingRequestScreen();
	ConfirmBn.ClickCancelTowingRequest();

		
	}
}

