package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//			(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
//			Podatke za igrace i trenere unosi korisnik sa tastature.

//
//		Igrac tehnicar = new Igrac("Dijana Manic", "0501999003", 1999);
//		tehnicar.setBrojDresa(06);
//		tehnicar.setPozicijaIgraca("Tehnicar");
//		tehnicar.setKapiten(true);
//		tehnicar.print();
//		System.out.println();
//
//		Igrac libero = new Igrac("Marija Jovanovic","05029981547", 1998);
//		libero.setBrojDresa(23);
//		libero.setPozicijaIgraca("Srednjak/Libero");
//		libero.setKapiten(false);
//		libero.print();
//		System.out.println();
//
//		Trener zvezda = new Trener("Aca Vjestica", "508975155", 1975);
//		zvezda.setGodineIskustva(21);
//		zvezda.setTipTrenera("Glavni trener Zvezde");
//		zvezda.print();
//		System.out.println();
//
//		Trener mladiRadnik = new Trener("Slavisa Markovic", "110596044", 1960);
//		mladiRadnik.setGodineIskustva(34);
//		mladiRadnik.setTipTrenera("Glavni trener prve postave");
//		mladiRadnik.print();

		// _____________ZA VEZBANJEEEE______________
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		Scanner s = new Scanner(System.in);

		// _______Korisnik unosi igrace______
		System.out.print("Unesite broj igraca: ");
		int brojIgraca = s.nextInt();

		for (int i = 0; i < brojIgraca; i++) {
			System.out.print("Unesite ime i prezime: ");
			String fullName = s.next();

			System.out.print("Unesite JMBG: ");
			String jmbg = s.next();

			System.out.print("Unesite godinu rodjenja: ");
			int godinaRodjenja = s.nextInt();

			System.out.print("Unesite broj dresa: ");
			int brojDresa = s.nextInt();

			System.out.print("Unesite poziciju igraca");
			String pozicija = s.next();

			System.out.print("Da li je igrac kapiten tima: ");
			boolean kapiten = s.nextBoolean();

			Igrac player = new Igrac(fullName, jmbg, godinaRodjenja);
			player.setBrojDresa(brojDresa);
			player.setPozicijaIgraca(pozicija);
			player.setKapiten(kapiten);

			igraci.add(player);

		}
		// ______Korisnik unosi trenere____
		System.out.println("______________________________________________________");
		System.out.print("Unesite broj trenera: ");
		int brojTrenera = s.nextInt();

		for (int i = 0; i < brojTrenera; i++) {
			System.out.print("Unesite ime i prezime: ");
			String fullName = s.next();

			System.out.print("Unesite JMBG: ");
			String jmbg = s.next();

			System.out.print("Unesite godinu rodjenja: ");
			int godinaRodjenja = s.nextInt();

			System.out.print("Tip trenera: ");
			String tipTrenera = s.next();

			System.out.print("Godine iskustva: ");
			int godineIskustva = s.nextInt();

			Trener trener = new Trener(fullName, jmbg, godinaRodjenja);
			trener.setGodineIskustva(godineIskustva);
			trener.setTipTrenera(tipTrenera);

			treneri.add(trener);
		}
		System.out.println("______________________________________________________");
		// ________Print______

		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).print();

		}
		System.out.println();

		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).print();
		}
	}

}
