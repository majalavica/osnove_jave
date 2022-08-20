package d18_08_2022;

public class Proizvod {
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. 
//	Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.
//	Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. 
//	Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//	za tezinu do 100g, postarina iznosi 200din
//	za tezinu od 101g do 500g, postarina iznosi 400din
//	za tezinu preko 500g, postarina iznosi 1000din
//
//	U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

	public String naziv;
	public double cena;
	public double tezinaUGramima;

	public void stampaj() {
		System.out.println("Naziv proizvoda je: " + this.naziv);
		System.out.println("Cena proizvoda je: " + this.cena);
		System.out.println("Tezina proizvoda u gramima je: " + this.tezinaUGramima);
	}

//	public double konvertuj(String jedinica) {
//		if (jedinica.equals("kg")) {
//			return this.tezinaUGramima / 1000;
//		} else if (jedinica.equals("t")) {
//			return this.tezinaUGramima / 1000000;
//		}
//		return 0;
//	}

	public void povecajCenu(int povecanje) {
		this.cena = this.cena + povecanje;
	}

	public double vratiCenuSaPopustom(double popust) {
		return this.cena *(100-popust) * 0.01;
	}

	public double racunajPostarinu() {
		if (this.tezinaUGramima <= 100) {
			return 200;
		}
		if (this.tezinaUGramima >= 101 && this.tezinaUGramima < 500) {
			return 400;
		}
		if (this.tezinaUGramima > 500) {
			return 1000;
		}
		return 0;

	}
}
