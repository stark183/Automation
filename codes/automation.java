package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Driver\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","" )
        // 1.Open the browser
        WebDriver driver = new ChromeDriver();
        //Launch the  url
        driver.get("https://accounts.lambdatest.com/register");
        
        WebElement uname=driver.findElement(By.id("name"));
        WebElement email=driver.findElement(By.id("email"));
        WebElement pwd=driver.findElement(By.id("userpassword"));
        WebElement phno=driver.findElement(By.id("phone"));
        WebElement compname=driver.findElement(By.id("org_name"));
        uname.sendKeys("Sivasurya");
        email.sendKeys("ss@gmail.com");
        pwd.sendKeys("admin001");
        phno.sendKeys("9876543210");
        compname.sendKeys("CG");
        WebElement signup=driver.findElement(By.tagName("button"));
        signup.click();
       // signup.click();)
	}

}
