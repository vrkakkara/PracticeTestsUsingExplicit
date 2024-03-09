package com.vishnukakkara.Jan24.LearningFirstMavenProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Tabs {
	EdgeDriver driver = null;

	@BeforeMethod
	public void intialisation() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\tresa\\Downloads\\edgedriver_win64/msedgedriver.exe");

		
		driver = new EdgeDriver();

		driver.get("https://demoqa.com/browser-windows");

		driver.manage().window().maximize();
	}
	
	@Test
	public void multipleTabs() {
		WebElement tabBtn = driver.findElement(By.id("tabButton"));
		int count = 0;
		tabBtn.click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Set<String> allHandles = driver.getWindowHandles();
		  List<String> stringList = new ArrayList<>(allHandles);
		if (allHandles.size() >= 3) {

			

			for (String handle:allHandles) {
                 String currentHandle=handle;
                 
				if (!handle.equals(parentHandle)&&!handle.equals(currentHandle)) {
					
					driver.switchTo().window(handle);
					break;

				}
				WebElement headingtext = driver.findElement(By.id("sampleHeading"));
				System.out.println(headingtext.getText());
				driver.switchTo().window(parentHandle);

			}

		}
	}

}
