package Fuel;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.CancelFuelRequestScreen;


public class CancelFuelRequestTest  extends Base {

	
	@Test(priority = 1)
	public void CancelFuelRequest()

	{
		CancelFuelRequestScreen cancellink = new CancelFuelRequestScreen();
		cancellink.confirmCancelFuelRequest();

	}
	
	@Test(priority = 2)
	public void CancelBnFuelRequest()

	{
		CancelFuelRequestScreen cancelBn = new CancelFuelRequestScreen();
		cancelBn.ClickCancelFuelRequest();

	}
}
