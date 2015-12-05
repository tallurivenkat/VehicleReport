package com.adp.domain;

import java.util.ArrayList;
import java.util.List;

import com.adp.exceptions.VehicleIDNullException;

public class Vehicle {
	private String id;
	private Frame frame;
	private List<Wheel> wheels;
	private Powertrain powertrain;

	public Vehicle(String id) {
		if (id == null || id.length() == 0)
			try {
				throw new VehicleIDNullException("Vehicle ID can not be null!");
			} catch (VehicleIDNullException e) {
			}
		this.id = id;
	}

	public Vehicle() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void addWheels(Wheel wheel) {
		if (wheels == null)
			this.wheels = new ArrayList<>();
		this.wheels.add(wheel);
	}

	public Powertrain getPowertrain() {
		return powertrain;
	}

	public void setPowertrain(Powertrain powertrain) {
		this.powertrain = powertrain;
	}

}
