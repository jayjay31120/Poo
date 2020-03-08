package entites;

public class Ado extends Mineur{

	// propri�t�s
	private boolean portable;
	
	// constructeurs
	public Ado() {}
	
	public Ado(String nom, String prenom, int age, String ecole, boolean portable) {
		super(nom,prenom,age,ecole);
		this.portable = portable;
	}
	
	// getters setters
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		this.portable = portable;
	}
	
	// methodes
	
	// polymorpisme
	public String toString() {
		return super.toString() + " " + (this.isPortable() ? " et j'ai un portable" : " et je n'ai pas de portable");
	}
	
	public String conduireScooter() {
		return " je conduis un scooter";
	}
	
	@Override
	public String grandir() {
		return " je bois du lait";
	}

}
