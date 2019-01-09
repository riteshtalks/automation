/**
 * 
 */
package r.runner;

import java.io.IOException;
import java.util.logging.Logger;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import r.driver.Driver;
import r.driver.LoadUIConstants;

/**
 * @author Ritesh Anand
 *
 */
public class Runner {
	
	private static Logger log = Logger.getLogger(Class.class.getName());
	
	@BeforeClass
	public void init() throws IOException{
		Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /f");
		Runtime.getRuntime().exec("taskkill /IM chrome.exe /f");
	}
	
	@Test
	public void executeSessionOne() {
		try {
			String strRunManager = LoadUIConstants.getConfigPropertyValue("RunModules");
			if(!strRunManager.trim().equalsIgnoreCase("")) {
				
				Driver objDriver = new Driver();
				objDriver.initialize();
				objDriver.startTests(LoadUIConstants.getConfigPropertyValue("RunModules"),"Thread1");
				
			} else {
				log.info("Thread 1 : Not initiated! No script to execute as run module is empty");
			}
			
			
		} catch (Exception e) {
			//Driver.driver().close();
		}
	}
	
	@Test
	public void executeSessionTwo() {
		try {
			String strRunManager = LoadUIConstants.getConfigPropertyValue("RunModules2");
			if(!strRunManager.trim().equalsIgnoreCase("")) {
					
					Driver objDriver = new Driver();
					objDriver.initialize();
					objDriver.startTests(LoadUIConstants.getConfigPropertyValue("RunModules2"),"Thread2");
					
				} else {
					log.info("Thread 2 : Not initiated! No script to execute as run module is empty");
				}				
			} catch (Exception e) {
				//Driver.driver().close();
			}
		}
		
		@Test
		public void executeSessionThree() {
			try {
				String strRunManager = LoadUIConstants.getConfigPropertyValue("RunModules3");
				if(!strRunManager.trim().equalsIgnoreCase("")) {
					
					Driver objDriver = new Driver();
					objDriver.initialize();
					objDriver.startTests(LoadUIConstants.getConfigPropertyValue("RunModlues3"),"Thread3");
					
				} else {
					log.info("Thread 3 : Not initiated! No script to execute as run module is empty");
				}
				
				
			} catch (Exception e) {
				//Driver.driver().close();
			}
		}

}
