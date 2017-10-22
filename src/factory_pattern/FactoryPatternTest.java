/* ************************************************************************************
 * Copyright (C) Oct 21, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 6:33:24 PM.
 * ************************************************************************************
 */

package factory_pattern;

import java.util.Scanner;

/**
 * This application implemented to demonstrate factory design pattern
 * @author Natnael Alemayehu
 *
 */
public class FactoryPatternTest {
	
	public static void main(String[] args) {
		System.out.println("\nFactory pattern test application");
		System.out.println("----------------------------------------------------------------------------------");
		//MobileFactory factory = new MobileFactory();
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Select your mobile phone (Samsung, Motorola, Sony) or \"E\" for exit: ");
			String name = scan.next().toUpperCase();		
			if(name.equals("SAMSUNG")){
				Mobile mobile = MobileFactory.createMobile(Mobile.SAMSUNG);
				System.out.println("\nPhone type:" + mobile);
			}else if(name.equals("MOTOROLA")) {
				Mobile mobile = MobileFactory.createMobile(Mobile.MOTOROLA);
				System.out.println("\nPhone type:" + mobile);				
			}else if(name.equals("SONY")) {
				Mobile mobile = MobileFactory.createMobile(Mobile.SONY);
				System.out.println("\nPhone type:" + mobile);				
			}else if(name.equals("E") || name.equals("e")) {
				System.exit(0);
			}

		}while(true);
	}

}
