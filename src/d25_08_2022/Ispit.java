package d25_08_2022;

public class Ispit {

//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	private String nazivPredmeta;
	private int ocena;
	private String fullNameProf;

	public Ispit(String nazivPredmeta, int ocena, String fullNameProf) {
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.fullNameProf = fullNameProf;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getFullNameProf() {
		return fullNameProf;
	}

	public void setFullNameProf(String fullNameProf) {
		this.fullNameProf = fullNameProf;
	}

//_________metode_________
	public boolean polozenIspit() {
		if (this.ocena > 6 && this.ocena <= 10) {
			return true;
		} else {
			return false;
		}

	}

	public void stampa() {
		System.out.println(this.nazivPredmeta + " - " + this.fullNameProf + " - " + this.ocena);

	}
}
