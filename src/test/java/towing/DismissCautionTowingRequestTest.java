package towing;

import com.ERA.base.Base;

import com.ERA.screens.addNormalTowingRequest;

import org.testng.annotations.Test;

public class DismissCautionTowingRequestTest extends Base {

	@Test(priority = 1)
	public void selectTowingService()

	{
		addNormalTowingRequest Towing = new addNormalTowingRequest();
		Towing.SelectTowing();

	}

	@Test(priority = 2)
	public void selectNormalTowing()

	{
		addNormalTowingRequest NormalTowing = new addNormalTowingRequest();
		NormalTowing.SelectNormalTowing();

	}

	@Test(priority = 3)
	public void AddingDestination()

	{
		addNormalTowingRequest Ds = new addNormalTowingRequest();
		Ds.Destinationbox();

	}

	@Test(priority = 4)
	public void ClickSearchDest()

	{
		addNormalTowingRequest Dv = new addNormalTowingRequest();
		Dv.DestinationSearch();

	}

	@Test(dataProvider = "Locations", priority = 5)
	public void SendDestLocation(String Description, String LocationValue)

	{
		System.out.println("get location fromExcelsheet  " + LocationValue);
		addNormalTowingRequest Dv = new addNormalTowingRequest();
		Dv.SendDestLocation(Description, LocationValue);

	}

	@Test(priority = 6)
	public void ClickSearchItem()

	{
		addNormalTowingRequest Dvw = new addNormalTowingRequest();
		Dvw.ClickSearchItem();

	}

	@Test(priority = 7)
	public void ConfirmDestination()

	{
		addNormalTowingRequest Dvw = new addNormalTowingRequest();
		Dvw.ConfirmDestination();

	}

	@Test(priority = 8)
	public void clcikBackarrow()

	{
		addNormalTowingRequest backarrow = new addNormalTowingRequest();
		backarrow.clcikBackarrow();

	}

	@Test(priority = 9)
	public void dissmisscaution()

	{
		addNormalTowingRequest confirmbackome = new addNormalTowingRequest();
		confirmbackome.dissmisscaution();

	}

	
}
