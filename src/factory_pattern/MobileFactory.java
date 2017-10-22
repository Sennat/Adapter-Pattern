package factory_pattern;

/**
 * This application implemented to demonstrate factory design pattern
 * @author Natnael Alemayehu
 *
 */
public class MobileFactory {
	
	public static Mobile createMobile(String type) {
		if(type.equals(Mobile.SAMSUNG)) {
			return new Samsung("Samsung", "Galaxy S7", "Silver", 2);
		}else if(type.equals(Mobile.MOTOROLA)) {;
			return new Motorola("Motorola","GL200", 1);
		}else if(type.equals(Mobile.SONY)) {
			return new Sony("Sony", "Ericson", "Intel");
		}else {
			return null;
		}
	
	}

}
