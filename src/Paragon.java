import java.util.Date;

public class Paragon {
private String[] arrayProducts = {"mleko","śmietana","szynka","chleb"};
private double[] arrayProductPrice = {3.2,2.1,5.20,2.45};
private int[] arrayProductAmount = {1,2,1,5};

	private int pozycjaArrayAmount = arrayProducts.length;
	private Pozycja[] pozycji = new Pozycja[pozycjaArrayAmount];
	private double allMoney =0;
	
	
	public Paragon(int pozycjaArrayAmount){
		this.pozycjaArrayAmount = pozycjaArrayAmount;
	}

	@Override
	public String toString() {
		return wypelnicParagon();
	}


	private String wypelnicParagon(){
		Date date = new Date();
		if(pozycjaArrayAmount==arrayProducts.length){
			return "empty";
		}
		pozycji[pozycjaArrayAmount] = new Pozycja(arrayProducts[pozycjaArrayAmount],
					arrayProductPrice[pozycjaArrayAmount] ,
					arrayProductAmount[pozycjaArrayAmount] );

		allMoney +=arrayProductPrice[pozycjaArrayAmount] * arrayProductAmount[pozycjaArrayAmount];
		if(pozycjaArrayAmount==(arrayProducts.length-1)){
			return pozycji[pozycjaArrayAmount].toString()+"\n" + " data: " + date
					+"\n" + " All : " + allMoneyGet() +" $ " ;
		}
			return pozycji[pozycjaArrayAmount].toString()+"\n" ;
	}
	 private double allMoneyGet(){
		 return allMoney;
	}

}
