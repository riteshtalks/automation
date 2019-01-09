/**
 * 
 */
package r.driver;

/**
 * @author Ritesh Anand
 *
 * The Class AppGlobalVariable contains all the application Global variable
 */
public class AppGlobalVariable {
	
	public static String RUN_ENV;
	public static Integer Sleep_Time;
	public static Integer Refresh_Wait;
	
	public static String strModuleName;
	
	public static ThreadLocal thestrModuleName = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return new String();
		}
	};
	
	public static void setstrModuleName(String strModuleName) {
		thestrModuleName.set(strModuleName);
	}
	
	public static String strModuleName() {
		return (String) thestrModuleName.get();
	}
	
	/*if needed add other parameter too*/

}
