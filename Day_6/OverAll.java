package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverAll {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[2]")).click();
		driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("painuru");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Thulasi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Ram");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("217313");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
