package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 {
	@Parameters({"username","password"})
	@Test
	private void tc0(String s, String s1) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-new\\TestNGSample\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(s);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s1);
	}

}
