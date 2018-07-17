package com.qa.sikuliDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class LoginGmail {

	public static void main(String[] args) throws Exception {
		
		Screen screen = new Screen();
		
		Pattern gmail = new Pattern("D:\\sikuli images\\gmail_logo.PNG");
		Pattern uName = new Pattern("D:\\sikuli images\\UName_box.PNG");
		Pattern next1 = new Pattern("D:\\sikuli images\\Next_button.PNG");
		Pattern pass = new Pattern("D:\\sikuli images\\password_box.PNG");
		Pattern next2 = new Pattern("D:\\sikuli images\\Next_button2.PNG");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		screen.wait(gmail, 10);
		
		screen.click(gmail);
		
		screen.type(uName, "rajashekarkatkam61@gmail.com");
		
		screen.click(next1);
		
		screen.type(pass, "12355");
		
		screen.click(next2);
		
		driver.quit();
		
		

	}

}
