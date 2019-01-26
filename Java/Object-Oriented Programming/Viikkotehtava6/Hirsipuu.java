import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Hirsipuu {
	private int arvausmaara;
	private int arvausmax;
	private String sana;
	private List<Character> arvatut = new ArrayList<Character>();
	private char[] avatut;
	Random random = new Random();
	
	public Hirsipuu(Sanalista sanalista,int arvaustenlkm) {
		this.arvausmax = arvaustenlkm;
		this.arvausmaara = 0;
		
		
		List<String> Sanat = sanalista.annaSanat();
		this.sana = Sanat.get(random.nextInt(Sanat.size()));
		this.avatut = new char[(this.sana.length())];
		for(int i = 0; i < this.sana.length(); i++) {
			this.avatut[i] = '-';
		}
	}
	public boolean arvaa (Character merkki) {
		boolean arvaus = false;
		for(int i = 0; i < avatut.length; i++) {
			if(sana.charAt(i) == (char)Character.toUpperCase(merkki)) {
				avatut[i] = Character.toUpperCase(merkki);
				arvaus = true;
			}
		}
		arvausmaara++;
		arvatut.add(merkki);
		return arvaus;
		
	}
	
	public String sana() {
		return sana;
	}
	public List<Character> arvaukset(){
		return arvatut;
	}
	
	public void printAvatut() {
		System.out.print(avatut);
	}
	public int arvaustenmaara() {
		int arvaukset = arvausmax - arvausmaara;
		return arvaukset;
	}
	
	public boolean onLoppu() {
		boolean loppu = false;
		for(int i = 0; i < avatut.length; i++) {
			if(sana.charAt(i) == avatut[i]) {
				loppu = true;
			}
			else {
				loppu = false;
				i = avatut.length;
			}
		}
		return loppu;
	}

}
