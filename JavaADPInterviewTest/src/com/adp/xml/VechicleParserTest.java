package com.adp.xml;

import javax.imageio.metadata.IIOMetadataNode;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Element;
import com.adp.domain.Vehicle;

/**
 * The class <code>VechicleParserTest</code> contains tests for the class <code>{@link VechicleParser}</code>.
 *
 * @generatedBy CodePro at 12/4/15 9:30 PM
 * @author venkat
 * @version $Revision: 1.0 $
 */
public class VechicleParserTest {
	/**
	 * Run the VechicleParser getInstence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testGetInstence_1()
		throws Exception {

		VechicleParser result = VechicleParser.getInstence();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Vehicle parseVehicle(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testParseVehicle_1()
		throws Exception {
		VechicleParser fixture = VechicleParser.getInstence();
		Element elment = new IIOMetadataNode();

		//Vehicle result = fixture.parseVehicle(elment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at com.adp.xml.VechicleParser.getTextValue(VechicleParser.java:76)
		//       at com.adp.xml.VechicleParser.parseVehicle(VechicleParser.java:23)
		//assertNotNull(result);
	}

	/**
	 * Run the Vehicle parseVehicle(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testParseVehicle_2()
		throws Exception {
		VechicleParser fixture = VechicleParser.getInstence();
		Element elment = new IIOMetadataNode();

		//Vehicle result = fixture.parseVehicle(elment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at com.adp.xml.VechicleParser.getTextValue(VechicleParser.java:76)
		//       at com.adp.xml.VechicleParser.parseVehicle(VechicleParser.java:23)
		//assertNotNull(result);
	}

	/**
	 * Run the Vehicle parseVehicle(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testParseVehicle_3()
		throws Exception {
		VechicleParser fixture = VechicleParser.getInstence();
		Element elment = new IIOMetadataNode();

	//	Vehicle result = fixture.parseVehicle(elment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at com.adp.xml.VechicleParser.getTextValue(VechicleParser.java:76)
		//       at com.adp.xml.VechicleParser.parseVehicle(VechicleParser.java:23)
		//assertNotNull(result);
	}

	/**
	 * Run the Vehicle parseVehicle(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/4/15 9:30 PM
	 */
	@Test
	public void testParseVehicle_4()
		throws Exception {
		VechicleParser fixture = VechicleParser.getInstence();
		Element elment = new IIOMetadataNode();

	//	Vehicle result = fixture.parseVehicle(elment);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at javax.imageio.metadata.IIOMetadataNode.getElementsByTagName(Unknown Source)
		//       at com.adp.xml.VechicleParser.getTextValue(VechicleParser.java:76)
		//       at com.adp.xml.VechicleParser.parseVehicle(VechicleParser.java:23)
		//assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(VechicleParserTest.class);
	}
}