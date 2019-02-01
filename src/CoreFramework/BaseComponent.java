package CoreFramework;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseComponent {
	private static Logger logger = Logger.getLogger(BaseComponent.class.getName());

	private static AppiumDriver<MobileElement> driver;
	WebDriverWait wait;

	public BaseComponent(AppiumDriver<MobileElement> driver) {
		this.driver = driver;

		wait = (WebDriverWait) new WebDriverWait(driver, ExternalFileConfiguration.globalWaitingTime);
	}

	public void sleep(int Second) {
		try {
			Thread.sleep(Second);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void Click(By elementToClick) {
		wait.until(ExpectedConditions.elementToBeClickable(elementToClick));
		driver.findElement(elementToClick).click();
	}

}
