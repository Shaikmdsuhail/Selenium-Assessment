package Assessment2Pompages;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzClass {
	WebDriver driver;
	public BuzzClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement Buzz;
	public void getBuzz() {
		Buzz.click();
	}
	@FindBy(css = "[placeholder=\"What's on your mind?\"]")
	private WebElement enterdata;

	public void getEnterdata(String arg) {
		enterdata.sendKeys(arg);
	}
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement post;
	
	public void getpost() {
		post.click();
	}
	
	@FindBy(xpath = "(//div[contains(@class,'orangehrm-buzz-post-body')])[1]")
	private WebElement Getpostdata;
	
	public boolean getGetpostdata(String arg) {
		String text=Getpostdata.getText();
		return text.equals(arg);
	}
	public void verify(String arg) {
		if(getGetpostdata(arg)) {
			System.out.println("Verification successfull");
		}
		else {
			System.out.println("Verification failed");
		}
	}
	

}
