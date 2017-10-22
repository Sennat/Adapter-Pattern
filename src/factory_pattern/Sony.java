/* ************************************************************************************
 * Copyright (C) Oct 21, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 6:28:52 PM.
 * ************************************************************************************
 */

package factory_pattern;

/**
 * This application implemented to demonstrate factory design pattern
 * @author Natnael Alemayehu
 *
 */
public class Sony implements Mobile {
	
	private String name;
	private String model;
	private String proccesor;
	
	public Sony(String name, String model, String proccesor) {
		this.name = name;
		this.model = model;
		this.proccesor = proccesor;
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
	 * @return the proccesor
	 */
	public String getProccesor() {
		return proccesor;
	}

	/**
	 * @param proccesor the proccesor to set
	 */
	public void setProccesor(String proccesor) {
		this.proccesor = proccesor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\tSony:\n\t\t----------------------"
				+ "\n\t\tName:\t" + getName()
				+ "\n\t\tModel:\t" + getModel()
				+ "\n\t\tColor:\t" + getProccesor() + "\n";
		
	}

}
