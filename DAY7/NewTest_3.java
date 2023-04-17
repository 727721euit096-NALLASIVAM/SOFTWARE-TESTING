package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest_3 {
  WebDriver driver;
  @Test
  public void function() throws InterruptedException {
	  System.out.println(driver.getCurrentUrl());
	  driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
