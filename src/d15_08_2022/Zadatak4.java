package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//			JMBG: [jmbg]
//			Ime: [ime]
//			Prezime: [prezime]
//			God. rodjenja: [god]
//			Aktivan: [true/false]
//			Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		documents("050299854224", "Marija", "Jovanovic", "24", true);
	}

	public static void documents(String jmbg, String ime, String prezime, String godine, boolean aktivna) {

		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime i prezime: " + ime + " " + prezime);
		System.out.println("Godine: " + godine);
		System.out.println("Aktivna: " + aktivna);

	}

}
