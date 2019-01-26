package viikkotehtava3;

public class Subscription {

	public String lehden_nimi;
	public String tilaajan_nimi;
	public String toimitus_osoite;
	public double kokHinta, kokHinta2, kokHinta3;
	private double kuukausihinta;
	
	
	public Subscription(String s1, String s2, String s3, double i) {
		this.tilaajan_nimi = s1;
		this.toimitus_osoite = s2;
		this.lehden_nimi = s3;
		this.kuukausihinta = i;
	}
	
	public String getTilaajaNimi(){
		return tilaajan_nimi;
	}
	
	public void setTilaajaNimi(String tilaajan_nimi){
		this.tilaajan_nimi = tilaajan_nimi;
	}
	
	public String getToimitusOsoite(){
		return toimitus_osoite;
	}
	
	public void setToimitusOsoite(String toimitus_osoite){
		this.toimitus_osoite = toimitus_osoite;
	}
	
	public String getLehdenNimi(){
		return lehden_nimi;
	}
	
	public void setLehdenNimi(String lehden_nimi){
		this.lehden_nimi = lehden_nimi;
	}
	
	public double getKukuukausihinta(){
		return kuukausihinta;
	}
	
	public void setKuukausihinta(Double kuukausihinta){
		if (kuukausihinta < 0)
			throw new IllegalArgumentException("Kuukausihinta ei voi olla negatiivinen.");
		this.kuukausihinta = kuukausihinta;
	}
	
	public void kokHintaReg(Double kokHinta2){
		
	}
	
	public double getKokHinta2(){
		return kokHinta2;
	}
	
	public void kokHintaStand(Double kokHinta3){
		
	}
	
	public double getKokHinta3(){
		return kokHinta3;
	}
	
	public void printInvoice() {
		System.out.println("Tilaajan Nimi " + tilaajan_nimi + "\n Toimitus osoite " + toimitus_osoite + "\n Lehden nimi " + lehden_nimi + "\n Kuukausihinta " + kuukausihinta);
	}
}