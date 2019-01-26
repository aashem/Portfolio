package viikkotehtava3;

public class StandingSubscription extends RegularSubscription {

	private int alennusprosentti;
	private double kokHinta;

	
	public StandingSubscription(String s1, String s2, String s3, double i, int k){
		super(s1, s2, s3, i, k);
		this.alennusprosentti = k;
		kokHinta = i * 12 * (1 - (double)alennusprosentti/100);
	}

	public int getAlennusprosentti() {
		return alennusprosentti;
	}

	public void setAlennusprosentti(int alennusprosentti) {
		if (alennusprosentti < 0)
			throw new IllegalArgumentException("Alennusprosentti ei voi olla negatiivinen");
		this.alennusprosentti = alennusprosentti;
	}

	public double getKokHinta(){
		return kokHinta;
	}
	
	public void printInvoice() {
		System.out.println("Alennusprosentti " + alennusprosentti + "\nTilaajan nimi " + tilaajan_nimi + "\nToimitusosoite " + toimitus_osoite + "\nLehden nimi " + lehden_nimi + "\nKuukausihinta " + getKukuukausihinta() + "\nKokonais hinta "+ kokHinta);
	}
}