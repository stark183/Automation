package testpackage;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,1300)");
	  //((JavascriptExecutor)driver).executeScript("window.scrollTo(0,1300)");
	  driver.switchTo().frame("iframe-name");
	  driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/section[1]/div/div/div[1]/a/div/div")).click();
	  WebElement name = driver.findElement(By.id("username"));
	  name.sendKeys("Siva");
	  WebElement num = driver.findElement(By.id("mobileno"));
	  num.sendKeys("9876543210");
	  WebElement em = driver.findElement(By.id("email"));
	  em.sendKeys("cg@email.com");
	  WebElement req = driver.findElement(By.id("requirements"));
	  req.sendKeys("we got the people and expertise to help you reach an important"
	  		+ " milestone of test automation following all the benchmarks and processes involved "
	  		+ "in a modern software development life-cycle. Choose from one of our consulting packages"
	  		+ " below and have peace of mind at your work.");
	  Select pr = new Select(driver.findElement(By.name("input-programming-language")));
      pr.selectByVisibleText("Javascript");
      WebElement radio1 = driver.findElement(By.id("sharing"));
      radio1.click();
      Select time = new Select(driver.findElement(By.name("input-timezone")));
      time.selectByVisibleText("(GMT+05:30) Chennai, Kolkata, Mumbai, New Delhi");
      WebElement radio2 = driver.findElement(By.id("afford"));
      radio2.click();
      WebElement signup=driver.findElement(By.xpath("//*[@id=\"consultingForm\"]/div/div[9]/button"));
      signup.click();
     


  }
  @BeforeMethod
  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium jars\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        
  }
  

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

  
}
