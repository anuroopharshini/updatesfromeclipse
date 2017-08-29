package WgetPackage;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import java.io.*;



public class testWget {
	public static void main(String[] args)throws IOException,InterruptedException{
		// TODO Auto-generated method stub

		WebDriver d;
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuroop\\workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		d=new FirefoxDriver();
		Dimension d1=new Dimension(100,300);
		d.manage().window().setSize(d1);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("http://demo.guru99.com/selenium/yahoo.html");
		  WebElement de=d.findElement(By.linkText("Download Now"));
	         String source=de.getAttribute("href");
	         System.out.println(source);
	         String w="cmd /c C:\\Wget\\wget.exe -P C:\\Users\\Anuroop --no-check-certificate "+source;
	         
	         try{
	        	Process exec=Runtime.getRuntime().exec(w);
	        	int value=exec.waitFor();
	        	System.out.println("value is"+ value);
	         }
	         catch(InterruptedException|IOException e){
	        	 System.out.println(e.toString());
	         }
		}

}

