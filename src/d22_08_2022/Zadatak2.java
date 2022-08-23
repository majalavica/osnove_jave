package d22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		(Za vezbanje) Kreirati klasu Proizvod koja ima:
//			sifru proizvoda
//			naziv proizvoda
//			cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//			konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//			gettere i settere za sifru i naziv
//			setter za cenu po kilogramu
//			metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//			metodu getCenaLb koja vraca cenu za 1lb prozvoda
//			 		konverzija: 1 kg = 2.2046 lb
//			metodu koja stampa proizvod u formatu:
//			(sifra) - (naziv)
//
//				Kreirati klasu Vaga koja ima:
//			merna jedinica (kg ili lb)
//			proizvod (proizvod koji se meri)
//			TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//			default-ni konstuktor
//			getteri i setteri za sve atribute
//			metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//			metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//			               (sifra) - (naziv)
//			   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//			   Ukupno: (ukupna cena) 	      


		Proizvod vino = new Proizvod("448597", "\"Saumur-Champigny\"", 2390.00);
		Vaga vagaVino = new Vaga();
		vagaVino.setProizvod(vino);
		vagaVino.setMernaJedinica("kg");
		vagaVino.stampaj(21);

		System.out.println("___________________________________________________");

		Proizvod riba = new Proizvod("177895", "\"Brancin\"", 4590.50);
		Vaga vagaRiba = new Vaga();
		vagaRiba.setProizvod(riba);
		vagaRiba.setMernaJedinica("lb");
		vagaRiba.stampaj(40.70);

		System.out.println("___________________________________________________");

		Proizvod sir = new Proizvod("335892", "\"Gorgonzola\"", 5230.00);
		Vaga vagaSir = new Vaga();
		vagaSir.setProizvod(sir);
		vagaSir.setMernaJedinica("kg");
		vagaSir.stampaj(54);

		System.out.println("___________________________________________________");

	}

}
