import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateNewVideo {
/*Create a new video Process:
 * 1. Login
 * 2. Create a new video
 * 3. Edit the text
 * 4. Click done
 * 5. Test if the video is created
 * */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://studio.wibbitz.com/#/signup");
		driver.findElement(By.cssSelector("ul[class='auth0-lock-tabs'] li[class] a[href]")).click();
		//Login
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.com");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[data-test-id='skeleton-Speakers Spotlight'] div[data-test-id='skeleton-image-Speakers Spotlight'] div[class='preview-container']")).click();
		driver.findElement(By.cssSelector("input[data-text='Untitled Video']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.cssSelector("input[data-text='Untitled Video']")).sendKeys("My Video");
		
		driver.findElement(By.cssSelector("textarea[id='text-area-17wij-x5btt']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.cssSelector("textarea[id='text-area-17wij-x5btt']")).sendKeys("Hiii Our title video is:");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("textarea[id='text-area-17wij-27laq']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.cssSelector("textarea[id='text-area-17wij-27laq']")).sendKeys("Social Media Famous Worker Persons ....");
		//click done to create the video
		driver.findElement(By.cssSelector("button[class='action-button square-button large-button text-button primary-button-palette  ']")).click();
		Thread.sleep(2000);
		List<WebElement> lis2=driver.findElements(By.cssSelector("div[class='description']"));
		System.out.println(lis2.size());
		Thread.sleep(3000);
		//Test if the video is created
		for(int i=0;i<lis2.size();i++)
		{
			if(lis2.get(i).getText().equalsIgnoreCase("My Video"))
			{
				System.out.println("Yes! Success To create video");
				break;
			}
		}
	}
}
