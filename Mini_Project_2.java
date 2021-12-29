package org.mini_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project_2 {

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

		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));

		Actions a2 = new Actions(driver);

		a2.moveToElement(dresses).build().perform();

		WebElement evening = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));

		a2.click(evening).build().perform();

		WebElement pink_colour = driver.findElement(By.xpath("//a[@id='color_43']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", pink_colour);

		WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));

		addtocart.click();

		WebElement pc2 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));

		js.executeScript("arguments[0].click();", pc2);

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
