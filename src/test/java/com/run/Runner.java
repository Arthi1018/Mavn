package com.run;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.Login;
import com.adactin.Pom_Of_Pom;
import com.adactin.Search;
import com.base.Baseclass;

public class Runner extends Baseclass{
	
	public static WebDriver driver=browser_Launch();
	
	public static void main(String[] args) {
		
		url("https://adactinhotelapp.com/");
		
		Pom_Of_Pom p=new Pom_Of_Pom(driver);
		
		sendkeys("Arthiha1018", p.getL().getUsername());
		sendkeys("A14OQC", p.getL().getPassword());
		
		click(p.getL().getLogin());
		
		dropdown(p.getS().getLocation(), "value", "Sydney");
	}

}
