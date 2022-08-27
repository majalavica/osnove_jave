package d26_08_2022;

public class Trener extends Osoba {
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

	private int godineIskustva;
	private String tipTrenera;

	public Trener(String fullName, String jmbg, int godinaRodjenja) {
		super(fullName, jmbg, godinaRodjenja);
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	// _____stampa____
	@Override
	public void print() {
		super.print();
		System.out.println("Trener je vec: " + this.godineIskustva + " god.");
		System.out.println("Tp trenera: " + this.tipTrenera);
	}

}
