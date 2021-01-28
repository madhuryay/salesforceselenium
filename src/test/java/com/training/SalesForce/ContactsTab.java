package com.training.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactsTab extends SalesForceUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		logintoSalesForceApp();
		testcase32();
		quitBrowser();
		}
	
	public static void testcase25() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Gowda");
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("SeleniumTest");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']")).click();
		Thread.sleep(3000);
	}
	
	public static void testcase26() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("madhu");
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("Mysore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-uidsfdc=3]")).click();
		Thread.sleep(3000);
		}
	public static void testcase27() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		
		Select sel = new Select(driver.findElement(By.id("hotlist_mode")));
		sel.selectByValue("2");
		Thread.sleep(3000);
	}
	
	public static void testcase28() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		
		Select sel = new Select(driver.findElement(By.id("fcf")));
		sel.selectByValue("00B4x000007Zpro");
		Thread.sleep(3000);
	}
	public static void testcase29() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Gowda')]")).click();
		Thread.sleep(3000);
	}
	public static void testcase30() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		driver.findElement(By.xpath("//input[@data-uidsfdc=3]")).click();
		Thread.sleep(3000);
	}
	public static void testcase31() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Cancel']")).click();
		Thread.sleep(3000);
	}
	
	public static void testcase32() throws Exception {
		driver.findElement(By.xpath("//a[@title='Contacts Tab']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@value='Save & New']")).click();
		Thread.sleep(8000);
	}
		
}
