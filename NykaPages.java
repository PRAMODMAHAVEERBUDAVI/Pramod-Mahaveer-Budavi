package com.Nyka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NykaPages {
	WebDriver driver;
	public NykaPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div/div/section/div[1]")
	WebElement account;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/input")
	WebElement phnormail;
	
	@FindBy(name = "emailMobile")
	WebElement emailmobile;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/section/div/form/div[2]/button")
	WebElement proceed;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div/div[2]/div/section/div/div[2]/form/div[2]/button[1]")
	WebElement login;
	
	@FindBy(xpath ="/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div/div[2]/ul/li[4]/a")
	WebElement appliances;
	
	@FindBy(linkText = "Philips")
	WebElement clickphilips;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div/div/section/div[1]/span")
	WebElement myaccount;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div/div/section/div[1]/span")
	WebElement logout;
	







	public WebElement getAccount() {
		return account;
	}

	

	public WebElement getPhnormail() {
		return phnormail;
	}

	
	public WebElement getEmailmobile() {
		return emailmobile;
	}

	
	public WebElement getProceed() {
		return proceed;
	}

	

	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getLogin() {
		return login;
	}

	
	
	

	

	public WebElement getAppliances() {
		return appliances;
	}

	

	



	public WebElement getClickphilips() {
		return clickphilips;
	}



	



	public WebElement getMyaccount() {
		return myaccount;
	}


	public WebElement getLogout() {
		return logout;
	}

	
	

		

}
