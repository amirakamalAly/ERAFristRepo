package com.ERA.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.ERA.utils.ExcelUtility;
import com.ERA.utils.LocationExcelUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {

	protected static AndroidDriver<MobileElement> driver;
	protected FileInputStream inputStream;
	protected Properties prop;
	public static ExtentReports extent;
	public static ExtentTest logger;

	public Base() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@BeforeSuite
	public void beforeSuite() {
		extent = new ExtentReports("Reports/index.html");
		extent.addSystemInfo("Framework Type", "Appium page object");
		extent.addSystemInfo("Autor", "Amira");
		extent.addSystemInfo("Enviroment", "Android");
	};

	@AfterSuite
	public void afterSuite() {
		extent.flush();
	}

	@BeforeMethod
	public void beforeMethod(Method method)   {
		logger = extent.startTest(method.getName());
		
	
	};

	@AfterMethod
	public void afterMethod(Method method, ITestResult result) throws InterruptedException {
	//	Thread.sleep(3000);

		File image = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(image, new File("Snapshots/" + method.getName() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String Fullpath = System.getProperty("user.dir") + File.separator + "Snapshots/" + method.getName() + ".jpg";

		if (result.getStatus() == ITestResult.SUCCESS) {

			logger.log(LogStatus.PASS, "the test is passed ");
			logger.log(LogStatus.PASS, logger.addScreenCapture(Fullpath));
		} else if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "the test is failes ");
			logger.log(LogStatus.FAIL, result.getThrowable());
			logger.log(LogStatus.PASS, logger.addScreenCapture(Fullpath));

		} else {
			logger.log(LogStatus.SKIP, "the test is Skipped ");
			logger.log(LogStatus.PASS, logger.addScreenCapture(Fullpath));
		}
	}

	@DataProvider(name = "loginUsers")
	public Object[][] getdata() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String Name = testDataInMap.get(0).get("Name");
		String MobileNumber = testDataInMap.get(0).get("MobileNumber");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		return data;
	}

	@DataProvider(name = "InvalidMobileNumber")
	public Object[][] getInvalidMobileNumberdata() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String Name = testDataInMap.get(1).get("Name");
		String MobileNumber = testDataInMap.get(1).get("MobileNumber");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		return data;
	}

	@DataProvider(name = "EditloginUsers")
	public Object[][] getdataa() throws IOException {
		List<Map<String, String>> testDataInMap = ExcelUtility.getMapTestDataInMap();
		Object[][] data = new Object[1][2];
		String Name = testDataInMap.get(2).get("Name");
		String MobileNumber = testDataInMap.get(2).get("MobileNumber");
		data[0][0] = Name;
		data[0][1] = MobileNumber;
		return data;
	}

	@DataProvider(name = "Locations")
	public Object[][] getdataFromLocationExcelSheet() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(0).get("Description");
		String Value = testDataInMap.get(0).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

	@DataProvider(name = "InvalidLocations")
	public Object[][] getInvaildLocationExcelSheet() throws IOException {
		List<Map<String, String>> testDataInMap = LocationExcelUtility.getMapTestDataInMap();
		Object[][] Location = new Object[1][2];
		String Description = testDataInMap.get(1).get("Description");
		String Value = testDataInMap.get(1).get("Value");
		Location[0][0] = Description;
		Location[0][1] = Value;
		return Location;
	}

//	@Parameters({"deviceName","platformName","platformVersion","udiddevice","skipServerInstallationpro","noSignpro"})
	@Parameters({ "deviceName", "platformName", "platformVersion", "skipServerInstallationpro", "noSignpro" })
	@BeforeTest
//	public void beforeClass(String deviceName,String platformName,String platformVersion,String udiddevice ,boolean noSignpro, boolean skipServerInstallationpro) throws Exception {
	public void beforeTest(String deviceName, String platformName, String platformVersion, boolean noSignpro,
			boolean skipServerInstallationpro) throws Exception {
		File propFile = new File("src\\main\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		File app = new File(prop.getProperty("androidAppPath"));
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("platformName", platformName);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("AUTOMATION_NAME", prop.getProperty("androidAutomationName"));
		caps.setCapability("skipServerInstallation", skipServerInstallationpro);
		caps.setCapability("noSign", noSignpro);
		caps.setCapability("suppressKillServer", true);
		caps.setCapability("appPackage", "com.eci.era");
		caps.setCapability("appActivity", "com.eci.era.splash.presentation.view.SplashActivity");
		caps.setCapability("enforceAppInstall", true);

		// used for mobile device
		// caps.setCapability("udid", udiddevice);
		//////////////////////////////////////////

		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("appiumServerLink")), caps);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(10000);

	}

	@AfterSuite
	public void afterClass() {

//driver.quit();
	}
}
