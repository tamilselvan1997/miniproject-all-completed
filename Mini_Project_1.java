package org.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project_1 {

	public static void main(String[] args) throws InterruptedException {

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

		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));

		Actions a = new Actions(driver);

		a.moveToElement(women).build().perform();

		WebElement casual_dresses = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));

		a.click(casual_dresses).build().perform();

		Thread.sleep(7000);

		WebElement colour = driver.findElement(By.xpath("//a[@class='color_pick']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", colour);

		WebElement addtocart = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));

		addtocart.click();

		WebElement pc1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));

		js.executeScript("arguments[0].click();", pc1);

		driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();

		driver.findElement(By.xpath("//div[@id='center_column']/form/p/button/span ")).click();

		driver.findElement(By.id("cgv")).click();

		driver.findElement(By.name("processCarrier")).click();

		driver.findElement(By.xpath("//a[@class='cheque']")).click();

		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();

		WebElement orders = driver.findElement(By.xpath("//a[@title='Back to orders']"));

		js.executeScript("arguments[0].scrollIntoView();", orders);

		js.executeScript("window.scrollBy(0,-500);");

		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));

		logout.click();

	}
}
