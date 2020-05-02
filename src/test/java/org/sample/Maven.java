package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\eclipse-workspace\\DataDriven\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
}
}
