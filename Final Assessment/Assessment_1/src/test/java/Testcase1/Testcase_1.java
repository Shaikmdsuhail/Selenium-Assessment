package Testcase1;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/toggle/disabled?sublist=1");
		List<WebElement> ele= driver.findElements(By.cssSelector("[class=\"relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out\"]"));
		for(WebElement e:ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].removeAttribute('disabled');",e);
			e.click();
			Thread.sleep(3000);
		}
		driver.findElement(By.id("togglers")).click();
		String text=driver.findElement(By.xpath("//p[text()='Your Order has been successfully placed!']")).getText();
		System.out.println(text);
		if(text.equals("Your Order has been successfully placed!")) {
			System.out.println("Order placed");
		}
		else {
			System.out.println("Order not placed");
		}
		
		
		
	}
	
	

}
