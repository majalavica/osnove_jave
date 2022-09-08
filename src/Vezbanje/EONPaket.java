package Vezbanje;

public class EONPaket extends Paket {

//	Kreirati klasu EONPaket koja nasledjuje klasu Paket i koja ima:
//ovaj paket ima 3 meseca po dinar
//ovaj paket se zove EON LIGHT DUO
//brzina interneta ovog paketa je 150/75 MB
//metodu za stampu koja stampa podatke u formatu:
//ime i prezime korisnika 
//naziv paketa - brzina download/brzina upload - ugovorna obaveza
//cena + broj meseci za dinar

	private int meseciPoDinar;

	public EONPaket(String nazivPaketa, String fullName, double mesecnaCena, int ugovornaObaveza, int brzinaDownload,
			int brzinaUpload) {
		super("EON LIGHT DUO", fullName, mesecnaCena, ugovornaObaveza, 150, 75);
		this.meseciPoDinar = 3;
	}

	@Override
	public void print() {// Moze print, nije abstraktna klasa
		super.print();
		System.out.println("Imate: " + this.meseciPoDinar + " meseci za dinar.");
		System.out.println();
	}

}
