package vues;

import java.util.Scanner;

public class Affichage implements Affiche {

	// propri�t�s
	private Scanner saisieUtilisateur;
	
	// constructeur
	public Affichage() {
		this.saisieUtilisateur = new Scanner(System.in);
		
	}
	
	// destructeur
	 public void finalize() {
		 this.saisieUtilisateur.close();
	 }
	
	/*
	 * Methodes de saisie
	 */

	@Override
	public int saisir() {
		System.out.print("Donnez la valeur de n, n > = 2 :");

		int n = 0;
		boolean ok = false;
		do {
			try {
				n = this.saisieUtilisateur.nextInt();
				this.saisieUtilisateur.nextLine();
				if (n >= 2) {
					ok = true;
				}

			} catch (Exception e) {
				this.saisieUtilisateur.nextLine();
				this.afficher("Erreur");
			}
		} while (ok == false);

		return n;
	}

	@Override
	public String saisir(String msg) {
		this.afficher(msg);
		
		String s = "";

			try {
				s = this.saisieUtilisateur.nextLine();
			} catch (Exception e) {				
				this.afficherLn("Erreur");
			}


	
		return s;
		
	}
	@Override
	public int saisirInt() {
		int val = 0;
		boolean ok = false;
		
		do {
			try {
				System.out.println("entrez votre age :");
				val = this.saisieUtilisateur.nextInt();
				this.saisieUtilisateur.nextLine();
				if (val<121) {
					ok = true;}
				else {
					System.out.println("le nombre doit être inférieur a 120");	
				}
			} catch (Exception e) {
				System.err.println("veuillez saisir un nombre");
				this.saisieUtilisateur.nextLine();
			}
		} while (ok == false);

			return val;}
	
	@Override
	public boolean saisirBool(String msg) {
		boolean okok = false;
		boolean rep = false;
			do {
				try {
					this.afficher(msg);
					rep = this.saisieUtilisateur.nextBoolean();;
					this.saisieUtilisateur.nextLine();
					if (rep == true || rep == false  ) {

						okok= true;}
					else {
						System.out.println("erreur1");	
					}
				} catch (Exception e) {
					System.err.println("veuillez saisir true or false");
					this.saisieUtilisateur.nextLine();
				}
			} while (okok == false);	
			return rep;
	}	
	

	
	
	/*
	 * M�thodes d'affichage
	 */

	@Override
	public void afficher(String s) {
	
		System.out.print(s);
		System.out.println();
	}

	@Override
	public void afficherLn(String s) {
		System.out.println();
		System.out.println(s);
		System.out.println();
	}

}
