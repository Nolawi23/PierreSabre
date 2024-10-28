package personnages;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner = getArgent() / 10;
		parler("Marco prend ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
			gagnerArgent(adversaire.getArgent());
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur -= 1;
			
		}
	}

}
