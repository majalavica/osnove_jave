package Vezbanje;

public class DUOPaket extends Paket {

//	Kreirati klasu DUOPaket koaj nasledjuje klasu Paket i koja ima:
//ovaj paket ima 6 meseci po dinar
//naziv paketa je EON FULL DUO
//uredjaj koji dodatno ide uz ovaj paket (moze biti fiksni/mobilni/tablet/laptop)
//brzina interneta ovog paketa je 250/100 MB
//metodu za povecanje brzine interneta, kao parametar se unosi koliko je to uvecanje
//metodu za stampu 
//ime i prezime korisnika 
//naziv paketa - brzina download/brzina upload - ugovorna obaveza
//cena + broj meseci za dinar

	private int meseciPoDinar;
	private String uredjajPoklon;

	public DUOPaket(String nazivPaketa, String fullName, double mesecnaCena, int ugovornaObaveza, int brzinaDownload,
			int brzinaUpload, String uredjajPoklon) {
		super("EON FULL DUO", fullName, mesecnaCena, ugovornaObaveza, 250, 100);
		this.meseciPoDinar = 6;
		this.uredjajPoklon = uredjajPoklon;
	}

	public void povecanjeBrzine(int uvecanje) {
		uvecanje += this.getBrzinaDownload();
		uvecanje += this.getBrzinaUpload();
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Imate: " + this.meseciPoDinar + " meseci za dinar.");
		System.out.println();
	}
}
