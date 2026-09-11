package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/bangalore/delivery");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.switchTo().frame("auth-login-ui");
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
		driver.switchTo().defaultContent();
		String result=driver.findElement(By.xpath("//h3[text()='Inspiration for your first order']")).getText();
		System.out.println(result);

	}

}
