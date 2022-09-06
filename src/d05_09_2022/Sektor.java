package d05_09_2022;

public class Sektor {

//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor

	private String naziv;
	private double plata;

	public Sektor(String naziv, double plata) {
		super();
		this.naziv = naziv;
		this.plata = plata;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}

}
