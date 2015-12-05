package com.adp.domain;

public class Frame {

	private Vehicle parent;
	private String material;

	public Frame(String material) {
		this.material = material;
	}

	public Frame(String material, Vehicle parent) {
		this.material = material;
		this.parent = parent;
	}

	public String getMaterial() {
		return material;
	}

	public void changeMaterial(String material) {
		this.material = material;
	}

	public Vehicle getParent() {
		return parent;
	}

	public void setParent(Vehicle parent) {
		this.parent = parent;
	}
}
