package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String Year="2025";
		String Month="February";
		String Date="22";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (currentMonth.equals(Month) && currentYear.equals(Year)) {
				
				break;
			}
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e]")).click();
		}
		List<WebElement> alldates =  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement ad : alldates)  {
			if(ad.getText().equals(Date))  {
				ad.click();
				break;
				
			}
		}
		System.out.println("02/22/2025");
		
		
	}


	}


