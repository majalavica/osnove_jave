package d23_08_2022;

public class Transakcija {

//	Kreirati klasu Transakcija koja ima:
//id transakcije
//racun sa kog se prenose sredstva
//racun na koji se prenose sredstva
//gettere i settere
//konstruktore
//privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//ako je prenos sredstava manji od 4500, provizija je fiksna 45
//ako je prenos sredstava veci od 4500, provizija je 1% 
//S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//metodu koja stampa podatke o transakciji u formatu:
//id transkacije
//Racun sa: Ime i prezime  -  broj racuna
//Racun na: Ime i prezime  -  broj racuna

	private String id;
	private Racun racunSalje;
	private Racun racunPrima;

	public Transakcija(String id, Racun racunSalje, Racun racunPrima) {
		this.id = id;
		this.racunSalje = racunSalje;
		this.racunPrima = racunPrima;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunSalje() {
		return racunSalje;
	}

	public void setRacunSalje(Racun racunSalje) {
		this.racunSalje = racunSalje;
	}

	public Racun getRacunPrima() {
		return racunPrima;
	}

	public void setRacunPrima(Racun racunPrima) {
		this.racunPrima = racunPrima;
	}

	// _______metode_________

	private double provizija(double visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		} else if (visinaTransakcije > 4500) {
			return visinaTransakcije / 100;
		} else {
			return 0;
		}
	}

	// metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na
	// drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
	// Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) +
	// (provizija), a na drugi racun dodaje samo (trazena suma).

	public void izvrsiTransakciju(double visinaTransakcije) {
		this.getRacunPrima().menjanjeStanja(visinaTransakcije);
		this.racunSalje.menjanjeStanja(-(visinaTransakcije + provizija(visinaTransakcije)));
	}

	
	public void stampaj() {
		System.out.println("_______________________________________________________________________");
		System.out.println();
		System.out.println("        *********TRANSAKCIJA JE U TOKU*******************");
		System.out.println();
		System.out.println("             Id transakcije " + this.id);
		System.out.println("             Racun sa: " + this.racunSalje.getFullName() + " - " + this.racunSalje.getBrojRacuna());
		System.out.println("             Racun na: " + this.racunPrima.getFullName() + " - " + this.racunPrima.getBrojRacuna());
		System.out.println();
		System.out.println("         *********TRANSAKCIJA JE USPELA*******************");	
		System.out.println("_______________________________________________________________________");
		System.out.println();
	}
}
