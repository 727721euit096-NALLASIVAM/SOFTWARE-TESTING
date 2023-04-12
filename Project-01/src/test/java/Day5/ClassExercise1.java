package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassExercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(co);
		driver.navigate().to("https://demoqa.com/droppable/");
		WebElement  drag1=driver.findElement(By.id("draggable"));
		WebElement  drop1=driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag1, drop1).build().perform();
	}
}
