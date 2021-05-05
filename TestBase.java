package com.Nyka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;



public class TestBase {
	WebDriver driver;
	NykaPages nyka;
	Actions a;
	
	@Parameters({ "Url"})
	@BeforeClass
	
	public void setUp(String Url) {
	 
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\SeleniumTraining\\\\SeleniumAutomation\\\\DriverExecutables\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		nyka=new NykaPages(driver);
		a=new Actions(driver);
		driver.get(Url);
	 }

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
