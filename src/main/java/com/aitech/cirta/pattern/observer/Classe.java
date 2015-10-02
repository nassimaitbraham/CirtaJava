package com.aitech.cirta.pattern.observer;

import java.util.Observable;

/**
 * Partie observable
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class Classe extends Observable {

	/**
	 * Attribut
	 */
	
	private int id;
	private boolean etat;
    private String info;
    
    /**
     * Getter et Setter
     * 
     */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEtat() {
		return etat;
	}
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	/**
	 * Notification des observateur du changement d'etat d'un objet Classe
	 * @param etat
	 */
	public void setEtat(boolean etat) {
		this.etat = etat;
		setChanged();
		notifyObservers(this.etat);
	}

	/**
	 * Donnee de l'objet
	 * 
	 * @return String
	 */
	public String toString() {

		return "Classe (id = " + id + " , etat = " + etat + ")";
	}

}
