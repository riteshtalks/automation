/**
 * 
 */
package r.driver;

import java.util.HashMap;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

/**
 * @author Ritesh Anand
 *
 */
public class Driver {
	
	/*The Log."*/
	private static Logger log = Logger.getLogger(Driver.class.getName());
	
	public static ThreadLocal thetestStatus = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return new String();
		}
	};
	
	public static void settestStatus(String strStatus) {
		thetestStatus.set(strStatus);
	}
	
	public static String testStatus() {
		return (String) thetestStatus.get();
	}
	
	public static ThreadLocal<HashMap<String, String>> mapdata = new ThreadLocal<HashMap<String, String>>(){
		protected HashMap<String, String> initValues(){
			return new HashMap<>();
		}
	};
	
	public static ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>() {
		protected WebDriver initValues() {
			String browserName = LoadUIConstants.getConfigPropertyValue(UIConstants.BROWSER_NAME);
			if(browserName.trim().toLowerCase().equals("chrome")) {
				//return new ChromeDriver();
				return null;
			} else {
				//return new InternetExplorerDriver();
				return null;
			}
		}
	};
	
	

	/**
	 * @return
	 */
	public static Object driver() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 */
	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param configPropertyValue
	 * @param string
	 */
	public void startTests(String configPropertyValue, String string) {
		// TODO Auto-generated method stub
		
	}

}
