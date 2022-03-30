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

	@Test(priority =3)
	public void ClickFristItemRequestHistory()

	{
		RequestHistoryScreen FristItem = new RequestHistoryScreen();
		FristItem.ClickFristItemRequestHistory();
	}
}
