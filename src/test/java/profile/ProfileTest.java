package profile;

import com.ERA.base.Base;

import com.ERA.screens.profile.profiletabFromMenu;

import org.testng.annotations.Test;

public class ProfileTest extends Base {

	@Test(priority = 1)
	public void clickprofiletabFromMenu()

	{
		profiletabFromMenu profile = new profiletabFromMenu();
		profile.clickprofiletabFromMenu();

	}

	@Test(dataProvider = "Profiledata", priority = 2)
	public void EditNamewithvalidآName(String Name, String MobileNumber, String Email)

	{
		profiletabFromMenu Namee = new profiletabFromMenu();
		Namee.EditNamewithvalidNumber(Name, MobileNumber, Email);

	}

	@Test(dataProvider = "Profiledata", priority = 3)
	public void EditEmailwithvalidEmail(String Name, String MobileNumber, String Email)

	{
		profiletabFromMenu email = new profiletabFromMenu();
		email.EditEmailwithvalidNumber(Name, MobileNumber, Email);

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
	

}
