package com.ERA.testcases;

import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAdminAndGetJobOrderIdTest {
	WebDriver Admindriver;

	@Test
	public String OpenFleetURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amira\\eclipse-workspace\\Automater\\Driver\\chromedriver.exe");
		Admindriver = new ChromeDriver();
		Admindriver.get("http://eraadmin2.dev.arabiansystems.com/Requests/Index");

		Admindriver.manage().window().maximize();

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Admindriver.findElement(By.id("UserName")).sendKeys("admin");

		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Admindriver.findElement(By.id("Password")).sendKeys("12345678");
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Admindriver.findElement(By.xpath("/html/body/div[2]/div/form/div[3]")).click();
		Admindriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Admindriver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Admindriver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/ul/li[1]/a/span")).click();
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Admindriver.navigate().refresh();
	Thread.sleep(3000);
	Admindriver.navigate().refresh();
	
	
    try {
        WebElement wb;
        JavascriptExecutor js = (JavascriptExecutor)Admindriver;
            wb = Admindriver.findElement(By.xpath("//*[@data-rel='collapse']"));
            js.executeScript("arguments[0].click();", wb);
        } catch (Exception b) {

       throw new NoSuchElementException("kunne ikke finde " );
    }
    Thread.sleep(3000);
		Admindriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Admindriver
				.findElement(By.xpath(
						"/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]/div/input"))
				.sendKeys("72459");
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement myelement = Admindriver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button"));
		JavascriptExecutor jse2 = (JavascriptExecutor)Admindriver;
		jse2.executeScript("arguments[0].scrollIntoView()", myelement); 
//		Admindriver
//				.findElement(
//						By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/form/div[2]/div/button"))
//				.click();
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String JoborderId = Admindriver
				.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/div/table/tbody/tr[1]/td[5]"))
				.getText();
		Admindriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(JoborderId);
		return JoborderId;

//		Admindriver.close();
	}

}
