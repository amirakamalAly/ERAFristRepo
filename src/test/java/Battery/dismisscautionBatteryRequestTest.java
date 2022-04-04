package Battery;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;


public class dismisscautionBatteryRequestTest  extends Base {

	
	@Test(priority =1)
	public void MoveMap()

	{
		addBatteryRequestTestScreen map = new addBatteryRequestTestScreen();
		map.mapmove();
		

	}
   
	@Test(priority =2)
	public void DragServiceSheet()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.dragsheet();
		

	}

	@Test(priority =3)
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
	
	@Test(priority =6)
	public void clickBackarrow1()

	{
		addBatteryRequestTestScreen backarrow = new addBatteryRequestTestScreen();
		backarrow.clcikBackarrow();

	}
	@Test(priority =7)
	public void clickBackarrrow2()

	{
		addBatteryRequestTestScreen backarrow = new addBatteryRequestTestScreen();
		backarrow.clcikBackarrow();

	}
		@Test(priority =8)
	public void confirmbackome()

	{
			addBatteryRequestTestScreen confirmbackome = new addBatteryRequestTestScreen();
		confirmbackome.dissmisscaution();

	}	

		@Test(priority =9)
		public void ConfirmSummery2()

		{
			addBatteryRequestTestScreen confrmSummery = new addBatteryRequestTestScreen();
			confrmSummery.cnfirmSummery();
			

		}
		

		@Test(priority =10)
		public void ConfirmBaymnet2()

		{
			addBatteryRequestTestScreen confirmSummery = new addBatteryRequestTestScreen();
			confirmSummery.ConfmBaymnet();
			

		}
		
		@Test(priority =11)
		public void CancelLink()

		{
			addBatteryRequestTestScreen cancelLnk = new addBatteryRequestTestScreen();
			cancelLnk.Cancellink();
			

		}
		
		@Test(priority =12)
		public void CancelBn()

		{
			addBatteryRequestTestScreen cancelBn = new addBatteryRequestTestScreen();
			cancelBn.CancelBn();
			

		}

}
