package action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://api.jquery.com/dblclick/");

		driver.manage().window().maximize();
		
		WebElement ele =driver.findElement(By.xpath("//*[@id=\"example-1\"]/div[2]/iframe"));
		
		driver.switchTo().frame(ele);
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
		

	}

}
