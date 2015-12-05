package com.adp.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.adp.domain.Vehicle;
import com.adp.domain.Vehicles;

public class ReadXML {

	public static void main(String argv[]) {

		try {

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document document = dBuilder.parse(ClassLoader.getSystemResourceAsStream("xml/vehicle.xml"));

			document.getDocumentElement().normalize();
			List<Vehicle> vehicleList = new ArrayList<Vehicle>();
			NodeList nodeList = document.getElementsByTagName("vehicle");

			if (nodeList != null && nodeList.getLength() > 0) {
				for (int i = 0; i < nodeList.getLength(); i++) {
					// get the Vehicle element
					Element el = (Element) nodeList.item(i);
					// get the Vehicle object
					Vehicle vehicle = VechicleParser.getInstence().parseVehicle(el);
					vehicleList.add(vehicle);
				}
			}
			if (!vehicleList.isEmpty()) {
				Vehicles vehicles = new Vehicles();
				vehicles.setVehicles(vehicleList);
				VechicleReport.getInstence().generateReport(vehicles);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
