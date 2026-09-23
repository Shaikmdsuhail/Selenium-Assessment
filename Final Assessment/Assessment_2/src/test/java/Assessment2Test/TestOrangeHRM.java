package Assessment2Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Assessment2Base.BaseClass;
import Assessment2Data.ExcelUtility;
import Assessment2Pompages.BuzzClass;
import Assessment2Pompages.HomePage;



public class TestOrangeHRM extends BaseClass {
	
	@Test
	public void test1() throws IOException, InterruptedException {
        String[] data = ExcelUtility.getData();
        String mind = data[0];
        
        BuzzClass buzz=new BuzzClass(driver);
        buzz.getBuzz();
        Thread.sleep(3000);
        
        buzz.getEnterdata(mind);
        Thread.sleep(3000);
        
        buzz.getpost();
        
        Thread.sleep(3000);
        
        buzz.verify(mind);
        Thread.sleep(3000);
        
        HomePage logout=new HomePage(driver);
        logout.logout();
        Thread.sleep(3000);
        
        
	}
}