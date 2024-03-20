package com.naveenautomation.TestBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;

import com.naveenautomation.listeners.WebDriverEvents;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	private WebDriverEvents events;
	private EventFiringWebDriver eDriver;

	public void pageInitialisation() {
		setBrowserForTesting();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Loading the page");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

	}
	
	private void setBrowserForTesting() {
		WebDriverManager.edgedriver().setup();
		logger.info("Launching Edge browser");
		driver = new EdgeDriver();
				
		eDriver=new EventFiringWebDriver(driver);
				
		events=new WebDriverEvents();
				
		eDriver.register(events);
		driver=eDriver;
	}
		
		
		@BeforeClass
	public void setupLogger() {
		logger=Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.ALL);
	
	}
	

		public void pageQuit() {
			driver.close();
		}
	
	
	}



