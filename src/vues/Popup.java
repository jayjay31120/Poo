package vues;

import javax.swing.JOptionPane;

public class Popup implements Affiche {

	private JOptionPane popup;
	public Popup() {
		this.popup = new JOptionPane();
	}

	@Override
	public int saisir() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String saisir(String msg) {
		@SuppressWarnings("static-access")
		String nom = this.popup.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);
		return nom;
	}

	@SuppressWarnings("static-access")
	@Override
	public void afficher(String s) {
		 this.popup.showMessageDialog(null, s, "Affiche", JOptionPane.INFORMATION_MESSAGE);	
	}

	@Override
	public void afficherLn(String s) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("static-access")
	@Override
	public int saisirInt() {
		String val = "";
		
		boolean ok = false;
		
		do {
			try {
				
				val = this.popup.showInputDialog(null, "quel est ton age", "Saisie", JOptionPane.QUESTION_MESSAGE);
				if (Integer.parseInt(val)<121 && Integer.parseInt(val)>0) {
					ok = true;}
				else {
					this.popup.showMessageDialog(null, "le nb doit etre < à 120", "Affiche", JOptionPane.INFORMATION_MESSAGE);	;	
				}
			} catch (Exception e) {
				this.popup.showMessageDialog(null, "recommencer", "Affiche", JOptionPane.INFORMATION_MESSAGE);	
			}
		} while (ok == false);

			return Integer.parseInt(val);}
	
	@SuppressWarnings("static-access")
	@Override

	public boolean saisirBool(String msg) {
		boolean reponse = false;
	    String[] sexe = {"OUI", "NON"};
	    JOptionPane jop = new JOptionPane();
	    int rang = jop.showOptionDialog(null, 
	     msg,
	      "Question !",
	      JOptionPane.YES_NO_CANCEL_OPTION,
	      JOptionPane.QUESTION_MESSAGE,
	      null,
	      sexe,
	      sexe[1]);
	    
	    System.out.println(rang);
	    if (rang==1) {reponse = false;
	    	
	    } 
	    
	    else if (rang==0) {reponse = true;
	    	
	    } 
	    
	    
//		String val = "";
//		boolean vall = Boolean.valueOf(val);
//	
//	boolean ok = false;
//	
//	do {
//		try {
//			
//			val = this.popup.showInputDialog(null, msg, "Saisie", JOptionPane.QUESTION_MESSAGE);
//			if (vall == true || vall == false  ) {
//				ok = true;}
//			else {
//				this.popup.showMessageDialog(null, "recommencer", "Affiche", JOptionPane.INFORMATION_MESSAGE);
//			}
//		} catch (Exception e) {
//			this.popup.showMessageDialog(null, "recommencer", "Affiche", JOptionPane.INFORMATION_MESSAGE);	
//		}
//	} while (ok == false);
//
//		return vall;
		return reponse;
	}

	
		
}
