package personnages.principaux;

public class Samourai extends Ronin{

	private String nomSeigneur;
	
	public Samourai(String nom, String boissonPref, int quantiteArgent, String nomSeigneur) {
		super(nom, boissonPref, quantiteArgent);
		this.nomSeigneur = nomSeigneur;
	}
	
	@Override
	public void bonjour() {
		super.bonjour();
		String retour = "Mon seigneur est " + this.getNomSeigneur() + " !";
		this.parler(retour);
	}

	public String getNomSeigneur() {
		return nomSeigneur;
	}
	
	@Override 
	public void boire() {
		super.boire();
	}

}
