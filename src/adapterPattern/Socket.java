
package adapterPattern;

/**
 * A Socket interface to demonstrate Adapter Design Pattern
 * @author Natnael Alemayehu
 *
 */
public interface Socket {
		
	/**
	 * A method to charge a phone with specified volt
	 * @param volt
	 */
	public int charging(int volt);
	
	/**
	 * A method for a phone charger brand
	 * @param string A charger brand
	 */
	public void chargerType(String string);

}
