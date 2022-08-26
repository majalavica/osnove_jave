package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {

//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Student marijola = new Student(457711, "Marija Jovanovic", "Osnovne");

		Ispit prvi = new Ispit("Java", 5, "Vlada Minic");
		Ispit drugi = new Ispit("Selenium", 9, "Milan Jovanovic");
		Ispit treci = new Ispit("Grey-Box-Testing", 8, "Vukan Radosavljevic");
		Ispit cetvrti = new Ispit("Matematika", 6, "Vesna Zmijanac");
		Ispit peti = new Ispit("C#", 10, "Marinko Maric");

		marijola.dodajIspit(prvi);
		marijola.dodajIspit(drugi);
		marijola.dodajIspit(treci);
		marijola.dodajIspit(cetvrti);
		marijola.dodajIspit(peti);

		marijola.print();

	}

}
