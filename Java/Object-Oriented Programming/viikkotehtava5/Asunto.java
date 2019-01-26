package viikkotehtava5;

import java.util.ArrayList;
import java.util.List;

public class Asunto {
	
	private List<Asukas> Asukki = new ArrayList<Asukas>();
	
	public Asunto() {
		
	}
	
	public Asunto(Asukas AsukkiP) {
		Asukki.add(AsukkiP);
	}
	
	public void setAsukas(Asukas Asuk) {
		Asukki.add(Asuk);
	}
	public List<Asukas> getAsukas() {
		return Asukki;
	}
	public void printAsukaat() {
		for (Asukas p : Asukki) {
			System.out.println(p.getNimi());
		}
	}
}
