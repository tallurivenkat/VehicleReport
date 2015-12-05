package com.adp.domain;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VehiclesTest</code> contains tests for the class <code>{@link Vehicles}</code>.
 *
 * @generatedBy CodePro at 12/4/15 9:30 PM
 * @author venkat
 * @version $Revision: 1.0 $
 */
public class VehiclesTest {
	/**
	 * Run the List<Vehicle> getVehicles() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetVehicles_1()
		throws Exception {
		Vehicles fixture = new Vehicles();
		fixture.setVehicles(new ArrayList<Vehicle>());

		List<Vehicle> result = fixture.getVehicles();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the void setVehicles(List<Vehicle>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testSetVehicles_1()
		throws Exception {
		Vehicles fixture = new Vehicles();
		fixture.setVehicles(new ArrayList<Vehicle>());
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		fixture.setVehicles(vehicles);

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
		new org.junit.runner.JUnitCore().run(VehiclesTest.class);
	}
}