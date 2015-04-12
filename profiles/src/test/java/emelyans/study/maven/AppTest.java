package emelyans.study.maven;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
@Test
public class AppTest {

	final private Logger logger = Logger.getLogger(this.getClass());
	
	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		logger.debug(System.getProperty("env"));
		Assert.assertTrue(true);
	}
}
