package com.bcone.punetimetracking.testscripts;

import java.io.IOException;

/*import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;*/
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bcone.punetimetracking.base.Base;
import com.bcone.punetimetracking.excelreader.ExcelDataConfig;
import com.bcone.punetimetracking.pagelibrary.TimeTrackingForm;
import com.bcone.punetimetracking.utils.Utils;

public class PuneTimeTrackingForm  {
	
	//static Logger log = Logger.getLogger(TimeTrackingForm.class.getName());
	TimeTrackingForm form;
	Utils driverObj;
	
	@BeforeTest
	public void setUp() throws IOException {
		Base.init();
	}
	
	@SuppressWarnings("static-access")
	@Test(dataProvider="excelData")
	public void submitForm(String name, String workType, String dept, String caseNumber, String timeSpent) throws IOException, InterruptedException {
		//PropertyConfigurator.configure("Log4j.properties");
		driverObj = new Utils();
		form = new TimeTrackingForm();
		form.selectName(name);
		Thread.sleep(1000);
		form.selectWorkType(workType);
		form.selectRequestingDept(dept);
		form.enterCaseNumber(caseNumber);
		form.enterTimeSpent(timeSpent);
		
		//if(driverObj.driver.getPageSource().contains("Your response has been recorded.") == true)
			//log.info(caseNumber + " : " +"Success");
		//else
			//log.error(caseNumber + " : " +"Failure");
		//Thread.sleep(1000);
		//form.refreshBrowser();
		//Thread.sleep(1000);
	}
	
	@DataProvider(name="excelData")
	public Object[][] readData() {
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\shriniwas.alle\\workspace\\PuneTimeTracking\\src\\test\\resources\\testdata\\PTT.xlsx");
		int rows = config.getRowCount(0);
		int cols = config.getColCount(0);
		
		Object[][] data = new Object[rows-1][5];
		
		for (int i = 1; i < rows ; i++) {
			for (int j = 0; j < cols; j++) {
				data[i-1][j] = config.getData(0, i, j);
			}
		}
		return data;
	}
}