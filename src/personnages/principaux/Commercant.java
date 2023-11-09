package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int quantiteArgent) {
		super(nom, "Thé", quantiteArgent);
	}
	
	public int seFaireExtorquer() {
		int argentPerdus = getQuantiteArgent();
		this.perdreArgent();
		this.parler("Le monde est vraiment trop injuste");
		return argentPerdus;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		this.parler("je te remercie avec déférence");
	}

}
