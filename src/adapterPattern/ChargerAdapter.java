
package adapterPattern;

import adapter.SamsungCharger;
/**
 * A ChargerAdapter class implements Socket interface to demonstrate 
 * Adapter Design Pattern
 * @author Natnael Alemayehul
 *
 */
public class ChargerAdapter implements Socket {

	//Instantiation of an object
	SamsungCharger samCharger = new SamsungCharger();

	/**
	 * A method to charge a phone with specified volt
	 * @param volt
	 */
	@Override
	public int charging(int volt) {
		return volt;
	}

	/**
	 * A method for a phone charger brand
	 * @param string A charger brand
	 */
	@Override
	public void chargerType(String str) {
		System.out.println(str);	
	}

}
