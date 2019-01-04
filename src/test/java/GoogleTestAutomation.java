import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleTestAutomation {

	public static WebDriver driver;


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgoyal2\\Desktop\\chromedriver.exe");
		
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/webhp");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("hello");;
		driver.findElement(By.name("btnK")).submit();
		//driver.close();
		//driver.quit();
		
	}
}
