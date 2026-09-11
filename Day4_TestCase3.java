package Assessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Day4_TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.bigbasket.com/");
//		driver.findElement(By.xpath("//button[text()='Login/ Sign Up']")).click();
//		driver.findElement(By.id("multiform")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products...\"]")).sendKeys("Tomato",Keys.ENTER);
		Thread.sleep(8000);
		WebElement ee=driver.findElement(By.xpath("//button[text()='Add']"));
		
		try {
		ee.click();
		}catch(Exception e){
			wait.until(ExpectedConditions.elementToBeClickable(ee)).click();
		}

	}

}
