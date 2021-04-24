package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample2 {
@Test(dataProvider="login")
public void tc3(String firstname,String lastname) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-new\\TestNGSample\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement btnCrt = driver.findElement(By.xpath("a[text()='Create New Account']"));
	btnCrt.click();
	Thread.sleep(2000);
	WebElement txtFirst = driver.findElement(By.name("firstname"));
	txtFirst.sendKeys(firstname);
	WebElement txtLast = driver.findElement(By.name("lastname"));
	txtLast.sendKeys(lastname);
	
	
	
	
}
@DataProvider(name="login")
public Object[][] data(){
	return new Object[][] {
		{"christy","augustine"},
		{"christo","aug"},
		{"dee","k"}
	};
	
	
}
}
