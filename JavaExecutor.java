package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaExecutor {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("searchInput"));
		search.sendKeys("Tamilnadu");
		search.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,7000);");
		WebElement srch = driver.findElement(By.id("Others"));
		WebElement srch1 = driver.findElement(By.id("Rail"));
		
		js.executeScript("arguments[0].scrollIntoView(true);arguments[1].scrollIntoView(true);", srch,srch1);
		js.executeScript("window.scroll(0,7000);");
	}
}
