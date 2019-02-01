package CoreFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public abstract class BasePage extends BaseComponent {

	public By pageVerifyElementLocator;
	public String pageURL;
	private static AppiumDriver<MobileElement> driver;
	private static Logger logger = Logger.getLogger("BasePage");

	public BasePage(AppiumDriver<MobileElement> driver, By pageVerifyElementLocator) {
		super(driver);
		this.driver = driver;
		this.pageVerifyElementLocator = pageVerifyElementLocator;
	}

}
