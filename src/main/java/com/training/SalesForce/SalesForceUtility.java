package com.training.SalesForce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceUtility {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	public static void gotoSalesForceURL() {
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		}
	
	public static void waitExplicitly(int iseconds, WebElement ele ) {
		WebDriverWait wait = new WebDriverWait(driver,iseconds);
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	public static void logintoSalesForceApp() {
		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,ele);
		ele.clear();
		ele.sendKeys("madhuryayadunath@gmail.com");
	
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gowda1989");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		waitExplicitly(5,driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		}
	
	public static void quitBrowser() {
		driver.quit();
	}

	}
