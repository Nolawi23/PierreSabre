package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		}
	
	
	public int getReputation() {
		return reputation;
	}

	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + gagnerArgent(argentVictime) + " sous dans ma poche. Hi ! Hi !");
	}
	
	public void perdre() {
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif. J'ai déshonoré le clan de " + clan);
		perdreArgent(getArgent());
		reputation -= 1;
	}
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + "? Je l'ai dépouillé de ses " + gain + " sous.");
		gagnerArgent(gain);
		reputation += 1;
	}
	
	
	
	
	
	
	

}
