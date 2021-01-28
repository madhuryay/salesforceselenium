package com.training.SalesForce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateOpportunities extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		logintoSalesForceApp();
		testcase19();
		quitBrowser();
}
	
	public static void testcase15() throws Exception {
		driver.findElement(By.xpath("id(\"Opportunity_Tab\")")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//select[@title='View:']")).click();
		Thread.sleep(3000);
		}
	
	public static void testcase16() throws Exception {
		driver.findElement(By.xpath("id(\"Opportunity_Tab\")")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Newop");
		driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys("SeleniumTest");
		driver.findElement(By.xpath("//a[contains(text(),'1/2/2021')]")).click();
		Thread.sleep(3000);
		
		Select sel = new Select(driver.findElement(By.id("opp11")));
		sel.selectByValue("Prospecting");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("0.5");
		Thread.sleep(3000);
		
		Select sel1 = new Select(driver.findElement(By.id("opp6")));
		sel1.selectByValue("Web");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='opp17']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']")).click();
		Thread.sleep(3000);
	}
	public static void testcase17() throws Exception {
		driver.findElement(By.xpath("id(\"Opportunity_Tab\")")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
		Thread.sleep(3000);
		}
	public static void testcase18() throws Exception {
		driver.findElement(By.xpath("id(\"Opportunity_Tab\")")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		Thread.sleep(3000);
	}
	public static void testcase19() throws Exception {
		driver.findElement(By.xpath("id(\"Opportunity_Tab\")")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='Run Report']")).click();
		Thread.sleep(3000);
	}

}
