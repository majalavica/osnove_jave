package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	private double kaucijaZaFlasu;
	private boolean placaSeKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza(String barkod, String nazivProizvoda, double netoTezina, double brutoTezina,
			double kaucijaZaFlasu, boolean placaSeKaucija, double osnovnaCena) {
		super(barkod, nazivProizvoda, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	@Override
	public double cenaArtikla() {
		if (this.placaSeKaucija == true) {
			return (this.osnovnaCena) * 1.2 + (this.kaucijaZaFlasu);
		} else {
			return this.osnovnaCena * 1.2;
		}

	}

	@Override
	public void stampaj() {
		if(this.placaSeKaucija == true) {
			System.out.println("Kaucija se placa: " + this.placaSeKaucija + ", i kosta " + this.kaucijaZaFlasu + " din.");
		}	else {
			System.out.println("Kaucija se ne naplacuje za ovu ambalazu.");
		}
		System.out.println("Osnovna cena je: " + this.osnovnaCena);
	}

}
