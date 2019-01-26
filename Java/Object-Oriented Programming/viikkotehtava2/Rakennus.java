package viikkotehtava2;

public class Rakennus{
	
	private double pintaAla;
	private int huoneet;
	private String asukkaat;
	
	public Rakennus(double rakennusAla, int rakennusHuoneet){
		pintaAla = rakennusAla;
		huoneet = rakennusHuoneet;

	}

	public Double getPintaAla(){
		return pintaAla;
	}
	
	public void setAsukkaat(String asukkaat) {
		this.asukkaat = asukkaat;
	}
	
	public String getAsukkaat() {
		return asukkaat;
	}
	public void setPintaAla(double pintaAla){
		this.pintaAla = pintaAla;
	}
	
	public int getHuoneet(){
		return huoneet;
	}
	
	public void setHuoneet(int huoneet){
		this.huoneet = huoneet;
	}
	
	public void rakennusPrint(){
		System.out.printf(" Huoneiden m‰‰r‰: %d \n Pinta-ala: %.0f \n asukkaan nimi: %s \n", getHuoneet(), getPintaAla(), getAsukkaat());
	}
}