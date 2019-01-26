package viikkotehtava5;
import java.util.Scanner;

public class Main {
	static Scanner Scan = new Scanner(System.in);
	static int lkm = 0;
	static String asukasNimi;
	
	public static void main(String[] args) {
		
	Asukas Asuk = new Asukas("Teemu");
	Asukas Asuk2 = new Asukas("Santeri");
	Asukas Asuk3 = new Asukas("Pirjo");
	Asukas Asuk4 = new Asukas("Martta");
	Asunto Asunt = new Asunto(Asuk);
	Asunto Asunt2 = new Asunto(Asuk3);
	Asunto Asunt3 = new Asunto();
	System.out.println("Syötä kolmannen asunnon asukkaiden lukumäärä: ");
	lkm = Scan.nextInt();
	lkm = lkm + 1;
	for(int i=1; i<=lkm; i++) {
		System.out.print("Syötä asukas " + i + " nimi ");
		asukasNimi = Scan.nextLine();
		Asukas Asukki = new Asukas(asukasNimi);
		Asunt3.setAsukas(Asukki);
	}
	Asunt.setAsukas(Asuk2);
	Asunt2.setAsukas(Asuk4);
	Rakennus Rake = new Rakennus("Kerrostalo", Asunt);
	Rake.setAsunto(Asunt2);
	Rake.setAsunto(Asunt3);
	Tontti Tont = new Tontti("Taivaanranta","Taivaankatu 2B",120,Rake);
	Tont.printTiedot();
	}

}
