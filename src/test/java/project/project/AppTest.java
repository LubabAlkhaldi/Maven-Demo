package project.project;
import java.awt.Window;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest extends TestData{

	WebDriver driver = new ChromeDriver();
	String Url = "C:\\Users\\Owner\\OneDrive\\Desktop\\Maven Project\\maven.html"; 
			
	@BeforeTest
	public void Setup() {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void ScrollTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1800)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(1800, 0)");		
	}
	
	@Test(priority = 2) 
	public void FillingInputFields() throws InterruptedException {
		WebElement TextInput= driver.findElement(By.id("text"));
		WebElement EmailInput= driver.findElement(By.id("email"));
		WebElement DateInput= driver.findElement(By.id("date"));
		WebElement PasswordInput= driver.findElement(By.id("password"));
		WebElement NumberInput= driver.findElement(By.id("number"));
		WebElement FileUploadButton = driver.findElement(By.id("file"));
		//WebElement Gender= driver.findElement(By.xpath("//input[@value='"+RandomGender+"']"));
		List<WebElement> Genders = driver.findElements(By.name("gender"));
		List<WebElement> Hoppies = driver.findElements(By.name("hobby")); 


	
		TextInput.sendKeys(RandomText);
		EmailInput.sendKeys(RandomEmail);
		DateInput.sendKeys(RandomDate);
		PasswordInput.sendKeys(RandomPassword);
		NumberInput.sendKeys(RandomNumber);
		FileUploadButton.sendKeys(FilePath);
		Genders.get(RandomIndexGender).click();

		
		for(int i = 0 ; i < Hoppies.size();i++) {
			Hoppies.get(i).click();
		}


	}
}
