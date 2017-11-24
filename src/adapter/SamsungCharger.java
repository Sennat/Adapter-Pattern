
package adapter;

/**
 * A SamsungCharger class to demonstrate Adapter Design Pattern
 * @author Natnael Alemayehu
 *
 */
public class SamsungCharger {

	//Field with volt to charge a phone
	public int volt;
	
	/**
	 * A method to print out the type of a charger and charger brand
	 * @param volt
	 * @param str
	 */
	public void usbCharger(int volt, String str) {
		System.out.println(str + volt + str);
	}

	/**
	 * A method to print out the phone is charging
	 * @param str
	 */
	public void charging(String str) {
		System.out.println(str);
	}

}
