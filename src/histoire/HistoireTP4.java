package histoire;

import personnages.Commercant;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 15);
		Ronin yaku = new Ronin("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.parler(marco.getNom()+ ", si tu tiens à la vie donne moi ta bourse !");
		yaku.extorquer(marco);

	}
}
