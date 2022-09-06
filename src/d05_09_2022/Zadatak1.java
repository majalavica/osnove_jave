package d05_09_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i 
//			ispisati platu za svakog
		
		Sektor prvi = new Sektor("Popis robe", 70000);
		Sektor drugi = new Sektor("Utovar robe", 150000);
		Sektor treci = new Sektor("Odrzavanje robe" , 30000);
		Sektor cetvrti = new Sektor("Prodaja", 50000);
		Sektor peti = new Sektor("Proizvodnja", 80000);
		
		Menadzer menadzer = new Menadzer("Janko Veselinovic");
		menadzer.zaposli(prvi);
		menadzer.zaposli(cetvrti);
		menadzer.zaposli(drugi);
		menadzer.print();
		System.out.println();


		Magacioner magacioner = new Magacioner("Marko Markovic");
		magacioner.zaposli(treci);
		magacioner.zaposli(peti);
		magacioner.print();
		
		
	
	}

}
