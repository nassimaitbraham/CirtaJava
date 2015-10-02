package com.aitech.cirta.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Partie Observateur
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class Eleve implements Observer {

	private int id;
	private String info;

	/**
	 * Methode declancer quand il y a une modification dans l'objet observable
	 */
	public void update(Observable obs, Object arg) {

		if (obs instanceof Classe) {

			System.out.println("La notification a bien été reçu !");
			setInfo("Notification : il y a de nouvelles informations qui correspond à la " + obs);

		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String toString() {
		return " Eleve : [ " + id + " , information recu par l'élève :" + info + "]";
	}

}
