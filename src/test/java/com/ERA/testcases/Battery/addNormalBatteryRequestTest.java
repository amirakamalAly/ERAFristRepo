package com.ERA.testcases.Battery;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.addBatteryRequestTestScreen;

public class addNormalBatteryRequestTest  extends Base {

	
	@Test(priority = 29)
	public void MoveMap()

	{
		addBatteryRequestTestScreen map = new addBatteryRequestTestScreen();
		map.mapmove();
		

	}
   
	@Test(priority = 30)
	public void DragServiceSheet()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.dragsheet();
		

	}

	@Test(priority = 31)
	public void SelectBattery()

	{
		addBatteryRequestTestScreen Battery = new addBatteryRequestTestScreen();
		Battery.selectBattery();
		

	}
   
	
	
	
	@Test(priority = 32)
	public void ConfirmSummery()

	{
		addBatteryRequestTestScreen confrmSummery = new addBatteryRequestTestScreen();
		confrmSummery.cnfirmSummery();
		

	}
	

	@Test(priority = 33)
	public void ConfirmBaymnet()

	{
		addBatteryRequestTestScreen confirmSummery = new addBatteryRequestTestScreen();
		confirmSummery.ConfmBaymnet();
		

	}
	
	@Test(priority = 34)
	public void CancelLink()

	{
		addBatteryRequestTestScreen cancelLnk = new addBatteryRequestTestScreen();
		cancelLnk.Cancellink();
		

	}
	
	@Test(priority = 35)
	public void CancelBn()

	{
		addBatteryRequestTestScreen cancelBn = new addBatteryRequestTestScreen();
		cancelBn.CancelBn();
		

	}
}
