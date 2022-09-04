package MiniProjekat;

public class Player {
//	Kreirati klasu Player koja ima:
//		ime i prezime
//		gettere i settere
//		konstuktore
//		metodu print, koja stampa ime i prezime igraca
	private String fullName;

	public Player(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	// ___print_____
	public void print() {
		System.out.println("Ime i prezime: " + this.fullName);
	}

}
