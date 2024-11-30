package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	private static final int CapaciteMemoireGrandMere = 5;
	private Random random = new Random();

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}

	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissance == CapaciteMemoireGrandMere) {
			System.out.println("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}else {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}

	public String humainHasard() {
		int aleatoire = random.nextInt(6);
		TypeHumain[] types = TypeHumain.values();
		return (types[aleatoire].toString());
	}

	public void ragoter() {
		for (int i = 0; i < nbConnaissance; i++) {
			if (memoire[i] instanceof Traitre) {
				parler("Je sais que " + memoire[i].getNom() + " est un traître. Petit chenapan !");
			} else {
				parler("Je crois que " + memoire[i].getNom() + " est un " + humainHasard());
			}
		}

	}

}
