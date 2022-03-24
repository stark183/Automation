package testpackage;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJunit {
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
		driver.get("https://flipkart.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links in the webpage are " +links.size());
		List<WebElement> linkName = driver.findElements(By.tagName("a"));
		for(WebElement link:linkName){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }
	}

}