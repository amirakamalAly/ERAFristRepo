package common;

import com.ERA.base.Base;
import com.ERA.screens.MenuScreen;
import org.testng.annotations.Test;


public class MenuTest extends Base {

	@Test(priority = 1)
	public void ClickMenu()

	{
		MenuScreen Menu = new MenuScreen();
		Menu.ClickMenuIcon();

	}
	

}

