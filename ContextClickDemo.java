package action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		
		Thread.sleep(3000);
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
