package personnages;

public enum TypeHumain {
	HABITANT("habitant"), YAKUZA("yakuza"), COMMERCANT("Commercant"),RONIN("Ronin"), SAMOURAI("samourai"), TRAITRE("traitre");
	
	private String nom;
	
	private TypeHumain(String nom) {
		this.nom=nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}
}
