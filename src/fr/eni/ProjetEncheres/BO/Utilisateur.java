package fr.eni.ProjetEncheres.BO;

public class Utilisateur {
	
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private Boolean administrateur;
	// Attribut en lien avec les autres BO...
	
	private ArticleVendu vend;
	private ArticleVendu achete;
	private Enchere encherit;
	
	//Constructeur par default
	public Utilisateur() {

	}
	

	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, Boolean administrateur,
			ArticleVendu vend, ArticleVendu achete, Enchere encherit) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.vend = vend;
		this.achete = achete;
		this.encherit = encherit;
	}
	//Constructeur pour la methode 'creerUnNouvequCompte()'
	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit) 
	{
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		
		
	}
	

	//Constructeur pour la methode verification...
	public Utilisateur(String string,int pseudoOuEmail) 
	{
		// Si pseudoOuEmail = 0 le String est un pseudo 
			if (pseudoOuEmail==0)
				{
					this.pseudo=string;	
				}
		// Si pseudoOuEmail = 1 le String est un email 

			else if (pseudoOuEmail==1) 
				{
					this.email=string;
				}
	}


	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + ", vend=" + vend + ", achete=" + achete + ", encherit="
				+ encherit + "]";
	}


	/*********************Getters Setters***********************/
	public int getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Boolean getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Boolean administrateur) {
		this.administrateur = administrateur;
	}

	public ArticleVendu getVend() {
		return vend;
	}

	public void setVend(ArticleVendu vend) {
		this.vend = vend;
	}

	public ArticleVendu getAchete() {
		return achete;
	}

	public void setAchete(ArticleVendu achete) {
		this.achete = achete;
	}

	public Enchere getEncherit() {
		return encherit;
	}

	public void setEncherit(Enchere encherit) {
		this.encherit = encherit;
	}
	

}
