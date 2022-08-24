package d23_08_2022;

public class ZeleniKarton {

//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

	private String fullNameStudenta;
	private int brojIndexa;
	private String nazivPredmeta;
	private String fullNameProfesora;
	private int ocena;

	public String getFullNameStudenta() {
		return fullNameStudenta;
	}

	public ZeleniKarton(String fullNameStudenta, int brojIndexa, String nazivPredmeta, String fullNameProfesora,
			int ocena) {
		this.fullNameStudenta = fullNameStudenta;
		this.brojIndexa = brojIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.fullNameProfesora = fullNameProfesora;
		this.ocena = ocena;
	}

	public void setFullNameStudenta(String fullNameStudenta) {
		this.fullNameStudenta = fullNameStudenta;
	}

	public int getBrojIndexa() {
		return brojIndexa;
	}

	public void setBrojIndexa(int brojIndexa) {
		this.brojIndexa = brojIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getFullNameProfesora() {
		return fullNameProfesora;
	}

	public void setFullNameProfesora(String fullNameProfesora) {
		this.fullNameProfesora = fullNameProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

//______metode________
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	public boolean polozenIspit() {
		if (this.getOcena() > 5) {
			return true;
		}
		return false;

	}

	public void stampaj() {
		System.out.println("(" + this.nazivPredmeta + ") - (" + this.ocena + ")");
		System.out.println(this.getFullNameStudenta() + ", " + this.brojIndexa);
		System.out.println(this.getFullNameProfesora());
		System.out.println("_________________________________________________________");
	}
}
