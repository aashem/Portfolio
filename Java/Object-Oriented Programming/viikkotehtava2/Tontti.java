package viikkotehtava2;

public class Tontti {
	
	
	private String nimi;
	private String sijaintiP;
	private String sijaintiL;
	private double pintaAla;
	
	
	public Tontti(String tonttiNimi, String sijaP, String sijaL, double tonttiAla) {
		super();
		nimi = tonttiNimi;
		sijaintiP = sijaP;
		sijaintiL = sijaL;
		pintaAla = tonttiAla;
	}
	

	public void setNimi(String tonttiNimi){
		nimi = tonttiNimi;
	}
	
	public String getNimi(){
		return nimi;
	}
	
	
	public void setSijaintiP(String sijaP){
		sijaintiP = sijaP;
	}
	
	public String getSijaintiP(){
		return sijaintiP;
	}
	
	
	public void setSijaintiL(String sijaL){
		sijaintiL = sijaL;
	}
	
	public String getSijaintiL(){
		return sijaintiL;
	}

	public void setPintaAla(double tonttiAla){
		pintaAla = tonttiAla;
	}
	
	public double getPintaAla(){
		return pintaAla;
	}
	
	public void tonttiPrint(){
		System.out.printf(" Tontin nimi: %s \n Sijtainti (P): %s \n Sijtainti (L): %s \n Pinta-ala: %.0f \n", getNimi(), getSijaintiP(), getSijaintiL(), getPintaAla());
	}

}