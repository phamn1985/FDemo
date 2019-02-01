package CoreFramework;

public class ExternalFileConfiguration {
	public static String defaultDirectory = "D:\\FossilData\\";
	public static String appPackage = "com.sec.android.app.popupcalculator";
	public static String appActivity = "Calculator";
	public static String appiumServerURL = "http://0.0.0.0:4723/wd/hub";
	public static String testDataDirectory = defaultDirectory + "TestData\\";
	public static String testDataFile = testDataDirectory + "DemoCalculation.xlsx";
	public static String testDataSheetName = "twoNumbers";
	public static int testdataheaderRowIndex = 1;
	public static String xmlresultDirectory = defaultDirectory + "test-output\\testng-results.xml";
	public static String defaultsuiteName = "demosuite";
	public static String defaulttestplanDirectory = defaultDirectory + "TestPlan\\";
	public static String testplanFile = defaulttestplanDirectory + "TestPlan.xlsx";
	public static String testplandefaultSheet = "Demo123";
	public static int globalWaitingTime = 15;
	public static String nullString = "N/A";
	public static String DateformatMMDDYYYY = "MM-DD-YYYY";
	public static String DateformatKKMMSS = "kk:mm:ss";
}
