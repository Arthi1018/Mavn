package com.adactin;

import org.openqa.selenium.WebDriver;

public class Pom_Of_Pom {
	
	private WebDriver driver;
	
    private Login l;
	
	private Search s;
	
	
	public Pom_Of_Pom(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Login getL() {
		l=new Login(driver);
		return l;
	}

	public Search getS() {
		s=new Search(driver);
		return s;
	}

}
