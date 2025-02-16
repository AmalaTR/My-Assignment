package Assignments.day1;


import org.openqa.selenium.By;
import Base.MainCoding;

public class LoginPage extends MainCoding {

	public LoginPage enterUsername(){
		
		System.out.println("driver instance in enterUsername"+driver);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		return this;

	}
	public LoginPage enterPassword(){
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		return this;
	}
	public HomePage clickLogin(){
		
		driver.findElement(By.id("login-button")).click();
		return new HomePage();
		
	}
	

}
