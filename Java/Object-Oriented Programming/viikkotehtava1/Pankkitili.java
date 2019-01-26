package viikkotehtava1;

public class Pankkitili {
	
	private String Tilinumero;
	private String Nimi;
	private double Saldo;
	
public Pankkitili() {};
	
public void setTilinumero(String Tilinumero) {
	this.Tilinumero = Tilinumero;
}
public void setNimi(String Nimi) {
	this.Nimi = Nimi;
}
public void setSaldo(double Saldo) {
	this.Saldo = Saldo;
}
public String getTilinumero( ) {
	return Tilinumero;
}
public String getNimi( ) {
	return Nimi;
}
public double getSaldo( ) {
	return Saldo;
}
public void otto(double amount) {
	Saldo = Saldo - amount;
}
public void talletus(double amount) {
	Saldo = Saldo + amount;
}
}