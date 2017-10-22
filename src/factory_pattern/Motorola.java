/* ************************************************************************************
 * Copyright (C) Oct 21, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 6:19:16 PM.
 * ************************************************************************************
 */

package factory_pattern;

/**
 * This application implemented to demonstrate factory design pattern
 * @author Natnael Alemayehu
 *
 */
public class Motorola implements Mobile {
	
	private String name;
	private String model;
	private int ram;
	
	public Motorola(String name, String model, int ram){
		this.name = name;
		this.model = model;
		this.ram = ram;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\tMotorola:\n\t\t----------------------"
				+ "\n\t\tName:\t" + getName()
				+ "\n\t\tModel:\t" + getModel()
				+ "\n\t\tRam:\t" + getRam() + "\n";
	}

}
