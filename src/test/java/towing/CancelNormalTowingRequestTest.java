package towing;

import com.ERA.base.Base;

import com.ERA.screens.addNormalTowingRequest;

import org.testng.annotations.Test;


public class CancelNormalTowingRequestTest extends Base {

	
@Test(priority = 19)
	public void CancelTowingRequest()

	{addNormalTowingRequest Confirm = new addNormalTowingRequest();
	Confirm.confirmCancelTowingRequest();
	}
@Test(priority = 20)
	public void ClickCancelTowingRequest()
{addNormalTowingRequest ConfirmBn = new addNormalTowingRequest();
ConfirmBn.ClickCancelTowingRequest();
}
}

