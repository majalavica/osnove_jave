package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Proizvod prviProizvod = new Proizvod();
		prviProizvod.naziv = "Crep";
		prviProizvod.cena = 15000;
		prviProizvod.tezina = 120000;
		prviProizvod.stampaj();

		double tezinaKg = prviProizvod.konvertuj("kg");
		System.out.println("Tezina Crepa u kg je: " + tezinaKg);
		System.out.println();

		Proizvod drugiProizvod = new Proizvod();
		drugiProizvod.naziv = "drva";
		drugiProizvod.cena = 23000;
		drugiProizvod.tezina = 12000;
		drugiProizvod.stampaj();

		double tezinaT = drugiProizvod.konvertuj("t");
		System.out.println("Tezina drva u tonama je: " + tezinaT);
	}

}
