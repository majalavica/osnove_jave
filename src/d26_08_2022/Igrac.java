package d26_08_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int brojDresa;
	private String pozicijaIgraca;
	private boolean kapiten;

	public Igrac() {

	}

	public Igrac(String fullName, String jmbg, int godinaRodjenja) {
		super(fullName, jmbg, godinaRodjenja);
	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}

	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

//____stampa____
	@Override
	public void print() {
		super.print();
		System.out.println("Broj dresa: " + this.brojDresa);
		System.out.println("Pozicija igraca: " + this.pozicijaIgraca);
		System.out.println("Igrac je kapiten tima: " + this.kapiten);
	}
}
