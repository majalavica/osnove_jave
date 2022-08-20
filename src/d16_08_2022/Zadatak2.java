package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
//			Metoda kao parametar prima temperaturu koja je napolju.

//
//			U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

		SmartAirConditioning uredjaj1 = new SmartAirConditioning();
		uredjaj1.marka = "Samsung";
		uredjaj1.temp = 16;
		uredjaj1.mod = "hladno";
		uredjaj1.stampaj();

		boolean x = uredjaj1.boomerang(26);
		System.out.println(x);
		System.out.println();

		
		SmartAirConditioning uredjaj2 = new SmartAirConditioning();
		uredjaj1.marka = "LG";
		uredjaj1.temp = 24;
		uredjaj1.mod = "toplo";
		uredjaj1.stampaj();

		boolean y = uredjaj1.boomerang(20);
		System.out.println(y);
	}

}
