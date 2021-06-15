package fr.eni.ProjetEncheres.BO;

import java.util.List;

public class Categorie {
	
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", categorieArticle="
				+ categorieArticle + "]";
	}

	private int noCategorie;
	private String libelle;
	
	// Attribut en lien avec les autres BO...

	private List<ArticleVendu> categorieArticle;
	
	//Constructeur par default
	public Categorie() {
	}
	
	
	public Categorie(int noCategorie, String libelle, List<ArticleVendu> categorieArticle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
		this.categorieArticle = categorieArticle;
	}


	/*********************Getters Setters***********************/
	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<ArticleVendu> getCategorieArticle() {
		return categorieArticle;
	}

	public void setCategorieArticle(List<ArticleVendu> categorieArticle) {
		this.categorieArticle = categorieArticle;
	}

}
