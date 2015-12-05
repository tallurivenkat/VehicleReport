package com.adp.xml;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import com.adp.domain.Vehicle;
import com.adp.domain.Vehicles;

/**
 * The class <code>VechicleReportTest</code> contains tests for the class <code>{@link VechicleReport}</code>.
 *
 * @generatedBy CodePro at 12/4/15 9:30 PM
 * @author venkat
 * @version $Revision: 1.0 $
 */
public class VechicleReportTest {
	/**
	 * Run the void generateReport(Vehicles) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGenerateReport_1()
		throws Exception {
		VechicleReport fixture = VechicleReport.getInstence();
		Vehicles vehicles = new Vehicles();
		vehicles.setVehicles(new ArrayList<Vehicle>());

		fixture.generateReport(vehicles);

		// add additional test code here
	}

	/**
	 * Run the void generateReport(Vehicles) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGenerateReport_2()
		throws Exception {
		VechicleReport fixture = VechicleReport.getInstence();
		Vehicles vehicles = new Vehicles();
		vehicles.setVehicles(new ArrayList<Vehicle>());

		fixture.generateReport(vehicles);

		// add additional test code here
	}

	/**
	 * Run the void generateReport(Vehicles) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGenerateReport_3()
		throws Exception {
		VechicleReport fixture = VechicleReport.getInstence();
		Vehicles vehicles = new Vehicles();
		vehicles.setVehicles(new ArrayList<Vehicle>());

		fixture.generateReport(vehicles);

		// add additional test code here
	}

	/**
	 * Run the VechicleReport getInstence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetInstence_1()
		throws Exception {

		VechicleReport result = VechicleReport.getInstence();

		// add additional test code here
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(VechicleReportTest.class);
	}
}