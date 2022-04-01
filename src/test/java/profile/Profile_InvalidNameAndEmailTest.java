package profile;

import com.ERA.base.Base;
import com.ERA.screens.MenuScreen;
import com.ERA.screens.profile.profiletabFromMenu;

import org.testng.annotations.Test;

public class Profile_InvalidNameAndEmailTest extends Base {

	@Test(priority = 1)
	public void clickprofiletabFromMenu()

	{
		profiletabFromMenu profile = new profiletabFromMenu();
		profile.clickprofiletabFromMenu();

	}

	@Test(dataProvider = "InvalidNameAndEmail", priority = 2)
	public void EditNamewithvalidNumber(String Name, String MobileNumber, String Email)

	{
		profiletabFromMenu Namee = new profiletabFromMenu();
		Namee.EditNamewithInvalidName(Name, MobileNumber, Email);

	}

	@Test(dataProvider = "InvalidNameAndEmail", priority = 3)
	public void EditEmailwithvalidNumber(String Name, String MobileNumber, String Email)

	{
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
		
	@Test(priority =6)
	public void ValidateInvalidName()

	{
		profiletabFromMenu invalidename = new profiletabFromMenu();
		invalidename.ckeckInvalidName();

	}
	
	@Test(dataProvider = "Profiledata", priority = 7)
	public void EditNamewithvalidآName(String Name, String MobileNumber, String Email)

	{
		profiletabFromMenu Namee = new profiletabFromMenu();
		Namee.EditNamewithvalidNumber(Name, MobileNumber, Email);

	}
	@Test(priority = 8)
	public void SaveButton2()

	{
		profiletabFromMenu save = new profiletabFromMenu();
		save.clickSave();

	}

	@Test(priority = 9)
	public void ValidateInvalidEmail()

	{
		profiletabFromMenu invalidemail = new profiletabFromMenu();
		invalidemail.ckeckemail();

	}
	@Test(priority = 10)
	public void ClickMenu()

	{
		MenuScreen Menu = new MenuScreen();
		Menu.ClickMenuIcon();

	}
}
