package Fuel;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CancelFuelRequestScreen;
import com.ERA.screens.addNormalFuelRequestTestScreen;

public class addNormalFuelRequestTest  extends Base {

	@Test(priority = 21)
	public void MoveMap()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.Movemap();

	}
	
	
	
	@Test(priority = 22)
	public void Dragsheet()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.dragsheet();

	}
	
	@Test(priority = 23)
	public void selectFuelService()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.SelectFuel();

	}
	
	@Test(priority = 24)
	public void SelectFuelType()

	{
		addNormalFuelRequestTestScreen Fueltype = new addNormalFuelRequestTestScreen();
		Fueltype.SelectFuelType();

	}
	
	@Test(priority = 25)
	public void ConfirmfuelType()

	{
		addNormalFuelRequestTestScreen confirmFueltype = new addNormalFuelRequestTestScreen();
		confirmFueltype.ConfirmfuelType();

	}

	@Test(priority = 26)
	public void ConfirmpaymentButton()

	{
		addNormalFuelRequestTestScreen ConfirmpaymentButton = new addNormalFuelRequestTestScreen();
		ConfirmpaymentButton.ConfirmpaymentButton();

	} 
	
	@Test(priority = 27)
	public void SelectCash()

	{
		addNormalFuelRequestTestScreen SelectCash = new addNormalFuelRequestTestScreen();
		SelectCash.SelectCash();

	}
	
	@Test(priority = 28)
	public void ConfirmCashPayment()

	{
		addNormalFuelRequestTestScreen ConfirmCashPayment = new addNormalFuelRequestTestScreen();
		ConfirmCashPayment.ConfirmCashPayment();

	}
	
	@Test(priority = 29)
	public void CancelFuelRequest()

	{
		CancelFuelRequestScreen cancellink = new CancelFuelRequestScreen();
		cancellink.confirmCancelFuelRequest();

	}
	
	@Test(priority = 30)
	public void CancelBnFuelRequest()

	{
		CancelFuelRequestScreen cancelBn = new CancelFuelRequestScreen();
		cancelBn.ClickCancelFuelRequest();

	}
}
