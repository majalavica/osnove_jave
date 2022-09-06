package d05_09_2022;

public class Magacioner extends Radnik {

//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String fullName) {
		super(fullName);
	}

	private double prosecnaPlata() {
		double prosecnaSuma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			prosecnaSuma += this.sektori.get(i).getPlata();
		}
		return prosecnaSuma / this.sektori.size() * 0.5;
	}

	@Override
	public double plataRadnika() {
		return this.prosecnaPlata() * this.sektori.size();
	}

	@Override
	public void print() {
		System.out.println("Magacioner: ");
		System.out.println("Ime i prezime: " + this.getFullName());
		System.out.println("Plata Magacionera je: " + this.plataRadnika());
	}
}
