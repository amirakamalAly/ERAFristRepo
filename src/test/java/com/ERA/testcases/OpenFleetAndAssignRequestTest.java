package com.ERA.testcases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFleetAndAssignRequestTest {
	WebDriver FleetMangement;

	@Test
	public void OpenFleetURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		FleetMangement = new ChromeDriver();
		FleetMangement.get("https://support.eas.ae/DispatchListings/ERAListUnscheduledFinCleared");

		FleetMangement.manage().window().maximize();
		((JavascriptExecutor) FleetMangement).executeScript("document.body.style.zoom='80%';");
		FleetMangement.navigate().refresh();
		Thread.sleep(5000);
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.id("UserName")).sendKeys("shivox");

		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.id("Password")).sendKeys("123456789");
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FleetMangement.findElement(By.xpath("//input[@value='Log in']")).click();
		FleetMangement.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String Jobid = (String) new OpenAdminAndGetJobOrderIdTest().OpenFleetURL();
		System.out.println("joborderId" + Jobid);
		FleetMangement.findElement(By.xpath("//input[@placeholder='Search ']")).sendKeys(Jobid);

		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[2]/section/div[3]/div/div/table/tbody/tr/td[9]/input"))
				.click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/form/div[11]/div/input[3]")).click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[5]/div[1]/span/span/input"))
				.sendKeys("Egypt User  02");
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[9]/div/div[3]/ul/li/span[1]")).click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		FleetMangement.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/div[8]/div[2]/input[1]"))
				.click();
		FleetMangement.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(15000);
	//	FleetMangement.close();
	}

}
