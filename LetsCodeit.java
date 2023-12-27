package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsCodeit {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.xpath("//legend[text()='Radio Button Example']/following-sibling::label[text()=' Benz ']/child::input[@id='benzradio']")).click();
		driver.findElement(By.id("bmwcheck")).click();
		driver.findElement(By.id("benzcheck")).click();
		driver.findElement(By.id("hondacheck")).click();
		driver.findElement(By.xpath("//legend[text()='Switch Tab Example']/following-sibling::a[@id='opentab']")).click();
		//driver.
		//driver.switchTo().parentFrame();
		Thread.sleep(2000);
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		driver.findElement(By.xpath("//a[text()='HOME']")).click();
		
	}

}
