import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTest {
/*To sanity testing:
 * 1. invalid Login Testing
 * 2. Valid Login Testing
 * 3. If Spans id displayed in the site
 * 4. If the search box displayed and allows typing
 * */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVA SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://studio.wibbitz.com/#/signup");
		if(driver.getCurrentUrl().equalsIgnoreCase("https://studio.wibbitz.com/#/signup"))
			System.out.println("We are in the valid site");
		driver.findElement(By.cssSelector("ul[class='auth0-lock-tabs'] li[class] a[href]")).click();
		System.out.println("Login fieled is opened");
	//invalid Login tests
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("div[class='auth0-lock-error-invalid-hint']")).isDisplayed())
			System.out.println("An Error message");
		driver.findElement(By.id("1-email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("1-email")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.DELETE);
		
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gma.com");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("div[class='auth0-global-message auth0-global-message-error']")).isDisplayed())
			System.out.println("An Error message");
		driver.findElement(By.id("1-email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("1-email")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.DELETE);
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar@gmail.com");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("div[class='auth0-global-message auth0-global-message-error']")).isDisplayed())
			System.out.println("An Error message");
		driver.findElement(By.id("1-email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("1-email")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.DELETE);
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.com");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("div[class='auth0-global-message auth0-global-message-error']")).isDisplayed())
			System.out.println("An Error message");
		driver.findElement(By.id("1-email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("1-email")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.DELETE);
		
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("div[class='auth0-global-message auth0-global-message-error']")).isDisplayed())
			System.out.println("An Error message");
		driver.findElement(By.id("1-email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("1-email")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.DELETE);
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.findElement(By.cssSelector("div[class='auth0-global-message auth0-global-message-error']")).isDisplayed())
			System.out.println("An Error message");
		driver.findElement(By.id("1-email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("1-email")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.DELETE);
		//valid Login Test
		if(driver.findElement(By.id("1-email")).isDisplayed())
			driver.findElement(By.id("1-email")).sendKeys("sahar128049@gmail.com");
		if(driver.findElement(By.cssSelector("input[type='password']")).isDisplayed())
			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sa7ar123");
		if(driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).isDisplayed())
			driver.findElement(By.cssSelector("button[class='auth0-lock-submit']")).click();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equalsIgnoreCase("https://studio.wibbitz.com/#/app/home"))
			System.out.println("We are on the right page site! Welcome to the personal area");
		//Test if Spans id displayed in the site
		if(driver.findElement(By.cssSelector("div[data-test-id='create-clip'] div[class='empty-clip-inner'] span[class='icon icon-Plus     '] svg[class='plus-icon'] path[fill='#0055FB']")).isDisplayed())
			System.out.println("You can create from scratch");
		if(driver.findElement(By.cssSelector("span[class='icon icon-StudioLogoBig     ']")).isDisplayed())
			System.out.println("The Wibbitz Logo is displayed");
		if(driver.findElement(By.cssSelector("span[data-test-id='Home']")).isDisplayed())
			System.out.println("The home span is displayed");
		
		if(driver.findElement(By.cssSelector("span[data-test-id='Top Stories']")).isDisplayed())
		{
			System.out.println("The Top Stories span is displayed");
			driver.findElement(By.cssSelector("span[data-test-id='Top Stories']")).click();
			if(driver.getCurrentUrl().equalsIgnoreCase("https://studio.wibbitz.com/#/app/top-stories?language=english"))
				System.out.println("We are on the right page site! Welcome to Top Stories");
		}
		if(driver.findElement(By.cssSelector("span[data-test-id='Templates']")).isDisplayed())
		{
			System.out.println("The Templates span is displayed");
			driver.findElement(By.cssSelector("span[data-test-id='Templates']")).click();
			if(driver.getCurrentUrl().equalsIgnoreCase("https://studio.wibbitz.com/#/app/templates?templatesType=featured-templates"))
				System.out.println("We are on the right page site! Welcome to Templates");
		}
		if(driver.findElement(By.cssSelector("span[data-test-id='Planner']")).isDisplayed())
		{
			System.out.println("The Planner span is displayed");
			driver.findElement(By.cssSelector("span[data-test-id='Planner']")).click();
			if(driver.getCurrentUrl().equalsIgnoreCase("https://studio.wibbitz.com/#/app/planner"))
				System.out.println("We are on the right page site! Welcome to Planner");
		}
		if(driver.findElement(By.cssSelector("span[class='action-button-text ']")).isDisplayed())
		{
			driver.findElement(By.cssSelector("span[class='action-button-text ']")).click();
			if(driver.findElement(By.cssSelector("div[class='content-scroller-items skeleton-scroller-content']")).isDisplayed())
				System.out.println("Yes I see the optins to create a new video");
		}
		driver.findElement(By.cssSelector("span[data-test-id='Home']")).click();
		//test if the search box displayed and allows typing
		if(driver.findElement(By.cssSelector("input[data-test-id='search-box']")).isDisplayed())
		{
			System.out.println("The search box is displayed");
			driver.findElement(By.cssSelector("input[data-test-id='search-box']")).sendKeys("Birthday");
			if(driver.findElement(By.cssSelector("input[value='Birthday']")).isDisplayed())
				System.out.println("Yes I success");
		}
	}
}