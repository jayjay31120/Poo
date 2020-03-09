package firstPoo;





import javax.swing.JOptionPane;

import entites.Ado;
import entites.Enfant;
import entites.Majeur;
//import entites.Mineur;
import entites.Personne;
import vues.Popup;
import vues.Affichage;


public class Principal {

	public static void main(String[] args) {

		// instance de Personne
		Personne unePersonneA = new Personne();
		unePersonneA.setNom("Dupond");
		unePersonneA.setPrenom("alain");
		unePersonneA.setAge(29);
		//System.out.println(unePersonneA.toString());

		// autre instance de Personne
		Personne nicolasA = new Personne("Escaich", "Nicolas", 34);
		//System.out.println(nicolasA.toString());
		nicolasA.setNom("Machin");
		//System.out.println("\n"+nicolasA.getPrenom()+"\n");
		//System.out.println(nicolasA.toString());

		// instance de Majeur
		Majeur maj = new Majeur("Martin","Paul",40,true);	
		//System.out.println(maj.toString()+maj.travailler());

		//instance de Mineur
		//		Mineur min = new Mineur("Duran","Kevin",10,"Victor Hugo");
		//		System.out.println(min.toString());

		//Affichage aff = new Affichage();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Popup aff = new Popup();
		// instance de Personne
		Personne unePersonne = new Personne();
		Majeur unMaj = new Majeur();
		Enfant enf = new Enfant();
		Ado adoo = new Ado();
	int age = 	aff.saisirInt();
if (age>=18) {
	unMaj.setAge(age);
	unMaj.setNom(aff.saisir("Saisir votre nom : "));
	aff.afficher(unMaj.getNom());
	unMaj.setPrenom(aff.saisir("Saisir votre prénom : "));
	
	unMaj.setVote(aff.saisirBool("votez vous????"));
	
	aff.afficher(unMaj.toString());
		}
else if (age<=12){
	enf.setAge(age);
	enf.setNom(aff.saisir("Saisir votre nom : "));
	aff.afficher(enf.getNom());
	enf.setPrenom(aff.saisir("Saisir votre prénom : "));
	enf.setEcole(aff.saisir("Quelle est ton école : "));
	
	enf.setVelo(aff.saisirBool("As tu un vélo"));
	
	aff.afficher(enf.toString());
	
}
else {
	adoo.setAge(age);
	adoo.setNom(aff.saisir("Saisir votre nom : "));
	aff.afficher(adoo.getNom());
	adoo.setPrenom(aff.saisir("Saisir votre prénom : "));
	adoo.setEcole(aff.saisir("Quelle est ton école : "));
	adoo.setPortable(aff.saisirBool("as tu un portable"));
	aff.afficher(adoo.toString());
}
	
		
		
		
		// autre instance de Personne
		Personne nicolas = new Personne(aff.saisir("Saisir votre nom : "), aff.saisir("Saisir votre prï¿½nom : "), 34);
		aff.afficher(nicolas.toString());
		nicolas.setNom("Machin");
		aff.afficher("\n"+nicolas.getPrenom()+"\n");
		aff.afficher(nicolas.toString());
		
		// instance de Majeur
		Majeur maj1 = new Majeur("Martin","Paul",40,true);	
		aff.afficher(maj1.toString()+"\n"+maj1.travailler());
		
		// instance de Mineur
//		Mineur min = new Mineur("Duran","Kevin",10,"Victor Hugo");
//		aff.afficher(min.toString());
		
		// instance de Ado
		Ado ado = new Ado("Duran","Jessica",14,"Victor Hugo",true);
		aff.afficher(ado.toString()+"\n"+ado.conduireScooter()+"\n"+ado.grandir());
		
		Ado ado2 = new Ado();
		ado2.setNom("azerty");
		
		// instance d'Enfant
		Enfant enf1 = new Enfant("Duran","Max",9,"Victor Hugo",true);
		aff.afficher(enf1.toString()+"\n"+enf1.jouer()+"\n"+enf1.grandir());
		

		

		
	}
}

