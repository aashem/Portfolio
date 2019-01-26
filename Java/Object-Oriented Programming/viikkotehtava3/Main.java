package viikkotehtava3;

import java.util.Scanner;

public class Main {

	private static Scanner scan;
	public static String nimi, osoite, lehti;
	public static double hinta;
	public static int kk, aleprosentti;
	
	public static void main(String[] args){
		scan = new Scanner(System.in);
		
		System.out.println("Anna normaalin tilaajan nimi: ");
		nimi = scan.nextLine();
		
		System.out.println("Anna normaalin tilaajan osoite: ");
		osoite = scan.nextLine();
		
		System.out.println("Anna lehden nimi: ");
		lehti = scan.nextLine();
		
		System.out.println("Anna kuukausihinta: ");
		hinta = scan.nextDouble();
		
		System.out.println("Anna tilauksen kesto kuukausina: ");
		kk = scan.nextInt();
		scan.nextLine();
		
		RegularSubscription rs = new RegularSubscription(nimi, osoite, lehti, hinta, kk);
		printSubscriptionInvoice( rs );
		
		System.out.println("Anna kestotilaajan nimi: ");
		nimi = scan.nextLine();
		
		System.out.println("Anna kestotilaajan osoite: ");
		osoite = scan.nextLine();
		
		System.out.println("Anna lehden nimi: ");
		lehti = scan.nextLine();
		
		System.out.println("Anna kuukausihinta: ");
		hinta = scan.nextDouble();
		
		System.out.print("Anna alennusprosentin maara: ");
		aleprosentti = scan.nextInt();
		
		StandingSubscription ss = new StandingSubscription(nimi, osoite, lehti, hinta, aleprosentti);
		printSubscriptionInvoice( ss );
	      
		
		
	}
	
	public static void printSubscriptionInvoice(Subscription subs){
	   subs.printInvoice();
   }
}