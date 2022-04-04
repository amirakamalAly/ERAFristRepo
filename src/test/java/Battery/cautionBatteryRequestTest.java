package Battery;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;


public class cautionBatteryRequestTest  extends Base {

	
	@Test(priority = 1)
	public void MoveMap()

	{
		addBatteryRequestTestScreen map = new addBatteryRequestTestScreen();
		map.mapmove();
		

	}
   
	@Test(priority = 2)
	public void DragServiceSheet()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.dragsheet();
		

	}

	@Test(priority = 3)
	public void SelectBattery()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.selectBattery();
		

	}
   
	
	
	
	@Test(priority =4)
	public void ConfirmSummery()

	{
		addBatteryRequestTestScreen confrmSummery = new addBatteryRequestTestScreen();
		confrmSummery.cnfirmSummery();
		

	}
	


	@Test(priority = 5)
	public void clickBackarrow1()

	{
		addBatteryRequestTestScreen backarrow = new addBatteryRequestTestScreen();
		backarrow.clcikBackarrow();

	}
	@Test(priority = 6)
	public void clickBackarrrow2()

	{
		addBatteryRequestTestScreen backarrow = new addBatteryRequestTestScreen();
		backarrow.clcikBackarrow();

	}
		@Test(priority = 7)
	public void confirmbackome()

	{
			addBatteryRequestTestScreen confirmbackome = new addBatteryRequestTestScreen();
		confirmbackome.comfirmbackhome();

	}	
}
