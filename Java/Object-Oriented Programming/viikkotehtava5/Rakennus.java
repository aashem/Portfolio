package viikkotehtava5;
import java.util.ArrayList;
import java.util.List;

public class Rakennus {
	
	private String Tyyppi;
	private List<Asunto> Asunt = new ArrayList<Asunto>();
	
	public Rakennus(String TyyppiP, Asunto AsuntoP) {
		Asunt.add(AsuntoP);
		Tyyppi = TyyppiP;
	}
	
	public String getTyyppi() {
		return Tyyppi;
	}
	public void setTyyppi(String Tyyppi) {
		this.Tyyppi = Tyyppi;
	}
	public void setAsunto(Asunto Asunto) {
		Asunt.add(Asunto);
	}
	public List<Asunto> getAsunto() {
		return Asunt;
	}
	public void printAsunnot() {
		int asuntojenMaara = Asunt.size();
		System.out.print("Asuntojen Lkm: " + asuntojenMaara + "\n");
		int asuntojenLkm = 1;
		for (Asunto p : Asunt) {
			System.out.print("Asunto " + asuntojenLkm + " Asukkaat: " + "\n");
			p.printAsukaat();
			asuntojenLkm ++;
		}
	
	}
}
