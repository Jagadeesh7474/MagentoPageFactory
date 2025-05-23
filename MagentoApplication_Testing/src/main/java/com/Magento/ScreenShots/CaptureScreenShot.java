package com.Magento.ScreenShots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Magento.Browser.Browser;

public class CaptureScreenShot extends Browser{
	public static String screenShot(String name) throws Exception { 
		String path=null;
		try {
			TakesScreenshot shot = ((TakesScreenshot) driver);
			File source = shot.getScreenshotAs(OutputType.FILE);
			path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";
			File destination = new File(path);
			source.renameTo(destination);
			
		} catch (Exception e) {
			System.out.println("Screenshot");
		}
		return path;
	}

}
