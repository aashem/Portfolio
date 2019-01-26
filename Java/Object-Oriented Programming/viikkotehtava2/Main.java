package viikkotehtava2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("sy�t� Asukkaan nimi: ");
		String asukasNimi = scanner.nextLine();
		System.out.print("sy�t� asukkaan syntymapaiva: ");
		String asukasSynt = scanner.nextLine();
		
		System.out.print("Sy�t� tontin nimi: ");
		String tonttiNimi = scanner.nextLine();

		
		System.out.print("Sy�t� tontin sijainnin pituus: ");
		String sijaP = scanner.nextLine();


		System.out.print("Sy�t� tontin sijainnin leveys: ");
		String sijaL = scanner.nextLine();
		
		
		System.out.print("Sy�t� tontin pinta-ala: ");
		double tonttiAla = scanner.nextDouble();

		
		System.out.print("Sy�t� rakennuksen pinta-ala: ");
		double rakennusAla = scanner.nextDouble();
		
		System.out.print("Sy�t� rakennuksen huoneiden lukum��r�: ");
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