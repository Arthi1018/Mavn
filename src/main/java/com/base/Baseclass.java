package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	
	public static WebDriver browser_Launch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\OneDrive\\Desktop\\Sel2\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void sendkeys(String send, WebElement element) {
    element.sendKeys(send);
	}
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void dropdown(WebElement element, String value, String drop) {
    Select s=new Select(element);
    if (value.equals("value")) {
		s.selectByValue(drop);
	}else if (value.equals("text")) {
		s.selectByVisibleText(drop);
	}else {
		int i = Integer.parseInt(drop);
		s.selectByIndex(i);
	}
	}
}


