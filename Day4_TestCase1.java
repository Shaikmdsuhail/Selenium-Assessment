package Assessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		List<WebElement> ele = driver.findElements(By.tagName("input"));
		System.out.println(ele.size());
		for(WebElement ee:ele) {
			if(ee.getAttribute("name").equals("email")) {
				ee.sendKeys("Suhail");
				break;
			}
			
		}
		
	}

}
