package com.base;
	import java.io.IOException;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.net.URLConnection;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class broken_link{
	    public static void main(String[] args) throws InterruptedException, IOException {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();

	        // wait for page to render
	        Thread.sleep(2000);

	        List<WebElement> ele = driver.findElements(By.tagName("a"));
	        System.out.println("Total links: " + ele.size());

	        for (WebElement link : ele) {
	            String href = link.getAttribute("href");
	            if (href != null && !href.isEmpty()) {
	                URL url = new URL(href);
	                URLConnection conn = url.openConnection();
	                ((HttpURLConnection) conn).setRequestMethod("HEAD");
	                conn.setConnectTimeout(1000);
	                conn.setReadTimeout(2000);
	                conn.connect();
	                int response = ((HttpURLConnection) conn).getResponseCode();
	                if (response > 400) {
	                    System.out.println("Broken link: " + href);
	                } else {
	                    System.out.println("Valid link: " + href);
	                }
	            }
	        }
	        driver.quit();
	    }
	}


