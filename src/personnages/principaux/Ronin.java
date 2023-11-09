package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {

	private int honneur;
	
	public Ronin(String nom, String boissonPref, int quantiteArgent) {
		super(nom, boissonPref, quantiteArgent);
		this.honneur = 1;
	}
	
	public void donner(int n, Commercant c) {
		c.gagnerArgent(n);
		this.perdreArgent();
		this.parler("Tenez mon brave");
	}
	
	public void provoquer(Yakuza y) {
		if (honneur*2 > y.getReputation()) {
			honneur += 1;
			this.parler("J'ai gagner car je suis gentil");
			this.gagnerArgent(y.getQuantiteArgent());
			y.perdreDuel();

			
		} else {
			honneur -= 1;
			this.parler("Je râle car j'ai perdu");
			y.gagnerDuel();
		}
	}
	
}
