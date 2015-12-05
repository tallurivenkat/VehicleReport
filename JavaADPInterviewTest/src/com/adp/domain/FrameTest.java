package com.adp.domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FrameTest</code> contains tests for the class <code>{@link Frame}</code>.
 *
 * @generatedBy CodePro at 12/4/15 9:30 PM
 * @author venkat
 * @version $Revision: 1.0 $
 */
public class FrameTest {
	/**
	 * Run the Frame(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testFrame_1()
		throws Exception {
		String material = "";

		Frame result = new Frame(material);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getParent());
		assertEquals("", result.getMaterial());
	}

	/**
	 * Run the Frame(String,Vehicle) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testFrame_2()
		throws Exception {
		String material = "";
		Vehicle parent = new Vehicle();

		Frame result = new Frame(material, parent);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getMaterial());
	}

	/**
	 * Run the void changeMaterial(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testChangeMaterial_1()
		throws Exception {
		Frame fixture = new Frame("", new Vehicle());
		String material = "";

		fixture.changeMaterial(material);

		// add additional test code here
	}

	/**
	 * Run the String getMaterial() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetMaterial_1()
		throws Exception {
		Frame fixture = new Frame("", new Vehicle());

		String result = fixture.getMaterial();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Vehicle getParent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		Frame fixture = new Frame("", new Vehicle());

		Vehicle result = fixture.getParent();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getFrame());
		assertEquals(null, result.getPowertrain());
		assertEquals(null, result.getWheels());
	}

	/**
	 * Run the void setParent(Vehicle) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testSetParent_1()
		throws Exception {
		Frame fixture = new Frame("", new Vehicle());
		Vehicle parent = new Vehicle();

		fixture.setParent(parent);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(FrameTest.class);
	}
}