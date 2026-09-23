package Testcase2;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase_2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		WebElement slider= driver.findElement(By.id("slide"));
		Actions action=new Actions(driver);
		action.dragAndDropBy(slider, 100, 0).perform();
		boolean ele= driver.findElement(By.xpath("//h3[text()='Mens Cotton Jacket']")).isDisplayed();
		if(ele) {
			System.out.println("Verifed");
		}
		else {
			System.out.println("Not visible");
		}
		
	}

}
