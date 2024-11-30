package personnages;

public class Humain {
	protected static final int capaciteMemoire = 30;

	private String nom;
	private String boissonFavorite;
	protected int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[capaciteMemoire];

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
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS ! ");
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}

		else
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peut meme pas m'offrir " + bien + " à " + prix
					+ " sous");
	}

	protected int gagnerArgent(int gain) {
		argent += gain;
		return argent;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		if (nbConnaissance == capaciteMemoire) {
			for (int i = 0; i < nbConnaissance - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			nbConnaissance--;
		}
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	protected void repondre(Humain homme) {
		direBonjour();
		memoriser(homme);

	}

	protected void memoriser(Humain humain) {
		memoire[nbConnaissance] = humain;
		nbConnaissance++;

	}

	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			texte.append(memoire[i].getNom());
			if (i != nbConnaissance - 1) {
				texte.append(", ");
			}
		}
		parler(texte.toString());
	}
}
