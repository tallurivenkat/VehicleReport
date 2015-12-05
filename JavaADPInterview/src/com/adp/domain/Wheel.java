package com.adp.domain;

public class Wheel {

	private Vehicle parent;
	private String position;
	private String material;

	public Wheel(String position, String material) {
		this.position = position;
		this.material = material;
	}

	public Wheel(String position, String material, Vehicle parent) {
		this.position = position;
		this.material = material;
		this.parent = parent;
	}

	public String getPosition() {
		return position;
	}

	public void changePosition(String position) {
		this.position = position;
	}

	public String getMaterial() {
		return material;
	}

	public void chmageMaterial(String material) {
		this.material = material;
	}

	public Vehicle getParent() {
		return parent;
	}

	public void setParent(Vehicle parent) {
		this.parent = parent;
	}
}
