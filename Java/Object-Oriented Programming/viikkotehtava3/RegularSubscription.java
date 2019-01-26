package viikkotehtava3;

public class RegularSubscription extends Subscription {

	public int tilauksen_kesto;
	private double kokHinta;
	
	public RegularSubscription(String s1, String s2, String s3, double i, int j){
		super(s1, s2, s3, i);
		this.tilauksen_kesto = j;
		kokHinta = i * j;
		
	}
	
	public int getTilauksen_kesto() {
		return tilauksen_kesto;
	}

	public void setTilauksen_kesto(int tilauksen_kesto) {
		if (tilauksen_kesto < 0)
			throw new IllegalArgumentException("Tilauksen kesto ei voi olla negatiivinen");
		this.tilauksen_kesto = tilauksen_kesto;
	}
	
	public void kokHintaReg(double kokHinta){
		kokHinta2 = kokHinta * tilauksen_kesto;
	}
	
	public double getKokHinta(){
		return kokHinta;
	}
	
	public void printInvoice() {
		System.out.println("Tilauksen kesto " + tilauksen_kesto + "\nTilaajan nimi " + tilaajan_nimi + "\nToimitusosoite " + toimitus_osoite + "\nLehden nimi " + lehden_nimi + "\nKuukausihinta " + getKukuukausihinta() + "\nKokonaishinta " + kokHinta);
	}
	
	
}