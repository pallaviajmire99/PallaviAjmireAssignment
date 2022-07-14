package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KotakCherry  {
@FindBy(xpath = "//div[text()=' Deposits ']")private WebElement deposit;
@FindBy(xpath = "//h2[text()='Fixed deposit']")private WebElement fixed;
@FindBy(xpath = "//div[@class='ieco-blue-underline']")private WebElement amount;
@FindBy(xpath = "//div[@class='ieco-blue-underline']/input")private WebElement amount2;
@FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c128-2']")private WebElement drop;
@FindBy(xpath ="//input[@id='mat-input-2']")private WebElement year;
@FindBy(xpath = "//input[@id='mat-input-3']")private WebElement month;
@FindBy(xpath = "//input[@id='mat-input-4']")private WebElement days;
@FindBy(xpath = "(//button[@color='primary'])[2]")private WebElement done;
@FindBy(xpath = "//button[@color='primary']")private WebElement proceed;
public KotakCherry(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void deposits() {
	deposit.click();
}
public void fixedDeposit() throws InterruptedException {
	fixed.click();
	Thread.sleep(1000);

}
public void Amount() throws InterruptedException {
	Thread.sleep(1000);
	amount.click();
	amount2.clear();
	Thread.sleep(1000);
	amount2.sendKeys("50000");
}
public void Dropdown() throws InterruptedException {
	Thread.sleep(1000);
	drop.click();
}
public void Years() throws InterruptedException {
	Thread.sleep(1000);
	year.clear();
	year.sendKeys("0");
}
public void Month() throws InterruptedException {
	Thread.sleep(1000);
	month.clear();
	month.sendKeys("12");
}
public void Days() throws InterruptedException {
	Thread.sleep(1000);
	days.clear();
	days.sendKeys("10");
}
public void Done() throws InterruptedException {
	Thread.sleep(1000);
	done.click();
}
public void Proceed() throws InterruptedException {
	Thread.sleep(1000);
	proceed.click();
}
}
