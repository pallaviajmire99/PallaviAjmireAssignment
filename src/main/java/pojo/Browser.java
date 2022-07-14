package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
  public static WebDriver OpenBrowser (String url) {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder\\KotakBank\\src\\main\\resources\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  return driver;
  }
}
