package magento.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session5Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	  driver.get("https://www.jcpenney.com/");
	  //driver.switchTo().alert().dismiss();
	  
	  WebElement searchshirt = driver.findElement(By.xpath("//a[@id='closeButton']"));
	  searchshirt.click();
	  driver.switchTo().defaultContent();
	   searchshirt = driver.findElement(By.xpath("//input[@id='searchInputId']"));
		searchshirt.sendKeys("mens big tall tshirts");
		searchshirt= driver.findElement(By.xpath("//button[@title='search']"));
		searchshirt.click();
		WebElement item = driver.findElement(By.xpath("//a[@href='/p/stafford-4-pk-heavyweight-v-neck-t-shirts-big-tall/pp5002910727?pTmplType=regular&catId=SearchResults&searchTerm=mens+big+tall+tshirts&N=507&badge=onlyatjcp']//img[@class='productDisplay_image--default']"));
		item.click();
		item = driver.findElement(By.xpath("//select[@id='SIZE_RANGE']"));
		
				
	
	}

}