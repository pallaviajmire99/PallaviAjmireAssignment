package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {
public static void ScreenShort(WebDriver driver,String name,String Date) throws IOException {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String time = new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss").format(new Date());
	File Destinetion = new File("D:\\ScreenShort"+name+ " " +Date+ ".jpg");
	FileHandler.copy(source,Destinetion);
}
}
