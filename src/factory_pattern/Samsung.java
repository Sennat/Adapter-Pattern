package factory_pattern;

/**
 * This application implemented to demonstrate factory design pattern
 * @author Natnael Alemayehu
 *
 */
public class Samsung implements Mobile {

	private String name;
	private String model;
	private String color;
	private int ram;
	
	public Samsung(String name, String model, String color, int ram) {
		this.name = name;
		this.model = model;
		this.color = color;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
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
		return "\tSamsung:\n\t\t----------------------"
				+ "\n\t\tName:\t" + getName()
				+ "\n\t\tModel:\t" + getModel()
				+ "\n\t\tColor:\t" + getColor()
				+ "\n\t\tRam:\t" + getRam() + "\n";
	}
	
	
}
