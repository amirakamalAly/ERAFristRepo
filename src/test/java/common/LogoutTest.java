package common;

import org.testng.annotations.Test;
import com.ERA.base.Base;
import com.ERA.screens.ClcikUpdateLater;
import com.ERA.screens.ClickloginbuttonfromHomescreen;
import com.ERA.screens.InvalidPickUPLocationScreen;

public class LogoutTest extends Base {
	@Test(priority = 14)
	public void clickMenuIconFromHome()
	{
		InvalidPickUPLocationScreen Dvw = new InvalidPickUPLocationScreen();
		Dvw.clickMenuIconFromHome();
	}
	@Test(priority = 15)
	public void clickLogout()
	{
		ClickloginbuttonfromHomescreen Dvw = new ClickloginbuttonfromHomescreen();
		Dvw.Logout();
	}
	@Test(priority = 16) 
	public void clickSkip() 
	{
		ClcikUpdateLater skipupdatetest = new ClcikUpdateLater();
		skipupdatetest.clcikUpdateLaterbu();
			}
}
