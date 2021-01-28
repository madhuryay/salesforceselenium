package com.training.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class LeadsTab extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		logintoSalesForceApp();
		testcase24();
		quitBrowser();
}
	
	public static void testcase20() throws Exception {
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(10000);
	}
	public static void testcase21() throws Exception {
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
		Thread.sleep(3000);
	}
	public static void testcase22() throws Exception {
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(10000);
		
		Select s2= new Select(driver.findElement(By.id("fcf")));
		s2.selectByValue("00B4x000007Zpr7");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("madhuryayadunath@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowda1989");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
		Thread.sleep(3000);
		}
	public static void testcase23() throws Exception {
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(10000);
		
		Select s2= new Select(driver.findElement(By.id("fcf")));
		s2.selectByValue("00B4x000007Zpr7");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@value=' Go! ']")).click();
		Thread.sleep(3000);
	}
	public static void testcase24() throws Exception {
		driver.findElement(By.xpath("//a[@title='Leads Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@value=' Save ']")).click();
	}
}


