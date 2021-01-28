package com.training.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserMenuDropDown extends SalesForceUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForceURL();
		logintoSalesForceApp();
		testcase6();
		quitBrowser();
		}
	public static void testcase5() throws Exception {
		waitExplicitly(5,driver.findElement(By.xpath("//span[@id='userNavLabel']")));   
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(5000);
		}
	
	public static void testcase6() throws Exception {
		waitExplicitly(5,driver.findElement(By.xpath("//span[@id='userNavLabel']")));   
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='My Profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']/img[@title='Edit Profile']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='lastName']")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bilisare");
		driver.findElement(By.xpath("//input[@value='Save All']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Post']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@aria-describedby='cke_61']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[contains(text(),'Share an update')]")).sendKeys("good day");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='File']")).click();
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		Thread.sleep(3000);
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
		choosefile.sendKeys("/Users/madhuryayadunath/Desktop/hqdefault.jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='recImage photo']")).click();
		driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
		WebElement choosephoto = driver.findElement(By.xpath("//input[@class='fileInput']"));
		choosephoto.sendKeys("/Users/madhuryayadunath/Downloads/Simba.jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click();
		Thread.sleep(3000);
		
		
		
		//WebElement myFrame = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		//driver.switchTo().frame(myFrame);
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		//Thread.sleep(3000);
		}
	
	public static void testcase7() throws Exception{
		waitExplicitly(5,driver.findElement(By.xpath("//span[@id='userNavLabel']")));   
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='My Settings']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[contains(text(),'Login History')]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@id='EmailSetup']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@id='EmailSettings_font']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='sender_name']")).clear();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("Madhurya Yadunath");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='sender_email']")).clear();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("madhuryay@gmail.com");
		//Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("//input[@id='auto_bcc1']")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[@id='auto_bcc0']")).isSelected());
		
		//driver.findElement(By.xpath("//input[@id='auto_bcc1']")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Open a Test Reminder']")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}
	public static void testcase8() throws Exception{
		waitExplicitly(5,driver.findElement(By.xpath("//span[@id='userNavLabel']")));   
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
	}
	public static void testcase9() throws Exception{
		waitExplicitly(5,driver.findElement(By.xpath("//span[@id='userNavLabel']")));   
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(3000);
	}
	
	}
