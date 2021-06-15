package fr.eni.ProjetEncheres.BO;

import java.time.LocalDate;

public class Enchere {
	
	private LocalDate dateEnchere;
	private int montant_enchere;
	
	//Constructeur par default
	public Enchere() {
	}

	
	public Enchere(LocalDate dateEnchere, int montant_enchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}


	/*********************Getters Setters***********************/

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

}
