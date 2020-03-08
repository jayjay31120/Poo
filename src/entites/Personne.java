package entites;

import tools.Format;

public class Personne {
	
	// Propri�t�s
	private String nom;
	private String prenom;
	private int age;
	
	// Constructeurs
	public Personne() {
		
	}
	
	public Personne(String nom, String prenom, int age) {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.age = age;
	}
	
	public Personne(String nom, String prenom0) {
		this.setNom(nom);
		
		this.setPrenom(prenom);
	}
	
	// ACCESSEURS
	public String getNom() {
		return nom;
	}
	public void setNom(String monnom) {
		this.nom = this.majuscule(monnom);
	}
	public String getPrenom() {
		return Format.premiereLettreEnMaj(prenom);
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String majuscule(String s) {
		return s.toUpperCase();
	}

	public String toString() {
		return  " je m'appelle  " + this.getNom() + " " + this.getPrenom() + " , j'ai  " + this.getAge() + " ans ";
	}
}
