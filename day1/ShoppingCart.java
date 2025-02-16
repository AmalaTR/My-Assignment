package Assignments.day1;


import org.openqa.selenium.By;
import Base.MainCoding;

public class ShoppingCart extends MainCoding {
	
	public void checkOut() {
	
		driver.findElement(By.id("checkout")).click();
		
	}
	
	public void pricing() throws InterruptedException {
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Doe");
		driver.findElement(By.id("postal-code")).sendKeys("12345");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		
		
	}
	
	

}

