import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver", "https://googlechromelabs.github.io/chrome-for-testing/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/?hl=en-in");
		driver.findElement(By.id("_R_ojadeslcldcpbn6b5ipamH1_")).sendKeys("shruthiboopathi@gmail.com");//by id locator
		driver.findElement(By.id("_R_oradeslcldcpbn6b5ipamH1_")).sendKeys("Sgruthi");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.linkText("Find your account and log in.")).getText();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("_r_4_")).sendKeys("9597688001");
		driver.findElement(By.cssSelector("div[role='none'] button")).click();
	}

}
