package org.mini_project;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KATHIR\\Desktop\\desktop\\Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@class='login']")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("tamilselvanv3108@gmail.com");

		driver.findElement(By.id("passwd")).sendKeys("tamilselvan3104");

		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

		driver.findElement(By.xpath("(//a[text()='T-shirts'])[ 2]")).click();

		driver.findElement(By.xpath("//img[@itemprop='image']")).click();

		WebElement single = driver.findElement(By.xpath("//iframe[@frameborder='0']"));

		driver.switchTo().frame(single);

		driver.findElement(By.name("Submit")).click();

		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
		
        driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
        
        driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span ")).click();
        
		driver.findElement(By.id("cgv")).click();
		
		driver.findElement(By.name("processCarrier")).click();
		
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		
		WebElement orders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", orders);
		
		js.executeScript("window.scrollBy(0,-500);");
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\KATHIR\\Desktop\\desktop\\Testing\\Screenshots\\pic3.png");
		
		FileUtils.copyFile(source, destination);
		
		
		

	}
}
