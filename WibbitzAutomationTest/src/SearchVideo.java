import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchVideo {
/*To search a video:
 * 1. Login
 * 2. Click an exist title
 * 3. Click a contain string in the exist title
 * */
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\JAVA SELENIUM\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://studio.wibbitz.com/#/signup");
			driver.findElement(By.cssSelector("ul[class='auth0-lock-tabs'] li[class] a[href]")).click();
			System.out.println("Login fieled is opened");

			if(driver.findElement(By.id("1-email")).isDisplayed())
				driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.com");
			if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
			if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
				driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("input[data-test-id='search-box']")).sendKeys("Untitled");
			driver.findElement(By.cssSelector("input[data-test-id='search-box']")).sendKeys(Keys.ENTER);
			List<WebElement> lis2=driver.findElements(By.cssSelector("div[class='description']"));
			System.out.println(lis2.size());
			Thread.sleep(3000);
			if(lis2.size()>0)
				System.out.println("Yes! Finded");
			else
				System.out.println("NOOO");
			driver.findElement(By.cssSelector("input[data-test-id='search-box']")).sendKeys(Keys.CONTROL+"a");
			driver.findElement(By.cssSelector("input[data-test-id='search-box']")).sendKeys("titled");
			driver.findElement(By.cssSelector("input[data-test-id='search-box']")).sendKeys(Keys.ENTER);
			List<WebElement> lis1=driver.findElements(By.cssSelector("div[class='description']"));
			System.out.println(lis1.size());
			if(lis1.size()>0)
				System.out.println("Yes! Finded");
			else
				System.out.println("NOOO");
		}
	}

