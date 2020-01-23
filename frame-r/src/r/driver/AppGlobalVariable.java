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
	//Test Case
	public static ThreadLocal thestrTestCase = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return new String();
		}
	};
	
	public static void setstrTestCase(String strTestCase) {
		thestrTestCase.set(strTestCase);
	}
	
	public static String strTestCase() {
		return (String) thestrTestCase.get();
	}
	
	//Test Steps
	public static ThreadLocal thestrTestStep = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return new String();
		}
	};
	
	public static void setstrTestStep(String strTestStep) {
		thestrTestStep.set(strTestStep);
	}
	
	public static String strTestStep() {
		return (String) thestrTestStep.get();
	}
	
	//ReleaseVar
	public static ThreadLocal thestrReleaseVar = new ThreadLocal<String>() {
		@Override
		protected String initialValue() {
			return new String();
		}
	};
	
	public static void setstrReleaseVar(String strReleaseVar) {
		thestrReleaseVar.set(strReleaseVar);
	}
	
	public static String strReleaseVar() {
		return (String) thestrReleaseVar.get();
	}
	/*if needed add other parameter too*/

}
