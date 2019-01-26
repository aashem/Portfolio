package viikkotehtava4;

public class Property {

	private String tyyppi;
	private String sijainti;
	
	public Property(String tyyppip, String sijaintip) {
		super();
		tyyppi = tyyppip;
		sijainti = sijaintip;
	
	}

	
	public String getTyyppi() {
		return tyyppi;
	}
	public String getSijainti() {
		return sijainti;
	}
}
