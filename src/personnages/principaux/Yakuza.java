package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	
	private int reputation;
	private String clan;

	public Yakuza(String nom, String boissonPref, int quantiteArgent, String clan) {
		super(nom, boissonPref, quantiteArgent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public void extorquer(Commercant c) {
		this.gagnerArgent(c.seFaireExtorquer());
		this.reputation += 1;
		this.parler("J'ai extorqué de l'argent car je suis méchant");
	}
	
	public int perdreDuel() {
		int argentPerdus = getQuantiteArgent();
		this.perdreArgent();
		reputation -= 1;
		this.parler("J'annonce ma défaite !");
		return argentPerdus;
	}
	
	public void gagnerDuel() {
		reputation += 1;
		this.parler("J'annonce ma victoire !");
	}
	
	@Override
	public void bonjour() {
		super.bonjour();
		String retour = "Je viens du clan " + this.getClan() + " !";
		this.parler(retour);
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}

	
	

}
