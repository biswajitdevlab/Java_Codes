package com.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.google.com");
    WebElement s = driver.findElement(By.name("q"));
    s.sendKeys("Football");
    s.sendKeys(Keys.ENTER);
    driver.manage().window().maximize();
    System.out.println("Successful");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)");
    
    //Implicit wait
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //Explicit wait
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	// Example: wait until element is visible
	 //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	
	 // Example: wait until element is clickable
	 //WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Images']")));
	 //button.click();
	 
     //Fluent wait
	 Wait<WebDriver> wait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(20))
		        .pollingEvery(Duration.ofMillis(500))
		        .ignoring(NoSuchElementException.class);

		// Example: wait until element is clickable
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Images']")));
		button.click();

    Thread.sleep(2000);
    driver.close();;
	}

}
