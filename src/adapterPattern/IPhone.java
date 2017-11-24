
package adapterPattern;

/**
 * A IPhone class implemented as a Driver class to demonstrate Adapter Design Pattern
 * @author Natnael Alemayehu
 *
 */
public class IPhone {
	
	/**
	 * A main method to run the application
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\nAdapter Pattern Implementation Example");
		System.out.println("-----------------------------------------------");
		
		//Create an instance of objects
		Socket socket = new ChargerAdapter();
		Charger charger = new Charger();
		
		//Calling a methods
		charger.setSocket(socket);
		charger.setVolt(12);
		charger.charging(charger.getVolt(), null);
	}

}
