package viikkotehtava4;

public class InsuranceInfo {
	private double vakuutusarvo;
	private Property property;
	
	public InsuranceInfo(double vakuutusarv){
		super();
		vakuutusarvo = vakuutusarv;
		
	}
	
	public void setProperty(Property prop) {
		property = prop;
	}
	
	public void setVakuutusarvo(double vakuutusarvo) {
		this.vakuutusarvo = vakuutusarvo;
	}
	public double getVakuutusarvo() {
		return vakuutusarvo;
	}
	
	public String getPropTyyppi() {
		return property.getTyyppi();
	}
	
	public String getPropSijainti() {
		return property.getSijainti();
	}
	public void showDetail() {
		System.out.println("vakuutusarvo on: "+vakuutusarvo);
		System.out.println("propertyn tyyppi on:"+property.getTyyppi());
		System.out.println("propertyn sijainti on:"+property.getSijainti());
		
	}
}
