package com.ERA.testcases;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.MenuScreen;
import com.ERA.screens.RequestHistoryScreen;

public class RequestHistoryTest extends Base {

	@Test(priority = 1)
	public void ClickMenu()

	{
		MenuScreen Menu = new MenuScreen();
		Menu.ClickMenuIcon();

	}
	@Test(priority = 2)
	public void MenuRequestHistory()

	{
		RequestHistoryScreen History = new RequestHistoryScreen();
		History.MenuRequestHistory();
	}


	@Test(priority =4)
	public void scrollitems()

	{
		RequestHistoryScreen scroll = new RequestHistoryScreen();
		for (int i = 0; i < 2; i++) {
			scroll.scrollitems();
			}
	
	}
	
	
	@Test(priority =5)
	public void ClickFristItemRequestHistory()

	{
		RequestHistoryScreen FristItem = new RequestHistoryScreen();
		FristItem.ClickFristItemRequestHistory();
	}
	@Test(priority =6)
	public void scrollitemetails()

	{
		RequestHistoryScreen FristItem = new RequestHistoryScreen();
		FristItem.scrollitemetails();
	}
	
	@Test(priority =7)
	public void callriver()

	{
		RequestHistoryScreen rate = new RequestHistoryScreen();
		rate.calldriver();
	}
	
	
	
	@Test(priority =8)
	public void ratedriver()

	{
		RequestHistoryScreen rate = new RequestHistoryScreen();
		rate.ratedriver();
	}
}
