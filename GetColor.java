package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetColor {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("submitbtn"));
		String cssValue = element.getCssValue("background-color");
		System.out.println(cssValue);
		
		java.awt.Color color = Color.fromString(cssValue).getColor();
		
		System.out.println(color);
		
		
		if(cssValue.equals("rgba(51, 122, 183, 1)"))
		{
			System.out.println("ASTRAL, BLUE");
		}
//		WebElement year = driver.findElement(By.xpath("//select[@placeholder=\"Year\"]"));
//		Select s=new Select(year);
//		s.selectByVisibleText("1990");
//		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
//		//driver.getWindowHandle().
//		driver.findElement(By.xpath("//a[text()='Windows']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//		//driver.switchTo().
//		
		
	}

}
