package com.bcone.punetimetracking.pagelibrary;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bcone.punetimetracking.base.Base;

public class TimeTrackingForm extends Base {

	//static Logger log = Logger.getLogger(TimeTrackingForm.class.getName());

	WebElement dropDown = driver.findElement(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]"));

	/**
	 * Work Type locators
	 */
	WebElement assortmentWorkType = driver.findElement(By.xpath("//span[text()='Assortment']"));
	WebElement consolidateReports = driver.findElement(By.xpath("//span[text()='Consolidate Reports']"));
	WebElement DC3Migration = driver.findElement(By.xpath("//span[text()='DC3 Migration']"));
	WebElement gatherTestFiles = driver.findElement(By.xpath("//span[text()='Gather Test Files']"));
	WebElement mapping = driver.findElement(By.xpath("//span[text()='Mapping']"));
	WebElement newSetupRequest = driver.findElement(By.xpath("//span[text()='New Setup Request']"));
	WebElement pto = driver.findElement(By.xpath("//span[text()='PTO']"));
	WebElement productionDataMonitoring = driver.findElement(By.xpath("//span[text()='Production Data Monitoring']"));
	WebElement regressionTest = driver.findElement(By.xpath("//span[text()='Regression Test']"));
	WebElement tNcWorkType = driver.findElement(By.xpath("//span[text()='T&C']"));
	WebElement testingDocument = driver.findElement(By.xpath("//span[text()='Testing document']"));
	WebElement training = driver.findElement(By.xpath("//span[text()='Training']"));
	WebElement unassignedTime = driver.findElement(By.xpath("//span[text()='Unassigned time']"));
	WebElement webFulfillmentWorkType = driver.findElement(By.xpath("//span[text()='Web Fulfillment']"));
	WebElement performanceHealth = driver.findElement(By.xpath("//span[text()='Performance Health']"));
	WebElement analyticsReportMonitoring = driver.findElement(By.xpath("//span[text()='Analytics Report Monitoring']"));
	
	WebElement caseNumber = driver.findElement(By.xpath("//input[@aria-label='Case Number (Example FICS-xxxx) or Summary']"));
	WebElement timeSpent = driver.findElement(By.xpath("//input[@aria-label='Hours spent']"));
	

	/**
	 * Requesting Department locators
	 */
	WebElement netsuite = driver.findElement(By.xpath("//span[text()='NetSuite']"));
	WebElement regression = driver.findElement(By.xpath("//span[text()='Regression']"));
	WebElement webFulfillmentDept = driver.findElement(By.xpath("//span[text()='Web Fulfillment']"));
	WebElement tncDept = driver.findElement(By.xpath("//span[text()='T&C']"));
	WebElement assortmentDept = driver.findElement(By.xpath("//span[text()='Assortment']"));
	WebElement unknown = driver.findElement(By.xpath("//span[text()='Unknown']"));
	WebElement partner = driver.findElement(By.xpath("//span[text()='Partner']"));
	WebElement premier = driver.findElement(By.xpath("//span[text()='Premier']"));
	WebElement dni = driver.findElement(By.xpath("//span[text()='DNI']"));
	WebElement Pl3 = driver.findElement(By.xpath("//span[text()='3PL']"));
	WebElement australia = driver.findElement(By.xpath("//span[text()='Australia']"));
	WebElement analytics = driver.findElement(By.xpath("//span[text()='Analytics']"));

	/**
	 * @param = 'EmpName' 
	 * This method will get an employee name from the excel sheet
	 * */
	public void selectName(String empName) throws InterruptedException {
		dropDown.click();
		Thread.sleep(300);

		List<WebElement> dropdownname = driver.findElements(By.xpath(".//*[@id='mG61Hd']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div"));

		for (WebElement webElement : dropdownname) {
			String name = webElement.getText();
			if (name.trim().equalsIgnoreCase(empName)) {
				webElement.click();
			}
		}
	}

