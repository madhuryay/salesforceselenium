package com.training.SalesForce;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RandomScenarios extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		logintoSalesForceApp();
		testcase33();
		quitBrowser();
	}
	
	public static void testcase33() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")).click();
		Thread.sleep(6000);
	}
	public static void testcase34() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Yadunath");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(3000);
		}
	public static void testcase35() throws Exception {
		driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Customize My Tabs']")).click();
		
		Select sel = new Select(driver.findElement(By.id("duel_select_1")));
		sel.selectByValue("Asset");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Remove']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("madhuryayadunath@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowda1989");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
	}
	
	public static void testcase36() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/00U/c?md3=5&md0=2021']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:28:j_id64']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
		Thread.sleep(3000);
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowsTabs.size());
		driver.switchTo().window(windowsTabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(windowsTabs.get(0));
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'9:00 PM')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']")).click();
		Thread.sleep(8000);
		}
	
	public static void testcase37() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/00U/c?md3=5&md0=2021']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='p:f:j_id25:j_id61:20:j_id64']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='comboboxIcon']")).click();
		Thread.sleep(3000);
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowsTabs.size());
		driver.switchTo().window(windowsTabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(windowsTabs.get(0));
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'7:00 PM')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='IsRecurrence']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='rectypeftw']")).click();
		driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'19')]")).click();
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Month View']")).click();
		Thread.sleep(3000);
}
}
