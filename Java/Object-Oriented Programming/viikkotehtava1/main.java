package viikkotehtava1;
import java.util.Scanner;

class viikkotehtava {
	
	public static void main(String args[]) {
		int loop = 1;
		Pankkitili testitili = new Pankkitili();
		Scanner lukija = new Scanner(System.in);
		System.out.println("tilinumero on : ");
		String n = lukija.nextLine();
		testitili.setTilinumero(n);
		System.out.println("tilin omistaja on : ");
		n = lukija.nextLine();
		testitili.setNimi(n);
		System.out.println("Tilin saldo on : ");
		
		while (loop == 1) {
			double k = lukija.nextDouble();
		
			if (k < 0) {
				System.out.println("Luvun pitää olla positiivinen\n");
				System.out.println("Tilin saldo on : ");
			}
			else {
				testitili.setSaldo(k);
				loop = 0;
			}
		}
		System.out.print("Tilin Tiedot:\nTilinumero:  ");
		System.out.println(testitili.getTilinumero());
		System.out.print("Tilin Nimi: ");
		System.out.println(testitili.getNimi());
		System.out.print("Tilin Saldo: ");
		System.out.println(testitili.getSaldo());
		System.out.println("Kuinka paljon nostetaan tililtä? : ");
		
		while (loop == 0) {
			double k = lukija.nextDouble();
			
			if (k < 0) {
				System.out.println("Luvun pitää olla positiivinen\n");
				System.out.println("Kuinka paljon nostetaan tililtä? : ");
			}
			else {
				testitili.otto(k);
				loop = 1;
			}
		}
		System.out.print("Tilin Tiedot:\nTilinumero: ");
		System.out.println(testitili.getTilinumero());
		System.out.print("Tilin Nimi: ");
		System.out.println(testitili.getNimi());
		System.out.print("Tilin Saldo: ");
		System.out.println(testitili.getSaldo());
	}
}