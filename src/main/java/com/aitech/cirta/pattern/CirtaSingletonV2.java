package com.aitech.cirta.pattern;

/**
 * Defintion du pattern Singleton (technique du Holder)
 * 
 * @author Nassim AIT BRAHAM ( AITECH CORPORATION)
 *
 */

public class CirtaSingletonV2 {

	// Declarer le constructeur par defaut private afin d'empecher toute
	// instanciation

	private CirtaSingletonV2() {

	}

	// Declaration du Holder - Class interne

	private static class CirtaSingletonHolder {

		private final static CirtaSingletonV2 cirtaSingletonV2 = new CirtaSingletonV2();

	}

	// Point d'entree unique du singleton qui retourne l'unique instance

	public static CirtaSingletonV2 getInstance() {
		return CirtaSingletonHolder.cirtaSingletonV2;
	}

}
