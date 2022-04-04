package Fuel;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CancelFuelRequestScreen;
import com.ERA.screens.addNormalFuelRequestTestScreen;

public class VisaPaymentAddNormalFuelRequestTest  extends Base {

	@Test(priority = 1)
	public void MoveMap()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.Movemap();

	}
	
	
	
	@Test(priority = 2)
	public void Dragsheet()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.dragsheet();

	}
	
	@Test(priority = 3)
	public void selectFuelService()

	{
		addNormalFuelRequestTestScreen Fuel = new addNormalFuelRequestTestScreen();
		Fuel.SelectFuel();

	}
	
	@Test(priority =4)
	public void SelectFuelType()

	{
		addNormalFuelRequestTestScreen Fueltype = new addNormalFuelRequestTestScreen();
		Fueltype.SelectFuelType();

	}
	
	@Test(priority =5)
	public void ConfirmfuelType()

	{
		addNormalFuelRequestTestScreen confirmFueltype = new addNormalFuelRequestTestScreen();
		confirmFueltype.ConfirmfuelType();

	}

	@Test(priority =6)
	public void ConfirmpaymentButton()

	{
		addNormalFuelRequestTestScreen ConfirmpaymentButton = new addNormalFuelRequestTestScreen();
		ConfirmpaymentButton.ConfirmpaymentButton();

	} 
	
	@Test(priority =7)
	public void SelectVisa()

	{
		addNormalFuelRequestTestScreen SelectCash = new addNormalFuelRequestTestScreen();
		SelectCash.SelectVisa();

	}
	
	@Test(priority =8)
	public void ConfirmVisaPayment()

	{
		addNormalFuelRequestTestScreen ConfirmCashPayment = new addNormalFuelRequestTestScreen();
		ConfirmCashPayment.ConfirmVisaPayment();

	}
	
	}
