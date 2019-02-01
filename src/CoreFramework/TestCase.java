package CoreFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCase {
	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	@Parameters({ "deviceName", "deviceUid", "androidVersion" })
	public static void setupDriver(String deviceName, String deviceUid, String androidVersion) throws Exception {

		try {

			String appPackage = ExternalFileConfiguration.appPackage;
			String appActivity = ExternalFileConfiguration.appActivity;
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("deviceName", deviceName);
			caps.setCapability("udid", deviceUid); // Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", androidVersion);
			caps.setCapability("appPackage", appPackage);
			caps.setCapability("appActivity", appActivity);
			caps.setCapability("noReset", "true");
			driver = new AndroidDriver<MobileElement>(new URL(ExternalFileConfiguration.appiumServerURL), caps);
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
//		if (browser.trim().equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browser.trim().equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver",
//					ExternalFileConfiguration.seleniumDirectory + "chromedriver.exe");
//			System.out.println(ExternalFileConfiguration.seleniumDirectory + "chromedriver.exe");
//			driver = new ChromeDriver();
//		}
//		// other driver browser goes here
//		else {
//			throw new Exception("Browser is not correct");
//
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(ExternalFileConfiguration.globalWaitingTime, TimeUnit.SECONDS);
//		driver.navigate().to(ExternalFileConfiguration.testURL);
	}

	@AfterTest
	public void closeupDriver() throws InterruptedException {
//		Thread.sleep(2000);
//		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
//				.format(new Timestamp(System.currentTimeMillis()));
//		try {
//			FileUtils.copyFile(scrFile, new File(ExternalFileConfiguration.defaultDirectory + "Screenshot\\"
//					+ this.getClass().getName() + timeStamp + ".png"));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		driver.close();
	}
}
