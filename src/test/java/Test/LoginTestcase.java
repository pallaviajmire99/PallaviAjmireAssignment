package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.KotakCherry;
import Utility.ExcelSheet;
import pojo.Browser;

public class LoginTestcase {
WebDriver driver;

@BeforeMethod
public void callBrowser() {
	driver = Browser.OpenBrowser("https://www.kotakcherry.com/deposits");
	//System.out.println(i);

}
@Test
public void LoginPage() throws InterruptedException, EncryptedDocumentException, IOException {

KotakCherry a = new KotakCherry(driver);
Thread.sleep(3000);

	//a.deposits();
	Thread.sleep(3000);
	a.fixedDeposit();
	Thread.sleep(3000);
	a.Amount();
	Thread.sleep(3000);
     a.Dropdown();
     a.Years();
 	Thread.sleep(3000);
    a.Month();
 	Thread.sleep(3000);
     a.Days();
  	Thread.sleep(3000);
    a.Done();
  	Thread.sleep(3000);
    a.Proceed();

}
}

