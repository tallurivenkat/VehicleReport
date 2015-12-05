package com.adp.domain;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>VehicleTest</code> contains tests for the class <code>{@link Vehicle}</code>.
 *
 * @generatedBy CodePro at 12/4/15 9:30 PM
 * @author venkat
 * @version $Revision: 1.0 $
 */
public class VehicleTest {
	/**
	 * Run the Vehicle() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicle_1()
		throws Exception {

		Vehicle result = new Vehicle();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getFrame());
		assertEquals(null, result.getWheels());
		assertEquals(null, result.getPowertrain());
	}

	/**
	 * Run the Vehicle(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicle_2()
		throws Exception {
		String id = null;

		Vehicle result = new Vehicle(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getId());
		assertEquals(null, result.getFrame());
		assertEquals(null, result.getWheels());
		assertEquals(null, result.getPowertrain());
	}

	/**
	 * Run the Vehicle(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicle_3()
		throws Exception {
		String id = "";

		Vehicle result = new Vehicle(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.getId());
		assertEquals(null, result.getFrame());
		assertEquals(null, result.getWheels());
		assertEquals(null, result.getPowertrain());
	}

	/**
	 * Run the Vehicle(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testVehicle_4()
		throws Exception {
		String id = "a";

		Vehicle result = new Vehicle(id);

		// add additional test code here
		assertNotNull(result);
		assertEquals("a", result.getId());
		assertEquals(null, result.getFrame());
		assertEquals(null, result.getWheels());
		assertEquals(null, result.getPowertrain());
	}

	/**
	 * Run the void addWheels(Wheel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testAddWheels_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));
		Wheel wheel = new Wheel("", "");

		fixture.addWheels(wheel);

		// add additional test code here
	}

	/**
	 * Run the void addWheels(Wheel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testAddWheels_2()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));
		Wheel wheel = new Wheel("", "");

		fixture.addWheels(wheel);

		// add additional test code here
	}

	/**
	 * Run the Frame getFrame() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetFrame_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));

		Frame result = fixture.getFrame();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getParent());
		assertEquals("", result.getMaterial());
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetId_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));

		String result = fixture.getId();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Powertrain getPowertrain() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetPowertrain_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));

		Powertrain result = fixture.getPowertrain();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getType());
	}

	/**
	 * Run the List<Wheel> getWheels() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetWheels_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));

		List<Wheel> result = fixture.getWheels();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the void setFrame(Frame) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testSetFrame_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));
		Frame frame = new Frame("");

		fixture.setFrame(frame);

		// add additional test code here
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testSetId_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));
		String id = "";

		fixture.setId(id);

		// add additional test code here
	}

	/**
	 * Run the void setPowertrain(Powertrain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testSetPowertrain_1()
		throws Exception {
		Vehicle fixture = new Vehicle("");
		fixture.setPowertrain(new Powertrain());
		fixture.setFrame(new Frame(""));
		fixture.addWheels(new Wheel("", ""));
		Powertrain powertrain = new Powertrain();

		fixture.setPowertrain(powertrain);

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
		new org.junit.runner.JUnitCore().run(VehicleTest.class);
	}
}