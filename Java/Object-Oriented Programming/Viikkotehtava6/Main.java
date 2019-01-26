import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
	


	
	public static void main(String[] args) throws FileNotFoundException {
		List<Character> arvaukset = new ArrayList<Character>();
		boolean loppu = false;
		boolean paalla = true;
		Scanner scan = new Scanner(System.in);
		int vaihtoehto = 0;
		Character merkki;
		//filename on path lista.txt esim:C:\\Users\\ashemeik...
		String filename = "";
		Sanalista sanalista = new Sanalista(filename);
		Hirsipuu hirsipuu = new Hirsipuu(sanalista, 10);
		while(paalla == true) {
			if(hirsipuu.arvaustenmaara() == 0) {
				System.out.println("\n Arvaukset Loppuivat" + "\n Sana oli: " + hirsipuu.sana());
				loppu = true;
			}
			if(hirsipuu.onLoppu() == true) {
				System.out.print("\nvoitit pelin" + "\n Sana oli: " + hirsipuu.sana());
				loppu = true;
			}
			
			if(loppu == false) {
				System.out.print("Arvattava sana on \n");
				hirsipuu.printAvatut();
				System.out.print("\nArvauksia Jaljella: " + hirsipuu.arvaustenmaara());
				System.out.println("\nSyötä mitä haluat tehda\n 1: Arvaa \n 2: Nayta Arvaukset \n 3: Lopeta \n 4: Paljasta Sana");
				vaihtoehto = scan.nextInt();
				if(vaihtoehto == 1) {
					System.out.println("Valitse arvattava merkki ");
					merkki = scan.next().charAt(0);
					if(hirsipuu.arvaa(merkki) == true) {
						System.out.print("\nArvasit oikein\n");
					}
					else {
						System.out.print("\nArvasit vaarin\n");
					}
				}
				else if(vaihtoehto == 2) {
					System.out.println("Jo arvatut: ");
					arvaukset = hirsipuu.arvaukset();
					for(Character p : arvaukset) {
						System.out.println(p + ",");
					}
				}
				else if(vaihtoehto == 3) {
					paalla = false;
					scan.close();
				}
				else if(vaihtoehto == 4) {
					System.out.print("\n" + hirsipuu.sana() + "\n");
				}
			}
			else {
				paalla = false;
				scan.close();
			}
		}
	}
}
