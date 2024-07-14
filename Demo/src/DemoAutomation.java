import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe" );
ChromeDriver driver =new ChromeDriver();
driver.get("http://www.google.com");
driver.get("http://www.ebay.com"); driver.manage().window().maximize();

driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");

driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

driver.close();
	}

}
