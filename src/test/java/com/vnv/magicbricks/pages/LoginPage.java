package com.vnv.magicbricks.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.vnv.magicbricks.utils.SetupDriver;

import junit.framework.Assert;

/*
 *  #Summary: Handles Login functionality of MagicBricks application
 *  #Author: Adeep DV
 *  #Author's Email: 
 *  #Creation Date: 09/03/2022
 *  #Comments:
 */

public class LoginPage {

	 //<editor-fold desc="driver setup">
	 WebDriver driver= SetupDriver.getBrowserName();
	   
	    //<editor-fold desc="locators">
	    By login_link = By.xpath("(//a[text()='Login'])[1]");
	    By login_btn = By.xpath("(//a[text()='Login'])[2]");
	    By email = By.id("emailOrMobile");
	    By next_btn = By.id("btnStep1");
	    By password = By.id("password");
	    By login_btn2 = By.id("btnLogin");
	    By logo = By.xpath("//a[@href='https://www.magicbricks.com/bricks/indexc.html?ODRedirect=Yes']");
	    By titlename=By.xpath("//title[text()=' Sell or Rent Home Online at Magicbricks '])");
	    By profile=By.xpath("//a[@class='mb-header__main__link js-menu-link normal-user']");
	    String exp_title="Sell or Rent Home Online at Magicbricks";


	public void launchWebpage() {
		
		driver.get("https://www.magicbricks.com/property-for-sale-rent-in-Bangalore/residential-real-estate-Bangalore");
		
	}

	public void enterEmail(String s) throws InterruptedException {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(login_link);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(login_btn);
		a.moveToElement(e2).click().build().perform();
		
		ArrayList <String> newtb= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtb.get(1));
		driver.findElement(email).sendKeys(s);

	}

	public void nextButton() {
		
		driver.findElement(next_btn).click();
		
	}

	public void enterPassword(String s) {
		
		driver.findElement(password).sendKeys(s);
	}

	public void loginButton() throws InterruptedException {
		
		driver.findElement(login_btn2).click();
		Thread.sleep(3000);
	}
	
	public void magicBrickstitle() {
		
		driver.findElement(By.xpath("(//a[@class='oppPopup_close md-close'])[2]")).click();
//		String s=driver.getTitle();
//		System.out.println(s);
		Assert.assertTrue(verify());

	}

	private boolean verify() {
		String s=driver.getTitle();
		System.out.println(s);
		return (s.equals(exp_title));
	}

}
