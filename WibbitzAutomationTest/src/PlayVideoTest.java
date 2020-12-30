import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayVideoTest {
/* To play The selected video
 * 1. Login
 * 2. Select the video and click
 * 3. Control the playback of the video
 * */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://studio.wibbitz.com/#/signup");
		//Login
		driver.findElement(By.cssSelector("ul[class='auth0-lock-tabs'] li[class] a[href]")).click();
		System.out.println("Login fieled is opened");
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.com");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(10000);
		//List of the videos you created
		List<WebElement> lis2=driver.findElements(By.cssSelector("div[class='description']"));
		System.out.println(lis2.size());
		Thread.sleep(10000);
		//select video
		lis2.get(1).click();
		driver.findElement(By.cssSelector("span[class='icon icon-Play  ready   ']")).click();
		Thread.sleep(5000);
		JavascriptExecutor	js = (JavascriptExecutor) driver;	
		js.executeScript("document.getElementsByTagName(\"video\")[0].pause()");
		Thread.sleep(1000);
		js.executeScript("document.getElementsByTagName(\"video\")[0].play()");
		js.executeScript("document.getElementsByTagName(\"video\")[0].currentTime=10");
	
		
	}

}
