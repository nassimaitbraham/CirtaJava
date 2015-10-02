package com.aitech.cirta.pattern.observer;

public class Main {

	public static void main(String[] args) {

		// Definition d'un Eleve
		Eleve eleve0 = new Eleve();
		eleve0.setId(0);
		eleve0.setInfo("RAS");

		// Definition d'une classe
		Classe classeTerminal = new Classe();
		classeTerminal.setId(0);

		// Ajout d'un observateur
		classeTerminal.addObserver(eleve0);

		System.out.println("Avant la mise a jour de l'état : " + eleve0);
		classeTerminal.setEtat(true);
		System.out.println("Apres la mise a jour de l'état : " + eleve0);

	}

}
