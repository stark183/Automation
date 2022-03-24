package testpackage;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;
public class TestJunit2 {

   WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.navigate().to("http://www.fb.com");
		String expected = "http://www.facebook.com";
		String actual = driver.getCurrentUrl();
		if(expected.equalsIgnoreCase(actual))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Uchiha");
		driver.findElement(By.name("lastname")).sendKeys("Madara");
		driver.findElement(By.name("reg_email__")).sendKeys("7339130267");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Robot@1111");
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue("24");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByValue("6");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
	}

}