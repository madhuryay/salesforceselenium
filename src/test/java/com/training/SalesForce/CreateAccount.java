package com.training.SalesForce;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		logintoSalesForceApp();
		testcase14();
		quitBrowser();
}
	
	public static void testcase10() throws Exception{
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value=' New ']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("SeleniumTest");
		Thread.sleep(6000);
		
		Select se= new Select(driver.findElement(By.id("acc6")));
		se.selectByValue("Technology Partner");
		Thread.sleep(3000);
		
		Select sel = new Select(driver.findElement(By.id("00N4x00000Db1sh")));
		sel.selectByValue("High");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[@Id='topButtonRow']//input[@title='Save']")).click();
		Thread.sleep(3000);
	}
	public static void testcase11() throws Exception{
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Hackathon");
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("test");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-uidsfdc='3']")).click();
		Thread.sleep(3000);
		
	}
	public static void testcase12() throws Exception{
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='fFooter']//a[contains(text(),'Edit')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("SelHack");
		Thread.sleep(3000);
		
		Select s1= new Select(driver.findElement(By.id("fcol1")));
		s1.selectByValue("ACCOUNT.NAME");
		Thread.sleep(3000);
		Select s2= new Select(driver.findElement(By.id("fop1")));
		s2.selectByValue("c");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("a");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-uidsfdc='3']")).click();
		Thread.sleep(3000);
		
	}
	
	public static void testcase13() throws Exception{
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("SeleniumTest");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pbTopButtons'] //input[@value=' Next ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='pbTopButtons'] //input[@value=' Merge ']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(3000);
		}
	public static void testcase14() throws Exception{
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='ext-gen148']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Today')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Run Report')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Save As']")).click();
		driver.findElement(By.xpath("//input[@id='report_name']")).sendKeys("FirstReport");
		driver.findElement(By.xpath("//input[@id='devName']")).sendKeys("rep");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Save & Return to Report']")).click();
		Thread.sleep(3000);
	}

}
