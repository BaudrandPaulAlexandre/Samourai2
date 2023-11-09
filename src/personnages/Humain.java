package personnages;

public class Humain {

	private String nom;
	private String boissonPref;
	private int quantiteArgent;
	
	
	public Humain (String nom, String boissonPref, int quantiteArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.quantiteArgent = quantiteArgent;
	}
	
	public void parler (String texte) {
		System.out.println(nom + " - " + texte);
	}
	
	public void bonjour() {
		String retour = "Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.getBoissonPref();
		this.parler(retour);
	}
	
	public void boire() {
		String retour = "Mmmm, un bon verre de " + this.getBoissonPref() + " ! GLOUPS !";
		this.parler(retour);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getBoissonPref() {
		return boissonPref;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	public void gagnerArgent(int n) {
		quantiteArgent+= n;
	}
	
	public void perdreArgent() {
		quantiteArgent = 0;
	}
	
}
