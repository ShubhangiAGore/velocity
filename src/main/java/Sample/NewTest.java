package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
   public void f() {	System.setProperty("webdriver.crome.driver", "D:\\JavaStudy\\selenium\\cromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.facebook.com/");
 
 }
}
