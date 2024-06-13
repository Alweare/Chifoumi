package fr.eni.chifoumi.bo;



public class Partie {
	private String choixUtilisateur;
	private String choixOrdinateur;
	private int resultat;
	
	public Partie(String choixUtilisateur, String choixOrdinateur) {
		this.choixUtilisateur = choixUtilisateur;
		this.choixOrdinateur = choixOrdinateur;
	}

	public String getChoixUtilisateur() {
		return choixUtilisateur;
	}

	public void setChoixUtilisateur(String choixUtilisateur) {
		this.choixUtilisateur = choixUtilisateur;
	}

	public String getChoixOrdinateur() {
		return choixOrdinateur;
	}

	public void setChoixOrdinateur(String choixOrdinateur) {
		this.choixOrdinateur = choixOrdinateur;
	}

	public int getResultat() {
		return resultat;
	}

	public int setResultat(int resultat) {
		return this.resultat = resultat;
	}

	@Override
	public String toString() {
		return String.format("Partie [choixUtilisateur=%s, choixOrdinateur=%s, resultat=%s]", choixUtilisateur,
				choixOrdinateur, resultat);
	}
	
	
	
	
	
	

	
	
	
	

}
