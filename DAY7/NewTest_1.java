package DAY7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest_1 {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demo.wpeverest.com/user-registration/guest-registration-form/");
		String url=driver.getTitle();
		Assert.assertEquals(url, "Guest Registration Form – User Registration");
  }
}
