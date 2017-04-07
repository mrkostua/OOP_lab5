//kolejonsc inicjalizacji objektow



//Kasa  (tablicy paragonow)
//Paragon (tablica pozycji)
//Pozycja 
//paragon nazwa firmy i data i godzina
//class (trzzy paragony ) 3 clasy 
//Raport 
//Nazwa towaru, liczba sztuk cena pojedynczej sztuki
//liczby sztuk wymnozyc razy cena 
class B{
	String stringB;
	int iB;

	public B(String string, int i) {
		System.out.println("Konstructor class A");
			this.stringB = string;
			this.iB = i;
			
			{
				i = 8; 
				System.out.println("Block inicjalizacyjny egzemplarza objektu" + i);
			}
		}


	@Override
	public String toString() {
		return "B [string=" + stringB + ", i=" + iB + "]";
	}
}

class A { 
	String string;
	int i;
	

public A(String string, int i) {
	//System.out.println("Konstructor class A");
		this.string = string;
		this.i = i;
		
		//block inicjalizacyjny
		
	}
@Override
public String toString() {
	return "A [string=" + string + ", i=" + i + "]";
}



}

public class First {
	
	public static void main(String[] args) {
		int i =0;
		A a = new A("A" + (++i),i);
		System.out.println(a);
		System.out.println(a.string);
		
		B a2 = new B("B" + (++i),i);
		System.out.println(a2);
		System.out.println(a2.stringB);
		
		
		while(true){
			if( i % 1000 ==0){
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.gc();
			}
			new A("A" + (++i),i);
		}

	}

}
