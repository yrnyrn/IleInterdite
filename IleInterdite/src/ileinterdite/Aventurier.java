/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ileinterdite;

import java.util.Collection;

/**
 *
 * @author bouchtir
 */
public abstract class Aventurier {

	private Tuile position;
	private Collection<Carte_Tresor> mesCartes;
	private int numJoueur;

	/**
	 * 
	 * @param NumJ
	 */
	public void chercherAventurier(int NumJ) {
		// TODO - implement Aventurier.chercherAventurier
		throw new UnsupportedOperationException();
	}

	public void chercherNombreCartes() {
		// TODO - implement Aventurier.chercherNombreCartes
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param uneCarteT
	 */
	public void addCarte(Carte_Tresor uneCarteT) {
		// TODO - implement Aventurier.addCarte
		throw new UnsupportedOperationException();
	}

	public void getNombreCarteT() {
		// TODO - implement Aventurier.getNombreCarteT
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param lig
	 * @param col
	 * @param lig2
	 * @param col2
	 * @param etat
	 */
	public void verifDeplacement(int lig, int col, int lig2, int col2, Etat etat) {
		// TODO - implement Aventurier.verifDeplacement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tuile
	 */
	public void setTuile(Tuile tuile) {
		// TODO - implement Aventurier.setTuile
		throw new UnsupportedOperationException();
	}

	public void getTuile() {
		// TODO - implement Aventurier.getTuile
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param lig
	 * @param col
	 * @param lig2
	 * @param col2
	 */
	public void verifAssechement(int lig, int col, int lig2, int col2) {
		// TODO - implement Aventurier.verifAssechement
		throw new UnsupportedOperationException();
	}

}