package viikkotehtava5;

public class Tontti {
	
	private String Nimi;
	private String Osoite;
	private double Pintaala;
	private Rakennus Rakennus;

	public Tontti(String NimiP, String OsoiteP,double PintaalaP, Rakennus RakennusP) {
		Nimi = NimiP;
		Osoite = OsoiteP;
		Pintaala = PintaalaP;
		Rakennus = RakennusP;
	}
	public void setNimi(String Nimi) {
		this.Nimi = Nimi;
	}
	public String getNimi() {
		return Nimi;
	}
	public void setOsoite(String Osoite) {
		this.Osoite = Osoite;
	}
	public String getOsoite() {
		return Osoite;
	}
	public void setPintaala(double Pintaala) {
		this.Pintaala = Pintaala;
	}
	public double getPintaala() {
		return Pintaala;
	}
	public void setRakennus(Rakennus Rakennus) {
		this.Rakennus = Rakennus;
	}
	public Rakennus getRakennus() {
		return Rakennus;
	}
	public void printTiedot() {
		System.out.print(Nimi +"\n" + Osoite +"\n" +  Pintaala+ " m^2" +"\n" + Rakennus.getTyyppi()+"\n");
		Rakennus.printAsunnot();
		
	}
}
