package histoire;

import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 54);
		roro.provoquer(yaku);
	}
}