	/**
	 * @param = workType
	 * This method will get an Work Type from the excel sheet
	 * */
	public void selectWorkType(String workType) {
	
		if (assortmentWorkType.getText().trim().trim().equalsIgnoreCase(workType)) {
			assortmentWorkType.click();
		} else if (consolidateReports.getText().trim().trim().equalsIgnoreCase(workType)) {
			consolidateReports.click();
		} else if (DC3Migration.getText().trim().trim().equalsIgnoreCase(workType)) {
			DC3Migration.click();
		} else if (gatherTestFiles.getText().trim().trim().equalsIgnoreCase(workType)) {
			gatherTestFiles.click();
		} else if (mapping.getText().trim().equalsIgnoreCase(workType)) {
			mapping.click();
		} else if (newSetupRequest.getText().trim().equalsIgnoreCase(workType)) {
			newSetupRequest.click();
		} else if (pto.getText().trim().equalsIgnoreCase(workType)) {
			pto.click();
		} else if (productionDataMonitoring.getText().trim().equalsIgnoreCase(workType)) {
			productionDataMonitoring.click();
		} else if (regressionTest.getText().trim().equalsIgnoreCase(workType)) {
			regressionTest.click();
		} else if (tNcWorkType.getText().trim().equalsIgnoreCase(workType)) {
			tNcWorkType.click();
		} else if (testingDocument.getText().trim().equalsIgnoreCase(workType)) {
			testingDocument.click();
		} else if (training.getText().trim().equalsIgnoreCase(workType)) {
			training.click();
		} else if (unassignedTime.getText().trim().equalsIgnoreCase(workType)) {
			unassignedTime.click();
		} else if (webFulfillmentWorkType.getText().trim().equalsIgnoreCase(workType)) {
			webFulfillmentWorkType.click();
		} else if (performanceHealth.getText().trim().equalsIgnoreCase(workType)) {
			performanceHealth.click();
		} else if (analyticsReportMonitoring.getText().trim().equalsIgnoreCase(workType)) {
			analyticsReportMonitoring.click();
		}
	}
	
	/**
	 * @param = RequestingDept
	 * This method will get an Requesting Department from the excel sheet
	 * */
	public void selectRequestingDept(String reqDept) {

		if (netsuite.getText().trim().equalsIgnoreCase(reqDept)) {
			netsuite.click();
		} else if (regression.getText().trim().equalsIgnoreCase(reqDept)) {
			regression.click();
		} else if (webFulfillmentDept.getText().trim().equalsIgnoreCase(reqDept)) {
			webFulfillmentDept.click();
		} else if (tncDept.getText().trim().equalsIgnoreCase(reqDept)) {
			tncDept.click();
		} else if (assortmentDept.getText().trim().equalsIgnoreCase(reqDept)) {
			assortmentDept.click();
		} else if (unknown.getText().trim().equalsIgnoreCase(reqDept)) {
			unknown.click();
		} else if (partner.getText().trim().equalsIgnoreCase(reqDept)) {
			partner.click();
		} else if (premier.getText().trim().equalsIgnoreCase(reqDept)) {
			premier.click();
		} else if (dni.getText().trim().equalsIgnoreCase(reqDept)) {
			dni.click();
		} else if (Pl3.getText().trim().equalsIgnoreCase(reqDept)) {
			Pl3.click();
		} else if (australia.getText().trim().equalsIgnoreCase(reqDept)) {
			australia.click();
		} else if (analytics.getText().trim().equalsIgnoreCase(reqDept)) {
			analytics.click();
		}
	}

	/**
	 * @param = CaseNumber
	 * This method will get Case Number or Summary from the excel sheet
	 * */
	public void enterCaseNumber(String summary) {
		caseNumber.sendKeys(summary);
	}

	/**
	 * @param = TimeSpent
	 * This method will get Time Spent value from the excel sheet
	 * */
	public void enterTimeSpent(String time) {
		timeSpent.sendKeys(time);
	}

	/**
	 * This method will submit the form
	 * */
	public void clickSubmitButton() {
		//submitButton.click();
	}

	/**
	 * This method will refresh the browser once the form is submitted
	 * */
	public void refreshBrowser() {
		driver.navigate().refresh();
	}

}
