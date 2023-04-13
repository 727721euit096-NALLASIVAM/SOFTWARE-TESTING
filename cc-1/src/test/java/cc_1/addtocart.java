package cc_1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addtocart {

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
		 
		 WebElement check = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
			check.click();
			
			 WebElement add = driver.findElement(By.xpath("//*[@class=\"shopping_cart_badge\"]"));
				add.click();
				
				 WebElement out = driver.findElement(By.xpath("//*[@class=\"btn btn_action btn_medium checkout_button\"]"));
					out.click();
					
					WebElement first= driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
					first.sendKeys("NALLASIVAM");
					
					WebElement last= driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
					last.sendKeys("P V");
					
					WebElement pin= driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
					pin.sendKeys("641654");
					
					 WebElement cont = driver.findElement(By.xpath("//*[@class=\"submit-button btn btn_primary cart_button btn_action\"]"));
						cont.click();
						
					
					
					System.out.println("Product:Test.allTheThings() T-Shirt (Red)");
					System.out.println("Price: $15.99");
					
					String title=driver.getTitle();
					String url=driver.getCurrentUrl();
					
					if(title.equals("Swag Labs"))
						System.out.println("Title Verified Successfully");
					else
					System.out.println("Title Not Verified");
					if(url.equals("https://www.saucedemo.com/checkout-step-two.html"))
					System.out.println("URL Verified Successfully");
					else
					System.out.println("URL Not Verified");
					

					
		

	}

}
