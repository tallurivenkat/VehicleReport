package com.adp.xml;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.adp.domain.Frame;
import com.adp.domain.Powertrain;
import com.adp.domain.Vehicle;
import com.adp.domain.Wheel;

public class VechicleParser {

	private static VechicleParser parser = new VechicleParser();

	private VechicleParser() {
	}

	public static VechicleParser getInstence() {
		return parser;
	}

	public Vehicle parseVehicle(Element elment) {
		String id = getTextValue(elment, "id");
		Vehicle vehicle = new Vehicle(id);
		NodeList nodeList = elment.getElementsByTagName("wheel");

		if (nodeList != null && nodeList.getLength() > 0) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element el = (Element) nodeList.item(i);
				addWheels(el, vehicle);
			}
		}

		nodeList = elment.getElementsByTagName("frame");
		if (nodeList != null && nodeList.getLength() > 0) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element el = (Element) nodeList.item(i);
				addFrame(el, vehicle);
			}
		}
		nodeList = elment.getElementsByTagName("powertrain");

		if (nodeList != null && nodeList.getLength() > 0) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element el = (Element) nodeList.item(i);
				addPowertrain(el, vehicle);
			}
		}

		return vehicle;
	}

	private void addWheels(Element elment, Vehicle vehicle) {
		String position = getTextValue(elment, "position");
		String material = getTextValue(elment, "material");
		Wheel wheel = new Wheel(position, material, vehicle);
		vehicle.addWheels(wheel);
	}

	private void addFrame(Element elment, Vehicle vehicle) {
		String material = getTextValue(elment, "material");
		Frame frame = new Frame(material, vehicle);
		vehicle.setFrame(frame);
	}

	private Powertrain addPowertrain(Element elment, Vehicle vehicle) {
		String type = getTextValue(elment, "human");
		Powertrain powertrain = new Powertrain();
		powertrain.setType(type);

		return powertrain;
	}

	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if (nl != null && nl.getLength() > 0) {
			Element el = (Element) nl.item(0);
			if (el.getFirstChild() != null)
				textVal = el.getFirstChild().getNodeValue();
			else
				textVal = el.getTagName();
		}

		return textVal;
	}
}
