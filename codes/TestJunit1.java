package testpackage;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;


public class TestJunit1 {

	WebDriver driver;

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		driver = new  ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.manage().window().maximize();
		driver.navigate().to("http://iamneo.ai");
		
		String expected="We are Hiring";
		String actual = driver.getTitle();
		Assert.assertEquals(expected,actual);
		
		
	}
	@Test 
	public void test1() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().to("http://iamneo.ai");
		
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}

}