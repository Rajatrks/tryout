package action2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Thread.sleep(5000);

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='James Johns']"));

		WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));

		 act.clickAndHold(src)
		.pause(Duration.ofSeconds(3))
		.moveToElement(dest)
		.pause(Duration.ofSeconds(3))
		.release()
		.pause(Duration.ofSeconds(3))
		.build().perform();

	}

}
