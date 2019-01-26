package viikkotehtava4;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static double vakuutusarvo;
	public static String tyyppi;
	public static String sijainti;
	
	public static void main(String[] args) {
		;	
			/*Luodaan 5 property oliota sekä 5 vakuutusinfoa jotka asetetaan containeriin*/	
			Property prop = new Property("siisti", "tampere");
			Property prop2 = new Property("ruma", "turku");
			Property prop3 = new Property("rahjainen", "rovaniemi");
			Property prop4 = new Property("uusi", "kauppakatu");
			Property prop5 = new Property("vanha", "jerusalem");
			
			InsuranceInfo insu = new InsuranceInfo(1000);
			InsuranceInfo insu2 = new InsuranceInfo(500);
			InsuranceInfo insu3 = new InsuranceInfo(250);
			InsuranceInfo insu4 = new InsuranceInfo(1500);
			InsuranceInfo insu5 = new InsuranceInfo(2500);
			
			insu.setProperty(prop);
			insu2.setProperty(prop2);
			insu3.setProperty(prop3);
			insu4.setProperty(prop4);
			insu5.setProperty(prop5);
			
			InsInfoContainer insuinf = new InsInfoContainer();
			
			insuinf.setInsuranceInfo(insu);
			insuinf.setInsuranceInfo(insu2);
			insuinf.setInsuranceInfo(insu3);
			insuinf.setInsuranceInfo(insu4);
			insuinf.setInsuranceInfo(insu5);
			
			/*Metodi joka printtaa kaiken*/
			insuinf.printAll();
			
			System.out.println("syötä vakuutusarvo jota suuremmat asunnot näytetään");
			double input = scan.nextDouble();
			
			/*Metodi joka printtaa kaikki kysyttyä arvoa isommat*/
			insuinf.printOverLimit(input);
			
			System.out.println("syötä vakuutusarvo jota pienemmät asunnot näytetään");
			input = scan.nextDouble();
			
			/*Metodi joka printtaa kaikki kysyttä arvoa pienemmät*/
			insuinf.printUnderLimit(input);
			
			
			
			
		}
		
	}

