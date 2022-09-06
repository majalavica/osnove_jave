package d05_09_2022;

public class Menadzer extends Radnik {

//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 overrideuje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer(String fullName) {
		super(fullName);
	}

	@Override
	public double plataRadnika() {
		double sum = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			 sum += this.sektori.get(i).getPlata();
		}
		return sum;
	}

	@Override
	public void print() {
		System.out.println("Menadzer: ");
		System.out.println("Ime i prezime: " + this.getFullName());
		System.out.println("Plata Menadzera je: " + this.plataRadnika());
		System.out.println();
	}
}
