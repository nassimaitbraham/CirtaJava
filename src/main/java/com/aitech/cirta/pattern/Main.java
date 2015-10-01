package com.aitech.cirta.pattern;

/**
 * Class principal de test
 * 
 * @author Nassim AIT BRAHAM ( AITECH CORPORATION)
 *
 */
public class Main {

	public static void main(String[] args) {

		// Test Singleton V1
		System.out.println("******* Test Singleton version 1 **********\n");
		// Premier appel du Singleton
		CirtaSingletonV1 cs1v1 = CirtaSingletonV1.getInstance();
		// Deuxieme appel du Singleton
		CirtaSingletonV1 cs2v1 = CirtaSingletonV1.getInstance();
		// Comparaison des deux instance
		if (cs1v1.equals(cs2v1)) {
			System.out.println("L'instance cs1v1 est égale un l'instance cs2v1");
		}

		// Test Singleton V2
		System.out.println("\n******* Test Singleton version 2 **********\n");
		// Premier appel du Singleton
		CirtaSingletonV2 cs1v2 = CirtaSingletonV2.getInstance();
		// Deuxieme appel du Singleton
		CirtaSingletonV2 cs2v2 = CirtaSingletonV2.getInstance();
		// Comparaison des deux instance
		if (cs1v2.equals(cs2v2)) {
			System.out.println("L'instance cs1v2 est égale un l'instance cs2v2");
		}

	}

}
