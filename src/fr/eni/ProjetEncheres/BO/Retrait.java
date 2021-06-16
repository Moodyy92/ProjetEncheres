package fr.eni.ProjetEncheres.BO;

public class Retrait {
	
	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + "]";
	}

	private String rue;
	private int code_postal;
	private String ville;
	
	//Constructeur par default
	public Retrait() {
		
	}
	
	
	public Retrait(String rue, int code_postal, String ville) {
		super();
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}


	/*********************Getters Setters***********************/
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
