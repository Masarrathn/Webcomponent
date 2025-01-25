package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String title= driver.getTitle();
		System.out.println("STORE"  +title);
		
		String expectedTitle = "STORE";
		
		if(title.equals(expectedTitle))
			
		System.out.println("Page landed on the correct website.");
		else System.out.println("Page not landed on the correct website.");
		
		driver.close();
		
		
		

	}

}
