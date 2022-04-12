package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	public static WebDriver driver; // null driver
	@FindBy(id = "location")
	private WebElement location;
	
	
	public Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		}
		public WebElement getLocation() {
		return location;
		}


}
