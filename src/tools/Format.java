package tools;

public class Format {
	public static String minuscule(String s) {
		return s.toLowerCase();
	}
	
	public static String premiereLettreEnMaj(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
}



