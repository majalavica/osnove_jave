package d23_08_2022;

import java.util.ArrayList;

import p23_08_2022.Sastojak;

public class Zadatak1 {

	public static void main(String[] args) {

//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<ZeleniKarton>();

		ZeleniKarton prvi = new ZeleniKarton("Marija Jovanovic", 54221, "Testiranje softvera", "Vlada Minic", 8);
		ZeleniKarton drugi = new ZeleniKarton("Pera Peric", 50821, "HTML", "Milan Jovanovic", 5);
		ZeleniKarton treci = new ZeleniKarton("Suza Grujic", 50011, "Css", "Stefan Mischock", 6);
		ZeleniKarton cetvrti = new ZeleniKarton("Marko Stevic", 78551, "Selenium", "Adam Lee", 10);
		ZeleniKarton peti = new ZeleniKarton("Ljubica Mitrovic", 98531, "Grey-Box-Testing", "Aleksandra Peric", 8);
		ZeleniKarton sesti = new ZeleniKarton("Marinko Jovicic", 54871, "JavaScript", "Garry Scream", 7);
		ZeleniKarton sedmi = new ZeleniKarton("Sasa Peric", 36971, "C++", "Vukasin Mitrovic", 9);
		
//		prvi.polozenIspit();
//		System.out.println(prvi.polozenIspit());

		zeleniKarton.add(prvi);
		zeleniKarton.add(drugi);
		zeleniKarton.add(treci);
		zeleniKarton.add(cetvrti);
		zeleniKarton.add(peti);
		zeleniKarton.add(sesti);
		zeleniKarton.add(sedmi);

		for (int i = 0; i < zeleniKarton.size(); i++) {
			zeleniKarton.get(i).stampaj();
		}

//		int prosecnaOcena = 0;
		int sum = 0;

		for (int i = 0; i < zeleniKarton.size(); i++) {
			sum = sum + zeleniKarton.get(i).getOcena();

//			if (prvi.polozenIspit() == true) {
//				prosecnaOcena = sum / zeleniKarton.size();
//			}	
		}
		System.out.println("Prosecna ocena svih ispita je: " + sum / zeleniKarton.size());
//		System.out.println("Prosecna ocena samo polozenih ispita je: " + prosecnaOcena);

	}

}
