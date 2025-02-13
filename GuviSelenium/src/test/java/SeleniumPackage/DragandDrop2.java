package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement Source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions= new Actions(driver);
		actions.dragAndDrop(Source, Target);
		actions.build().perform();
		
		System.out.print("Dropped");

	}

}
