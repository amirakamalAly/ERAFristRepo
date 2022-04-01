package profile;

import com.ERA.base.Base;
import com.ERA.screens.MenuScreen;
import com.ERA.screens.profile.profiletabFromMenu;

import org.testng.annotations.Test;

public class Profile_InvalidEmailFormatTest extends Base {

	@Test(priority = 1)
	public void clickprofiletabFromMenu()

	{
		profiletabFromMenu profile = new profiletabFromMenu();
		profile.clickprofiletabFromMenu();

	}

	@Test(dataProvider = "InvalidEmailFromat", priority = 3)
	public void EditEmailwithvalidNumber(String Name, String MobileNumber, String Email) {
		profiletabFromMenu email = new profiletabFromMenu();
		email.EditEmailwithinvalidEmail(Name, MobileNumber, Email);

	}

	@Test(priority = 4)
	public void scrollitems()

	{
		profiletabFromMenu scroll = new profiletabFromMenu();
		scroll.scrollitems();
	}

	@Test(priority = 5)
	public void SaveButton()

	{
		profiletabFromMenu save = new profiletabFromMenu();
		save.clickSave();

	}

	@Test(priority = 9)
	public void ValidateInvalidEmailFormat()

	{
		profiletabFromMenu invalidemailFormat = new profiletabFromMenu();
		invalidemailFormat.ckeckemailFormat();

	}
	@Test(priority = 10)
	public void ClickMenu()

	{
		MenuScreen Menu = new MenuScreen();
		Menu.ClickMenuIcon();

	}

}
