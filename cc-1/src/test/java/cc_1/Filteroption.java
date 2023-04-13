package cc_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Filteroption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(co);
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		WebElement msg= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		msg.sendKeys("standard_user");
		
		WebElement amt= driver.findElement(By.xpath("//*[@id=\"password\"]"));
		amt.sendKeys("secret_sauce");
		
		 WebElement con = driver.findElement(By.xpath("//*[@class=\"submit-button btn_action\"]"));
		 con.submit();
		 
		 String txt1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		 System.out.println(txt1);
		 driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		 driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		 String txt2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		 System.out.println(txt2);
		 driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		 driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		 String txt3=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
		 System.out.println(txt3);
		 driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		 driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		 String txt4=driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div")).getText();
		 System.out.println(txt4);
		

	}

}
