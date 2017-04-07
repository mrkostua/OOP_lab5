//jak o product jedn ma nazwe cene 
public class Pozycja {
	private String nazwaProductu;
	private double cenaProductu;
	private int iloscProductu=1;
	public Pozycja(String nazwaProductu,double cenaProductu, int iloscProductu ){
		this.nazwaProductu = nazwaProductu;
		this.cenaProductu = cenaProductu;
		this.iloscProductu = iloscProductu;
	}
	@Override
	public String toString() {
		return " Produktu : " + nazwaProductu +
				" cen. za jeden: " + cenaProductu + " $ " + " sum il. : " +cenaProductu*iloscProductu +" $ ";
	}
}
