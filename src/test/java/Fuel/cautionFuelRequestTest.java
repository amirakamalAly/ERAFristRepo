package Fuel;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addNormalFuelRequestTestScreen;


public class cautionFuelRequestTest  extends Base {

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
	
	@Test(priority = 4)
	public void SelectFuelType()

	{
		addNormalFuelRequestTestScreen Fueltype = new addNormalFuelRequestTestScreen();
		Fueltype.SelectFuelType();

	}
	
	@Test(priority = 5)
	public void ConfirmfuelType()

	{
		addNormalFuelRequestTestScreen confirmFueltype = new addNormalFuelRequestTestScreen();
		confirmFueltype.ConfirmfuelType();

	}

	@Test(priority = 6)
	public void ConfirmpaymentButton()

	{
		addNormalFuelRequestTestScreen ConfirmpaymentButton = new addNormalFuelRequestTestScreen();
		ConfirmpaymentButton.ConfirmpaymentButton();

	} 
	
	@Test(priority = 7)
	public void clickBackarrow1()

	{
		addNormalFuelRequestTestScreen backarrow = new addNormalFuelRequestTestScreen();
		backarrow.clcikBackarrow();

	}
	@Test(priority = 8)
	public void clickBackarrrow2()

	{
		addNormalFuelRequestTestScreen backarrow = new addNormalFuelRequestTestScreen();
		backarrow.clcikBackarrow();

	}
	@Test(priority = 9)
	public void clickBackarrrow3()

	{
		addNormalFuelRequestTestScreen backarrow = new addNormalFuelRequestTestScreen();
		backarrow.clcikBackarrow();

	}
	@Test(priority = 10)
	public void clickBackarrrow4()

	{
		addNormalFuelRequestTestScreen backarrow = new addNormalFuelRequestTestScreen();
		backarrow.clcikBackarrow();

	}
	@Test(priority = 10)
	public void confirmbackome()

	{
		addNormalFuelRequestTestScreen confirmbackome = new addNormalFuelRequestTestScreen();
		confirmbackome.comfirmbackhome();

	}
}
