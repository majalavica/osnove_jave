package d26_08_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

	protected String fullName;
	protected String jmbg;
	protected int godinaRodjenja;

	public Osoba() {
	}

	public Osoba(String fullName, String jmbg, int godinaRodjenja) {
		super();
		this.fullName = fullName;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

//____stampa_____
//	(ime i prezime), (jmbg), (godina rodjenja)
	public void print() {
		System.out.println("(" + this.fullName + "), (" + this.jmbg + "), " + "(" + this.godinaRodjenja + ")");
	}
}
