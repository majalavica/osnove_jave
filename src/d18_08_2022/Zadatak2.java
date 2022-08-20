package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
//
		Facebook first = new Facebook();
		first.postedUser = "Jim Carrey";
		first.receivedUser = "Aleksandar Vucic";
		first.opinion = "Liar, Liar";
		first.likes = 7821;
		first.shares = 71;
		first.like();
		first.like();
		first.like();
		first.dislike();
		first.share();
		first.print();
		
		System.out.println();
		
		Facebook second = new Facebook();
		second.postedUser = "Ivica Dacic";
		second.receivedUser = "Jovana Jeremic";                                                                                                                                                                                                                                                                                                                                                                                                                                     
		second.opinion = "Mrsavi ljudi su zli ljudi";
		second.likes = 6;
		second.shares = 701;
		second.dislike();
		second.dislike();
		second.dislike();
		second.dislike();
		second.dislike();
		second.share();
		second.share();
		second.print();

	}

}
