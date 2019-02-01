package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import CoreFramework.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorDefaultPage extends BasePage {

	private static By btnMultiplySign = By.xpath("//android.widget.Button[@content-desc='Multiplication']");
	private static By btnEqual = By.xpath("//android.widget.Button[@content-desc='Equal']");
	private static By txtResult = By.className("android.widget.EditText");

	private By getDigitButton(String digit) {
		return By.xpath("//android.widget.Button[@content-desc='" + digit + "']");
	}

	private static AppiumDriver<MobileElement> driver;

	public CalculatorDefaultPage(AppiumDriver<MobileElement> driver) {
		super(driver, btnEqual);
		this.driver = driver;
	}

	public void enterNumber(String number) throws Exception {
		char[] digits = number.toCharArray();

		for (int i = 0; i < digits.length; i++) {
			if (!Character.isDigit(number.charAt(i))) {
				throw new Exception("Not_A_Digit");
			} else {
				String s = String.valueOf(digits[i]);
				this.Click(this.getDigitButton(s));
				// driver.findElement(this.getDigitButton(s)).click();
			}

		}
	}

	public void multiplyOfTwoNumber(String firstNumber, String secondNumber) throws Exception {
		this.enterNumber(firstNumber);
		// driver.findElement(btnMultiplySign).click();
		this.Click(btnMultiplySign);
		this.enterNumber(secondNumber);
		// driver.findElement(btnEqual).click();
		this.Click(btnEqual);
	}

	public void isCorrectNumber(String numberToCheck) {
		String result = driver.findElement(this.txtResult).getText();
		Assert.assertEquals(numberToCheck, result, "Expected result: " + numberToCheck + "; Actual result: " + result);
	}

}
