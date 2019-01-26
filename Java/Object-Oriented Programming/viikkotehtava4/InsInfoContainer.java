package viikkotehtava4;
import java.util.List;
import java.util.ArrayList;

public class InsInfoContainer {
	
	private List<InsuranceInfo> insuinf = new ArrayList<InsuranceInfo>();
	
	
	public InsInfoContainer() {
		
	}
	
	public List<InsuranceInfo> getInsuranceInfo(){
		return this.insuinf;
	}
	
	public void setInsuranceInfo(InsuranceInfo insuranceInfo) {
		insuinf.add(insuranceInfo);
	}
	public void printAll() {
		for (InsuranceInfo p : insuinf) {
			System.out.println("Vakuutusarvo on: " + p.getVakuutusarvo()+ " ; Asunnon Tyyppi: " + p.getPropTyyppi()+" ; Asunnon Sijainti: " + p.getPropSijainti());
		}
	}
	
	public void printOverLimit(double limit) {
		double raja = limit;
		double arvo = 0;
		for (InsuranceInfo p : insuinf) {
			arvo = p.getVakuutusarvo();
			
			if (arvo >= raja) {
				System.out.println("Vakuutusarvo on: " + p.getVakuutusarvo()+ " ; Asunnon Tyyppi: " + p.getPropTyyppi()+" ; Asunnon Sijainti: " + p.getPropSijainti());
			}
		}
	}
	public void printUnderLimit(double limit) {
		double raja = limit;
		double arvo = 0;
		for (InsuranceInfo p : insuinf) {
			arvo = p.getVakuutusarvo();
			
			if (arvo <= raja) {
				System.out.println("Vakuutusarvo on: " + p.getVakuutusarvo()+ " ; Asunnon Tyyppi: " + p.getPropTyyppi()+" ; Asunnon Sijainti: " + p.getPropSijainti());
			}
		}
	}
	
	
	
	
}
