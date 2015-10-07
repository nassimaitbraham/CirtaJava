package com.aitech.cirta.lambda;

/**
 * Classe Principal
 * 
 * @author Nassim AIT BRAHAM ( AITECH CORPORATION)
 *
 */

public class Main {

	public static void main(String[] args) {

		/**
		 * Utilisation de la methode classique
		 */
		
		// Implementation de l'interface Personne
		Personne personne = new Personne() {
			@Override
			public void afficherPersonne(String name, String prenom) {
				System.out.println(" mehtode normal :  " + name + " " + prenom);

			}
		};

		personne.afficherPersonne("nassim", "AITECH");
		
		/**
		 * Utilisation des lambda JAVA 8 
		 */

		// Implementation de l'interface Personne
		Personne personneLambda = (String name, String prenom) -> {
			System.out.println(" mehtode avec des lambda : Bonjour " + name + " " + prenom);
		};

		// Appel de la methode afficherPersonne
		personneLambda.afficherPersonne("nassim", "AITECH");

	}

}
