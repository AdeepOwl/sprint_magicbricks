package com.vnv.magicbricks.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.vnv.magicbricks.utils.SetupDriver;

import junit.framework.Assert;

/*
 *  #Summary: Handles Rent functionality of MagicBricks application
 *  #Author: Adeep DV
 *  #Author's Email: adeep.dv@capgemini.com
 *  #Creation Date: 10/03/2022
 *  #Comments:
 */


public class RentPage {

	 //<editor-fold desc="driver setup">
	WebDriver driver= SetupDriver.getBrowserName();
	
	//<editor-fold desc="login locators">
	By login_link = By.xpath("(//a[text()='Login'])[1]");
    By login_btn = By.xpath("(//a[text()='Login'])[2]");
    By email = By.id("emailOrMobile");
    By next_btn = By.id("btnStep1");
    By password = By.id("password");
    By login_btn2 = By.id("btnLogin");
    By logo = By.xpath("//a[@href='https://www.magicbricks.com/bricks/indexc.html?ODRedirect=Yes']");
    

  //<editor-fold desc="search locators">
     By searchfield= By.id("keyword");
     By search_btn=By.className("mb-search__btn");
     By search_alert=By.id("location-error-id");
     By search_location=By.className("mb-search__auto-suggest__item");
    
     
   //<editor-fold desc="rent locators">
     By rentDropDown=By.xpath("//a[@id='rentheading']");
     By ownerproperties=By.xpath("(//a[text()='Owner Properties'])[2]");
     By sort=By.xpath("//div[@class='mb-srp__tabs__sortby--title']");
     By sortoption=By.xpath("//ul[@class='mb-srp__tabs__sortby__dd__list']");
     By selectedproperty=By.xpath("(//h2[@class='mb-srp__card--title'])[5]");
     By propertysaveforlater=By.xpath("//a[@class='btnViewPh radius3 viewPhoneNumber viewphone-button']");
     By savebtn=By.xpath("//div[@id='requestPhotoSubmitBtnWrap']");
     By verifiedproperties=By.xpath("//a[text()='Verified Properties']");
     By furnishedhomesproperties=By.xpath("//a[text()='Furnished Homes']");
     By bachelorfriendlyhomes=By.xpath("//a[text()='Bachelor Friendly Homes']");
     By houseproperties=By.xpath("//a[text()='House for rent in Bangalore']");
     By villaproperties=By.xpath("//a[text()='Villa for rent in Bangalore']");
     By pgproperties=By.xpath("//a[text()='PG in Bangalore']");
     By officeproperties=By.xpath("(//a[text()='Office Space in Bangalore'])[2]");
     By tenthousandproperty=By.xpath("//a[text()='Under ₹ 10,000']");
     By fiftenthousandproperty=By.xpath("//a[text()='₹ 10,000 - ₹ 15,000']");
     By twentyfivethousandproperty=By.xpath("//a[text()='₹ 15,000 - ₹ 25,000']");
     
     
     //<editor-fold desc="Find agent">
     By findagent=By.xpath("(//a[text()='Find an Agent'])[2]");
     By filteragentcity=By.id("cityList");
     By filteragentlocality=By.id("localityList");
     By selectagent=By.xpath("(//div[@class='agent-srp__tops__blocks'])[2]");
     By agentcontactagent=By.xpath("(//a[text()='Contact Agent'])[2]");
     
     //<editor-fold desc="Help center">
     By helpdropdown=By.xpath("//a[text()='Help']");
     By helpcenter=By.xpath("(//a[text()='Help Center'])[1]");
     By helppopup=By.xpath("//a[@id='userPersonaPopupCloseAnchor']");
     By rentforum=By.xpath("//a[text()='Rent ']");
     
     
    
