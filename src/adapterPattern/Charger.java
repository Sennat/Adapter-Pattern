
package adapterPattern;

/**
 * A Charger class to demonstrate Adapter Design Pattern
 * @author Natnael Alemayehu
 *
 */
public class Charger {
	
	//Fields
	private Socket socket;
	private int volt;	
	
	/**
	 * A getter to get a socket
	 * @return the socket
	 */
	public Socket getSocket() {
		return socket;
	}

	/**
	 * A setter to set a socket
	 * @param socket the socket to set
	 */
	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	/**
	 * A getter to get a volt
	 * @return the volt
	 */
	public int getVolt() {
		return volt;
	}

	/**
	 * A setter to set a volt
	 * @param volt the volt to set
	 */
	public void setVolt(int volt) {
		this.volt = volt;
	}

	/**
	 * A method to print out IPhone is charging with a Samsung adapter
	 * @param volt
	 * @param str
	 */
	public void charging(int volt, String str) {
		System.out.println("IPhone is charging with " + volt + " volt a USB Samsung charger.");
		System.out.println("25% remaning to full charge.\n\n");
	}
	
}
