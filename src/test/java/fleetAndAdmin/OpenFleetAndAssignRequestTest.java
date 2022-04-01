package fleetAndAdmin;

import org.testng.annotations.Test;

import com.ERA.base.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFleetAndAssignRequestTest extends Base{
	WebDriver FleetMangement;

	@Test(dataProvider = "loginUsers", priority = 11)
	public void OpenFleetURL(String Name,String MobileNumber)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		FleetMangement = new ChromeDriver();
		FleetMangement.get("https://support.eas.ae/DispatchListings/ERAListUnscheduledFinCleared");

		FleetMangement.manage().window().maximize();
		((JavascriptExecutor) FleetMangement).executeScript("document.body.style.zoom='80%';");
		FleetMangement.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.id("UserName")).sendKeys("shivox");

		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.id("Password")).sendKeys("123456789");
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FleetMangement.findElement(By.xpath("//input[@value='Log in']")).click();
		FleetMangement.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String Jobid;
		try {
			
			Jobid = (String) new OpenAdminAndGetJobOrderIdRequestIDTest().OpenAdminURL( Name,MobileNumber);
			
			System.out.println("joborderId  " + Jobid);
			FleetMangement.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys(Jobid);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr/td[9]/input"))
				.click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/form/div[11]/div/input[4]")).click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
try {
	Thread.sleep(3000);
} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[5]/div[1]/span/span/input"))
				.sendKeys("Egypt User  02");
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[9]/div/div[3]/ul/li/span[1]")).click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[8]/div[2]/input[1]"))
				.click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FleetMangement.close();
	}

}
