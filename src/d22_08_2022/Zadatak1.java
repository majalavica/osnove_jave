package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		Autor prviAutor = new Autor("Meša", "Selimović");
		prviAutor.print();

		Knjiga tvrdjava = new Knjiga(9736, "\"Tvrdjava\"", 1966, prviAutor);
		tvrdjava.printDva();
		System.out.println("_____________________________________________________________");

		System.out.println();

		Autor drugiAutor = new Autor("Gari", "Capman");
		drugiAutor.print();

		Knjiga brak = new Knjiga(573232, "\"Četiri godišnja doba braka\"", 2011, drugiAutor);
		brak.printDva();
		System.out.println("_____________________________________________________________");

	}

}
