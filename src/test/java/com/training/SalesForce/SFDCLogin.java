package com.training.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFDCLogin extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		testcase4B();
		quitBrowser();
		}
	
	public static void testcase1() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,ele);
		ele.clear();
		ele.sendKeys("madhuryayadunath@gmail.com");
	
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		waitExplicitly(5,driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		}
	public static void testcase2() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,ele);
		ele.clear();
		ele.sendKeys("madhuryayadunath@gmail.com");
	
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowda1989");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		waitExplicitly(5,driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		}
	public static void testcase3() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,ele);
		ele.clear();
		ele.sendKeys("madhuryayadunath@gmail.com");
	
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowda1989");
		driver.findElement(By.xpath("//label[@for='rememberUn']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		waitExplicitly(5,driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowda1989");
		 driver.findElement(By.xpath("//input[@id='Login']")).click();
		waitExplicitly(5,driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		}
	
	public static void testcase4A() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,ele);
		ele.clear();
		ele.sendKeys("madhuryayadunath@gmail.com");
		
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("madhurayadunath@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	public static void testcase4B() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,ele);
		ele.clear();
		ele.sendKeys("123");
	
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("22131");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(3000);
		}

}
