package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance;
	protected Humain[]memoire = new Humain[30];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS ! ");
	}
	
	public void acheter(String bien,int prix) {
		if (prix <= argent) { 
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous" );
			perdreArgent(prix);
			}
		
		else 
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peut meme pas m'offrir " + bien + " à " + prix + " sous" );
	}
	
	protected int gagnerArgent(int gain) {
		argent +=gain;
		return argent;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}	
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		repondre(this);
		memoriser(humain);
		
	}
	protected void repondre(Humain homme) {
		homme.direBonjour();
		memoriser(homme);
		
	}
	protected void memoriser(Humain humain) {
		memoire[nbConnaissance]=humain;
		nbConnaissance++;
		
	}
}
