package com.adp.xml;

import com.adp.domain.Vehicle;
import com.adp.domain.Vehicles;
import com.adp.domain.Wheel;

public class VechicleReport {
	private static VechicleReport generator = new VechicleReport();

	private VechicleReport() {
	}

	public static VechicleReport getInstence() {
		return generator;
	}

	public void generateReport(Vehicles vehicles) {
		System.out.println("************Vechicle Report******************************");
		for (Vehicle vehicle : vehicles.getVehicles()) {
			System.out.println("Vehicle Id: "+vehicle.getId()+" Frame Material: "+vehicle.getFrame().getMaterial());
			System.out.println("Wheel Material:");
			for (Wheel wheel : vehicle.getWheels()) {
				System.out.println(wheel.getMaterial());
			}
			System.out.println();
		}
	}

	/*
	 * 
	 * Vehicle Id: <vehicle id 1> Frame Material: <frame material> Wheel
	 * Material: <wheel material>
	 * 
	 * Vehicle Id: <vehicle id 2> Frame Material: <frame material> Wheel
	 * Material: <wheel material>
	 * 
	 * Vehicle Id: <vehicle id n> Frame Material: <frame material> Wheel
	 * Material: <wheel material>
	 */
}
