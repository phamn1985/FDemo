package TestCases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import CoreFramework.ExcelFileReader;
import CoreFramework.ExternalFileConfiguration;
import CoreFramework.TestCase;
import DataDriven.ReadCell;
import Pages.CalculatorDefaultPage;;

public class SimpleMultiplyOfTwoNumbers extends TestCase {
	private static Logger logger = Logger.getLogger(SimpleMultiplyOfTwoNumbers.class);
	private CalculatorDefaultPage defaultPage;

	String testcasename = "Simple Multiply Of Two Numbers";

	@Test
	public void executeTestCase() throws Exception {
		defaultPage = new CalculatorDefaultPage(TestCase.driver);
		String filter = "multiple";
		for (int i = 0; i < ExcelFileReader
				.returnAllRowsCells(ExternalFileConfiguration.testDataFile, ExternalFileConfiguration.testDataSheetName)
				.size() - 1; i++) {
			String firstNumber = ReadCell.cellValuesByColumnName(i, filter, "firstNumber");
			String secondNumber = ReadCell.cellValuesByColumnName(i, filter, "secondNumber");
			logger.info("Multiply with first number: " + firstNumber + " and secondNumber: " + secondNumber);
			defaultPage.multiplyOfTwoNumber(firstNumber, secondNumber);
			String resultExpected = ReadCell.cellValuesByColumnName(i, filter, "expectedResult");
			defaultPage.isCorrectNumber(resultExpected);
		}
	}
}
