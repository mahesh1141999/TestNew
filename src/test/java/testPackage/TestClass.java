package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	@Test
	public void a() {
		System.out.println("Test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://pharmacist-dev.arine.io/");
		driver.findElement(By.xpath("//input [@name = 'email']")).sendKeys("maheshp@benchmarkit.solutions");
		driver.findElement(By.xpath("//input [@name = 'password']")).sendKeys("Password#1");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
	}

}
