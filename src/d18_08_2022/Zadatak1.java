package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.
//		Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		Proizvod sir = new Proizvod();
		sir.naziv = "Sir sa tartufima";
		sir.cena = 1200;
		sir.tezinaUGramima = 2000;
		sir.stampaj();

		sir.povecajCenu(35);

		System.out.println("Cena nakon uracunatog popusta je: " + sir.vratiCenuSaPopustom(10.0) + "dinara");
		System.out.println("Postarina za ovaj proizvod je: " + sir.racunajPostarinu() + "dinara");
		
		System.out.println();
		
		
		Proizvod losos = new Proizvod();
		losos.naziv = "Dimljeni losos";
		losos.cena = 4500;
		losos.tezinaUGramima = 1000;
		losos.stampaj();
	
		
		losos.povecajCenu(350);
		
		System.out.println("Cena nakon uracunatog popusta je: " + losos.vratiCenuSaPopustom(19.0)+ "dinara");
		System.out.println("Postarina za ovaj proizvod je: " + losos.racunajPostarinu() + "dinara");
		
	}

}
