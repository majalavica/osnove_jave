package d26_08_2022;

import java.util.ArrayList;

public class IgracZad2 extends OsobaZad2 {

//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	niz kartona
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu dodaj karton, gde se dodaje karton u niz
//	metodu koja vraca broj zutih kartona
//	metodu koja vraca broj crvenih kartona
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int brojDresa;
	private String pozicija;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	private boolean kapiten;

	public IgracZad2() {
		super();
	}

	public IgracZad2(String fullName, String jmbg, int godinaRodjenja, int brojDresa, String pozicija,
			boolean kapiten) {
		super(fullName, jmbg, godinaRodjenja);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

//_____metode______
	public void dodajKarton(Karton kartoni) {
		this.kartoni.add(kartoni);
	}

	public int vratiZutiKarton() {
		int brojZutihKartona = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("zuti")) {
				brojZutihKartona++;
			}
		}
		return brojZutihKartona;
	}

	public int vratiCrveniKarton() {
		int brojCrvenihKartona = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("crveni")) {
				brojCrvenihKartona++;
			}

		}
		return brojCrvenihKartona;
	}
	//_____stampa____
	
	@Override
	public void print() {
		super.print();
		System.out.println("Broj dresa: " + this.brojDresa + ", pozicija: " + this.pozicija);
		System.out.println();
		System.out.println("Kartoni: ");
		System.out.println("Broj zutih: " + this.vratiZutiKarton() + ", Broj crvenih: " + this.vratiCrveniKarton());
		System.out.println("_________________________________________________________");
		
	}
}
