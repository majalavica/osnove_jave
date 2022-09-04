package MiniProjekat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XandOGame {
//	Kreirati klasu XandOGame koja ima:
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//	nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//	playerX - igrac X
//	playerO - igrac O
//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//	gettere i settere za igrace
//	Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |
//
//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x
//	x | x | 0 |
//	0 |   |   |
//	x |   |   |
//	I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//	x | x | 0 |
//	0 |   | x |
//	x |   |   |
//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0

	private ArrayList<String> table = new ArrayList<String>();// table = x, x, 0, 0, x, 0, x, 0, x
	private Player nextPlayer;
	private Player igracX;
	private Player igrac0;

	public XandOGame() {
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public XandOGame(Player igracX, Player igrac0) {
		this.igracX = igracX;
		this.igrac0 = igrac0;
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

	public Player getIgracX() {
		return igracX;
	}

	public void setIgracX(Player igracX) {
		this.igracX = igracX;
	}

	public Player getIgrac0() {
		return igrac0;
	}

	public void setIgrac0(Player igrac0) {
		this.igrac0 = igrac0;
	}

	// ______print________
	public void print() {
		for (int i = 0; i < this.table.size(); i++) {
			System.out.print(this.table.get(i) + " | ");
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}

	public void startGame() {
		for (int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
		}
		this.nextPlayer = igracX;
	}

	public boolean isGameOver() {

		int brojPopunjenihPolja = 0;
		if (brojPopunjenihPolja == table.size()) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFieldFree(int position) {
		if (!table.get(position).equals("x") || !table.get(position).equals("0")) {
			return true;
		} else {
			return false;
		}

	}

	public void playNext() {
		if (this.nextPlayer == igracX) {
			this.nextPlayer = igrac0;
		} else if (this.nextPlayer == igrac0) {
			this.nextPlayer = igracX;
		}
	}

	public void makeAMove(int position) {
		if (this.nextPlayer == igracX) {
			this.table.set(position, "x");
		} else if (this.nextPlayer == igrac0) {
			this.table.set(position, "0");
		}

	}
//_____________WINNER___________________

//	List topRow = Arrays.asList(0, 1, 2);
//	List midRow = Arrays.asList(3, 4, 5);
//	List botRow = Arrays.asList(6, 7, 8);
//	List leftCol = Arrays.asList(1, 4, 7);
//	List midCol = Arrays.asList(2, 5, 8);
//	List rightCol = Arrays.asList(2, 5, 8);
//	List diag1 = Arrays.asList(0, 4, 8);
//	List diag2 = Arrays.asList(6, 4, 2);

//	  0 | 1 | 2    
//	   ----------
//	  3 | 4 | 5  
//	   ----------
//	  6 | 7 | 8 

	public boolean isWinnerX(Player igracX) {

		if ((this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x"))
				|| (this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x"))
				|| (this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x"))
				|| (this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x"))
				|| (this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x"))
				|| (this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x"))
				|| (this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x"))
				|| (this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x"))) {
			return true;

		}
		return false;

	}

	public boolean isWinnerO(Player igrac0) {
		if ((this.table.get(0).equals("0") && this.table.get(1).equals("0") && this.table.get(2).equals("0"))
				|| (this.table.get(0).equals("0") && this.table.get(3).equals("0") && this.table.get(6).equals("x"))
				|| (this.table.get(0).equals("0") && this.table.get(4).equals("0") && this.table.get(8).equals("x"))
				|| (this.table.get(1).equals("0") && this.table.get(4).equals("0") && this.table.get(7).equals("x"))
				|| (this.table.get(2).equals("0") && this.table.get(5).equals("0") && this.table.get(8).equals("x"))
				|| (this.table.get(2).equals("0") && this.table.get(4).equals("0") && this.table.get(6).equals("x"))
				|| (this.table.get(3).equals("0") && this.table.get(4).equals("0") && this.table.get(5).equals("x"))
				|| (this.table.get(6).equals("0") && this.table.get(7).equals("0") && this.table.get(8).equals("x"))) {
			return true;
		}
		return false;

	}

	public boolean isValidMove(int position) {
		if (position >= 0 && position <= 8) {
			return true;
		}
		return false;
	}


	public int gameScore() {
		if (this.isWinnerX(igracX)) {
			return 1;
		} else if (this.isWinnerO(igrac0)) {
			return 2;
		}
		return 0;
	}
}
