package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	    driver.findElement(By.name("search")).sendKeys(("Artificial Intelligence"));
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    driver.findElement(By.xpath("div[@class='vector-toc-text']"));
	    
	   
		
		

	}

}
