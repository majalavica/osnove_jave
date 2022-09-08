package Vezbanje;

public class Paket {

//	Kreirati klasu Paket koja ima:
//	naziv paketa
//	ime i prezime korisnika
//	mesecnu cenu
//	ugovorna obaveza
//	brzina interneta za download
//	brzina interneta za upload
//	getere, setere i konstuktore koji su logicni (brzine interneta nije moguce menjati kao i naziv paketa)
//	metodu produzi ugovor koja produzava ugovor za 12 meseci
//	metodu koja vraca broj meseci koliko korisnik ima po dinar. Uvek vraca nulu
//	metodu za stampu koja stampa podatke u formatu:
//	ime i prezime korisnika
//	naziv paketa - brzina download/brzina upload - ugovorna obaveza
//	cena

	private String nazivPaketa;
	private String fullName;
	private double mesecnaCena;
	private int ugovornaObaveza;
	private int brzinaDownload;
	private int brzinaUpload;

	public Paket(String nazivPaketa, String fullName, double mesecnaCena, int ugovornaObaveza, int brzinaDownload,
			int brzinaUpload) {
		super();
		this.nazivPaketa = nazivPaketa;
		this.fullName = fullName;
		this.mesecnaCena = mesecnaCena;
		this.ugovornaObaveza = ugovornaObaveza;
		this.brzinaDownload = brzinaDownload;
		this.brzinaUpload = brzinaUpload;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getMesecnaCena() {
		return mesecnaCena;
	}

	public void setMesecnaCena(double mesecnaCena) {
		this.mesecnaCena = mesecnaCena;
	}

	public int getUgovornaObaveza() {
		return ugovornaObaveza;
	}

	public void setUgovornaObaveza(int ugovornaObaveza) {
		this.ugovornaObaveza = ugovornaObaveza;
	}

	public String getNazivPaketa() {
		return nazivPaketa;
	}

	public double getBrzinaDownload() {
		return brzinaDownload;
	}

	public double getBrzinaUpload() {
		return brzinaUpload;
	}

//	metodu produzi ugovor koja produzava ugovor za 12 meseci
	public void produziUgovor() {
		this.ugovornaObaveza = this.ugovornaObaveza + 12;
	}

//	metodu koja vraca broj meseci koliko korisnik ima po dinar. Uvek vraca nulu
	public int dinar() {
		return 0;
	}

	public void print() {
		System.out.println(this.fullName);
		System.out.println(this.nazivPaketa + " - " + this.brzinaDownload + "/" + this.brzinaUpload + " - "
				+ this.ugovornaObaveza + " meseci");
		System.out.println("Cena: " + this.mesecnaCena + " din.");
	}
}
