package com.adp.exceptions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VehicleIDNullExceptionTest</code> contains tests for the class <code>{@link VehicleIDNullException}</code>.
 *
 * @generatedBy CodePro at 12/4/15 9:30 PM
 * @author venkat
 * @version $Revision: 1.0 $
 */
public class VehicleIDNullExceptionTest {
	/**
	 * Run the VehicleIDNullException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicleIDNullException_1()
		throws Exception {

		VehicleIDNullException result = new VehicleIDNullException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getCause());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the VehicleIDNullException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicleIDNullException_2()
		throws Exception {
		String message = "";

		VehicleIDNullException result = new VehicleIDNullException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getMessage());
		assertEquals(null, result.getCause());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the VehicleIDNullException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicleIDNullException_3()
		throws Exception {
		Throwable cause = new Throwable();

		VehicleIDNullException result = new VehicleIDNullException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the String getMessage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetMessage_1()
		throws Exception {
		VehicleIDNullException fixture = new VehicleIDNullException("");

		String result = fixture.getMessage();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		VehicleIDNullException fixture = new VehicleIDNullException("");

		String result = fixture.toString();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(VehicleIDNullExceptionTest.class);
	}
}