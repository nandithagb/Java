package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\msedgedriver.exe" );
WebDriver driver =new ChromeDriver();
driver.get("https://byjus.com/");
driver.manage().window().maximize();
//driver.get("http://www.ebay.com"); driver.manage().window().maximize();
//
//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
//
//driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//
//driver.close();
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(), 'Login')]"))).click();
//WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Login')]"));
//loginButton.click();


}

	}