   //<editor-fold desc="MagicBricsk login">
	public void login() throws InterruptedException {
		
		driver.get("https://www.magicbricks.com/property-for-sale-rent-in-Bangalore/residential-real-estate-Bangalore");
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(login_link);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(login_btn);
		a.moveToElement(e2).click().build().perform();
		
		ArrayList <String> newtb= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtb.get(1));
		driver.findElement(email).sendKeys("adeep.dv97@gmail.com");
		driver.findElement(next_btn).click();
		driver.findElement(password).sendKeys("adeep1997!");
		driver.findElement(login_btn2).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='oppPopup_close md-close'])[2]")).click();
		
	}


	public void homepage() throws InterruptedException {
		
		driver.findElement(logo).click();
		Thread.sleep(3000);
		
	}


	//<editor-fold desc="rent search field">
	public void searchfield(String string) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.className("mb-search__tag-close")).click();
		driver.findElement(searchfield).sendKeys(string);
		//driver.findElement(searchfield).clear();
		Thread.sleep(3000);
		
		
	}


	public void searchfieldclick() {
		
		driver.findElement(search_btn).click();
		//driver.findElement(searchfield).clear();
	}


	public void searchalert() {
		
		Assert.assertTrue(verify());
	}


	private boolean verify() {
		
		boolean b=driver.findElement(search_alert).isDisplayed();
		return (b);
	}


	public void searchoption() {
		
		driver.findElement(search_location).click();
	}

	//<editor-fold desc="rent owner properties">
	public void ownerproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(ownerproperties);
		a.moveToElement(e2).click().build().perform();
		
	}


	public void sortproperties() throws InterruptedException {
		
		ArrayList <String> newtb= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtb.get(2));
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(sort);
		a.moveToElement(e1).click().build().perform();
		
		WebElement e2=driver.findElement(By.xpath("//li[text()='Price - High to Low']"));
		a.moveToElement(e2).click().build().perform();
		
	}


	public void selectproperty() {
		
		driver.findElement(selectedproperty).click();
		
	}


	public void propertycontactagent() throws InterruptedException {
		
		Thread.sleep(3000);
		ArrayList <String> newtb= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtb.get(3));
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(propertysaveforlater);
		a.moveToElement(e1).click().build().perform();
//		driver.findElement(propertysaveforlater).click();
		driver.findElement(savebtn).click();
		
	}

	//<editor-fold desc="rent verified properties">
	public void verifiedproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(verifiedproperties);
		a.moveToElement(e2).click().build().perform();
	}


	//<editor-fold desc="rent furnished properties">
	public void furnishedHomesproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(furnishedhomesproperties);
		a.moveToElement(e2).click().build().perform();
	}

	//<editor-fold desc="rent bachelorhomes properties">
	public void bachelorHomesproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(bachelorfriendlyhomes);
		a.moveToElement(e2).click().build().perform();
		
	}


	public void houseproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(houseproperties);
		a.moveToElement(e2).click().build().perform();
	}


	public void villaproperties() {
	    
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(villaproperties);
		a.moveToElement(e2).click().build().perform();
	}


	public void pgproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(pgproperties);
		a.moveToElement(e2).click().build().perform();
	}


	public void officespaceproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(officeproperties);
		a.moveToElement(e2).click().build().perform();
	}


	public void tenthousandproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(tenthousandproperty);
		a.moveToElement(e2).click().build().perform();
	}


	public void fifteenthousandproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(fiftenthousandproperty);
		a.moveToElement(e2).click().build().perform();
	}


	public void twentyfivethousandproperties() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(fiftenthousandproperty);
		a.moveToElement(e2).click().build().perform();
	}


	public void findagent() {
		
		Actions a=new Actions(driver);
		WebElement e1=driver.findElement(rentDropDown);
		a.moveToElement(e1).build().perform();
		WebElement e2=driver.findElement(findagent);
		a.moveToElement(e2).click().build().perform();
		
	}


	public void filteragent() {
		
		ArrayList <String> newtb= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newtb.get(2));
		WebElement e1=driver.findElement(filteragentcity);
    	Select s=new Select(e1);
    	s.selectByVisibleText("Chennai");
    	WebElement e2=driver.findElement(filteragentlocality);
    	Select s1=new Select(e2);
    	s1.selectByVisibleText("Anna Nagar");
	}


	public void selectagent() {
		
		driver.findElement(selectagent).click();
	}


	public void agentcontactagent() {
		
		driver.findElement(agentcontactagent).click();
	}



	
	
    
    
}
