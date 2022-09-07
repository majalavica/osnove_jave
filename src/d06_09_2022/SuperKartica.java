package d06_09_2022;

public class SuperKartica {

//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)

	private String brojKartice;
	private String fullName;
	private int popust; // 200,500

	public SuperKartica() {

	}

	public SuperKartica(String brojKartice, String fullName, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.fullName = fullName;
		this.popust = popust;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

//____print____
	public void stampaj() {
		System.out.println("(" + this.brojKartice + "), (" + this.fullName + ")");
	}
}
