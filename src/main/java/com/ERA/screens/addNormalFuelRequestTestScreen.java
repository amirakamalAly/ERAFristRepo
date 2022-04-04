package com.ERA.screens;

import org.openqa.selenium.interactions.Actions;

import com.ERA.base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class addNormalFuelRequestTestScreen extends Base{
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
	public MobileElement From;
	@AndroidFindBy(id = "com.eci.era:id/clAddress")
	public MobileElement To;

	public void dragsheet() {
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();

	}
	
	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"التزود بالوقود\")")
	//@AndroidFindBy(xpath = "//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout")
	public MobileElement fuel;

    public void SelectFuel()
{
    	fuel.click();	

}
    
   
	@AndroidFindBy (uiAutomator = "new UiSelector().text(\"سوبر 98\")")
	public MobileElement fuelType;

      

        public void SelectFuelType()
    {
        	fuelType.click();	

    }
        
        @AndroidFindBy(id = "com.eci.era:id/continueBtn")
    	public MobileElement ConfirmfuelType;

          

            public void ConfirmfuelType()
        {
            	ConfirmfuelType.click();	

        }
            
            
            
            @AndroidFindBy(id = "com.eci.era:id/continueBtn")
        	public MobileElement ConfirmpaymentButton;

              

                public void ConfirmpaymentButton()
            {
                	ConfirmpaymentButton.click();	

            }
                
                
                @AndroidFindBy(uiAutomator = "new UiSelector().text(\"نقدي\")")
            	public MobileElement SelectCash;

                  

                    public void SelectCash()
                {
                    	SelectCash.click();	

                }
                
                    @AndroidFindBy(id = "com.eci.era:id/continueBtn")
                	public MobileElement ConfirmCashPayment;

                      

                        public void ConfirmCashPayment()
                    {
                        	ConfirmCashPayment.click();	

                    }


                    	
                		@AndroidFindBy(id = "com.eci.era:id/clAddress")
                		public MobileElement MapElement1;
                		@AndroidFindBy(id = "com.eci.era:id/marker")
                		public MobileElement MapElement2;

                		public void Movemap() {
                			Actions act = new Actions(driver);
                			act.dragAndDrop(MapElement2, MapElement1).build().perform();

                		}

                		 @AndroidFindBy(uiAutomator = "new UiSelector().text(\"بطاقة إئتمانية\")")
                		public MobileElement Visa;
                		
						public void SelectVisa() {
							// TODO Auto-generated method stub
							Visa.click();	
						}

						
					     @AndroidFindBy(id = "com.eci.era:id/continueBtn")
	                	public MobileElement ConfirmVisaPayment;

	                      

	                        public void ConfirmVisaPayment()
	                    {
	                        	ConfirmCashPayment.click();	

	                    }
                
	                    	@AndroidFindBy (id="com.eci.era:id/backImg")
	                    	private MobileElement backarrow;
	                    	public void clcikBackarrow() {
	                    		// TODO Auto-generated method stub
	                    		backarrow.click();
	                    	}	
	                    	
	                    	@AndroidFindBy (id="com.eci.era:id/btnBackToHome")
	                    	private MobileElement comfirmbackhome;
	                    	public void comfirmbackhome() {
	                    		// TODO Auto-generated method stub
	                    		comfirmbackhome.click();
	                    	}	
	                    	
	                    	@AndroidFindBy (id="com.eci.era:id/closeImg")
	                    	private MobileElement dissmisscaution;
	                    	public void dissmisscaution() {
	                    		// TODO Auto-generated method stub
	                    		dissmisscaution.click();
	                    	}	
	                    	
}

    

