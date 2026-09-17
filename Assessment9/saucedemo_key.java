package saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo_key {
	WebDriver driver;
	public void launchBrowser()
	{
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	public void openurl()
	{
		driver.get("https://www.saucedemo.com/");
	}
	public void username() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	public void password() {
		driver.findElement(By.id("password")).sendKeys("standard_user");
	}
	public void loginbutton() {
		driver.findElement(By.id("login-button")).click();
	}
	public void closebrowser() {
		driver.quit();
	}


}
