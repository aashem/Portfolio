package viikkotehtava2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("syötä Asukkaan nimi: ");
		String asukasNimi = scanner.nextLine();
		System.out.print("syötä asukkaan syntymapaiva: ");
		String asukasSynt = scanner.nextLine();
		
		System.out.print("Syötä tontin nimi: ");
		String tonttiNimi = scanner.nextLine();

		
		System.out.print("Syötä tontin sijainnin pituus: ");
		String sijaP = scanner.nextLine();


		System.out.print("Syötä tontin sijainnin leveys: ");
		String sijaL = scanner.nextLine();
		
		
		System.out.print("Syötä tontin pinta-ala: ");
		double tonttiAla = scanner.nextDouble();

		
		System.out.print("Syötä rakennuksen pinta-ala: ");
		double rakennusAla = scanner.nextDouble();
		
		System.out.print("Syötä rakennuksen huoneiden lukumäärä: ");
		int rakennusHuoneet = scanner.nextInt();
		
	
		Tontti Tontti = new Tontti(tonttiNimi, sijaP, sijaL, tonttiAla);
		Asukas Asukas = new Asukas(asukasNimi, asukasSynt);
		Rakennus Rakennus = new Rakennus(rakennusAla, rakennusHuoneet);
		Tontti.tonttiPrint();
		Rakennus.setAsukkaat(Asukas.getNimi());
		Rakennus.rakennusPrint();
		Asukas.asukkaatPrint();
		
	}
}