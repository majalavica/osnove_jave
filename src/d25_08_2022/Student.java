package d25_08_2022;

import java.util.ArrayList;

public class Student {

//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private int index;
	private String fullName;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(int index, String fullName, String tipStudija) {
		this.index = index;
		this.fullName = fullName;
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	// _______metode____________
	public void dodajIspit(Ispit ispiti) {
		this.ispiti.add(ispiti);
	}

	public double prosekPolozenih() {
		double zbirPolozen = 0;
		int brojPolozen = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (ispiti.get(i).polozenIspit() == true) {
				zbirPolozen = zbirPolozen + ispiti.get(i).getOcena();
				brojPolozen++;
			}
		}
		return (zbirPolozen / brojPolozen);
	}

	public void print() {
		System.out.println("Predmeti:");
		System.out.println();
		for (int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).stampa();
		}
		System.out.println("Prosecna ocena: " + this.prosekPolozenih());
	}
}
