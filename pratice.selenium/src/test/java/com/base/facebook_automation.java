package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook_automation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 WebDriver driver =new ChromeDriver();
		    String s = "https://www.facebook.com";
		    driver.get(s);
		    driver.manage().window().maximize();
		    driver.findElement(By.linkText("Create new account")).click();
		    driver.findElement(By.name("firstname")).sendKeys("Biswajit");
		    driver.findElement(By.name("lastname")).sendKeys("Prusty");
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,200)");
		    WebElement day = driver.findElement(By.id("day"));  
		    Select sel1 = new Select(day);
		    sel1.selectByVisibleText("2");
		    WebElement month = driver.findElement(By.id("month"));  
		    Select sel2 = new Select(month);
		    sel2.selectByVisibleText("Jul");
		    WebElement year= driver.findElement(By.id("year")); 
		    Select sel3 = new Select(year);
		    sel3.selectByVisibleText("1999");
		    
		    Thread.sleep(2000);
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		    WebElement gender = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='2']")));
		    gender.click();
		    
		  
		    driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		    driver.findElement(By.name("reg_passwd__")).sendKeys("abcd23");
		    String title = driver.getTitle();
		    System.out.println(title);
		    driver.findElement(By.linkText("Sign Up")).click();
		    
		 
		    File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    File destFile = new File("C:\\Users\\ASUS\\eclipse-workspace\\pratice.selenium\\output\\screenshots\\page.png");  // custom path

		    try {
		        FileHandler.copy(srcFile, destFile);
		        System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
		    } catch (IOException e) {
		        e.printStackTrace();
		    }

		    driver.close();
			}

		

	}


