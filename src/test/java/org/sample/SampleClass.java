package org.sample;

import static org.testng.Assert.assertEquals;
import java.util.Date;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClass extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserlaunch("edge");
		geturl("https://www.amazon.in/");
		implicitlyWait(20);
	}

	@AfterClass
	private void afterClass() {
		// quit();
	}

	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date();
		System.out.println("start time" + d);
	}

	@AfterMethod
	private void afterMethod() {
		Date d = new Date();
		System.out.println("end time" + d);

	}

	@Test
	private void test() throws InterruptedException {
		LocatorClass l = new LocatorClass();
		selectByvisibleText(l.getAll(), "Electronics");
		geturl("https://www.amazon.in/");
		sendkeys(l.getMobilesearch(), "lava mobile");
		click(l.getBtnclick());
		click(l.getPrice());
		threadsleep(5000);
		click(l.getLavaBlaze5G());
		switchWindowIndex(1);
		click(l.getAddtocart());
		click(l.getClosebtn());
     	click(l.getCart1());
		

	}
}
