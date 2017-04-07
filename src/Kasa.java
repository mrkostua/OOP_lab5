import java.util.Date;

public class Kasa {
	private int paragonArrayAmount = 100;
	private Paragon[] paragons = new Paragon[paragonArrayAmount];
	
	
	

	public void getParagons(){
		int i =0;
		boolean loopCondition=true;
		while(loopCondition){
			paragons[i] = new Paragon(i);

			if(paragons[i].toString().equals("empty") || i ==(paragons.length +1)){
				loopCondition=false;
				System.out.println("Products count : " + i);
				System.exit(1);
			}
			System.out.println(paragons[i].toString());
			i++;
		}
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Kub \"Every day discounts\" " +
				"\n 80-860 Krakow ul.Podniebiesna 23"
		+"\n Konstantyn Prysiażny Distribution F.A." +
				"\n NIP 223-50-22-42-468");
		System.out.println(date);
		System.out.println("PARAGON FIKSALNY");

		Kasa kasa = new Kasa();
		kasa.getParagons();
	}
}

