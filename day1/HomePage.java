package Assignments.day1;

import org.openqa.selenium.By;

import Base.MainCoding;

public class HomePage extends MainCoding{

	public HomePage sauseLabsBackPack() {
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		return this;
		
	}
	
	public HomePage sauseLabsBikeLite() {
		
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		return this;
	}
	
	public ShoppingCart Cart()
	{
		
		driver.findElement(By.id("shopping_cart_container")).click();
		return new ShoppingCart();
	}
	
}
