package com.aitech.cirta.pattern;

/**
 * Defintion du pattern Singleton ( technique du double checking locking )
 * 
 * Synchronisation local
 * 
 * @author Nassim AIT BRAHAM ( AITECH CORPORATION)
 *
 */

public class CirtaSingletonV1 {

	// Initialisation du Singleton
	private static CirtaSingletonV1 cirtaSingletonV1 = null;

	// Declarer le constructeur par defaut private afin d'empecher toute
	// instanciation

	private CirtaSingletonV1() {

	}

	// Point d'entree unique du singleton qui retourne l'unique instance

	public static CirtaSingletonV1 getInstance() {

		if (cirtaSingletonV1 == null) {

			synchronized (CirtaSingletonV1.class) {

				if (cirtaSingletonV1 == null) {

					cirtaSingletonV1 = new CirtaSingletonV1();

				}
			}
		}
		return cirtaSingletonV1;
	}
}
