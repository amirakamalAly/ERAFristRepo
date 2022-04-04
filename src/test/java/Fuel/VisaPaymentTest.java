package Fuel;

import org.testng.annotations.Test;

import com.ERA.base.Base;
import com.ERA.screens.visaPaymentScreen;

public class VisaPaymentTest extends Base {

	@Test(priority = 1)
	public void clcikaddanotherCreditCard()

	{
		visaPaymentScreen clickLink = new visaPaymentScreen();
		clickLink.link();

	}

	@Test(priority = 2)
	public void addcreditNumber()

	{
		visaPaymentScreen credit = new visaPaymentScreen();
		credit.addcreditNumber();

	}

	@Test(priority = 3)
	public void clickMonth()

	{
		visaPaymentScreen Month = new visaPaymentScreen();
		Month.MonthClick();

	}

	@Test(priority = 4)
	public void selectFeb()

	{
		visaPaymentScreen feb = new visaPaymentScreen();
		feb.selectFeb();

	}

	@Test(priority = 5)
	public void YearClick()

	{
		visaPaymentScreen year = new visaPaymentScreen();
		year.YearClick();

	}

	@Test(priority = 6)
	public void selectYear()

	{
		visaPaymentScreen Syear = new visaPaymentScreen();
		Syear.selectYear();

	}

	@Test(priority = 7)
	public void addCSV()

	{
		visaPaymentScreen CSV = new visaPaymentScreen();
		CSV.addCSV();

	}
	
	@Test(priority = 8)
	public void ScrollUp()

	{
		visaPaymentScreen scrollup = new visaPaymentScreen();
		scrollup.ScrollUp();

	}
	@Test(priority = 9)
	public void SubmitBillShip()

	{
		visaPaymentScreen bill = new visaPaymentScreen();
		bill.SubmitBillShip();

	}

	
}
