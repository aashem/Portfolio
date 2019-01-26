package viikkotehtava2;

public class Asukas {
	
	private String nimi;
	private String syntAika;
	
	
	public Asukas(String asukasNimi, String asukasSynt) {
		nimi = asukasNimi;
		syntAika = asukasSynt;
	}

	public String getNimi(){
		return nimi;
	}
	
	public void setNimi(String nimi){
		this.nimi = nimi;
	}
	
	public String getSyntAika(){
		return syntAika;
	}
	
	public void setSyntAika(String syntAika){
		this.syntAika = syntAika;
	}
	
	public void asukkaatPrint(){
		System.out.printf("Asukkaan syntymäaika: %s \n", getNimi(), getSyntAika());
	}
}