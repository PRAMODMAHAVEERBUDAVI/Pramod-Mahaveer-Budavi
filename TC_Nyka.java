package com.Nyka;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utility.ExcelUtility;

public class TC_Nyka extends TestBase {
	@Test
	(priority = 1,dataProvider = "getData")
	public void nykaaccount(String input,String input1) throws Exception {
		nyka.getAccount().click();
		Thread.sleep(5000);
		nyka.getPhnormail().click();
		Thread.sleep(5000);
		nyka.getEmailmobile().sendKeys(input);
		Thread.sleep(5000);
		nyka.getProceed().click();
		Thread.sleep(5000);
		nyka.getPassword().sendKeys(input1);
		Thread.sleep(5000);
		nyka.getLogin().click();
		Thread.sleep(5000);
		WebElement ele= nyka.getAppliances();
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele3=nyka.getClickphilips();
		a.moveToElement(ele3).perform();
		nyka.getClickphilips().click();
		
	}
	@Test(priority = 2)
	public void logout() throws Exception {
		WebElement el1= nyka.getMyaccount();
		a.moveToElement(el1).perform();
		Thread.sleep(5000);
		WebElement ele2= nyka.getLogout();
		a.moveToElement(ele2).perform();
		nyka.getLogout().click();
		Thread.sleep(5000);
	}
	
	
	//exel data prvider
	@DataProvider
	public String[][] getData() throws IOException
	{
	
		String xlPath="C:\\Users\\User\\SeleniumTraining\\SeleniumAutomation\\src\\test\\java\\comtestdata1\\testdata1.xlsx";
		String xlSheet="Sheet1";
		int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet,rowCount);
		
	
		String[][] data=new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xlPath,xlSheet,i,j);
			}
		}	
		return data;		

	
		
	}
	
}
	