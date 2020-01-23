/**
 * 
 */
package r.driver;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;
import r.utilities.UtilitiesFunctions;

/**
 * @author Ritesh Aanand
 *
 */
public class CaptureScreenshot extends Driver {
	
	/*The Log. */
	private static Logger log = Logger.getLogger(CaptureScreenshot.class.getName());
	
	/*
	 * Function Name: getScreenShot
	 * Description: To capture Screenshot
	 * Auther: Ritesh Anand
	 *  
	 */
	public static String getScreenShot(String strscreenshotName) {
		String newFileNamePath;
		String folderPath;
		String stepResult = "Fail";
		String absPath;
		
		try {
			
			DateFormat dateFormat = new SimpleDateFormat("MMM_dd_yyyy_hh_mm_ssaa");
			Date date = new Date();
			InetAddress ownIP = Inet4Address.getLocalHost();
			
			String ScreenShot_Path = LoadUIConstants.getConfigPropertyValue(UIConstants.SCREENSHOTPATH);
			
			folderPath = ScreenShot_Path + "\\" + AppGlobalVariable.strReleaseVar() + "\\" + AppGlobalVariable.strModuleName() + "\\" + AppGlobalVariable.strTestCase() + "\\" + AppGlobalVariable.strTestStep();
			stepResult = UtilitiesFunctions.utilCreateDirectory(folderPath);
			
			newFileNamePath = strscreenshotName + "_" + dateFormat.format(date) + ".jpg";
			
			File screenshotFile = ((TakesScreenshot) Driver.driver()).getScreenshotAs(OutputType.FILE);
			
			log.info("The folder path is: " +folderPath);
			File FilePath = new File(folderPath + newFileNamePath);
			Files.copy(screenshotFile,FilePath);
			
			absPath = FilePath.getAbsolutePath();
			log.info("File name is: " +newFileNamePath);
			return absPath;
		} catch (IOException er) {
			er.printStackTrace();
			log.info("Exception encountered while capturing the screenshot: " +er);
			return "FAIL | Error while capturing screenshot";
						
		}
		
	}
	
	

}
