package personnages;

public class Ronin extends Humain {
	private String clan;
	private int reputation = 0;
	public Ronin(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
		}
	
	public void extorquer(Commercant victime) {
		int argentVictime = victime.getArgent();
		victime.seFaireExtorquer();
		parler("J’ai piqué les " + argentVictime + " sous de " + victime.getNom() + ", ce qui me fait " + gagnerArgent(argentVictime) + " sous dans ma poche. Hi ! Hi !");

	}
	
	
	
	
	
	

}
