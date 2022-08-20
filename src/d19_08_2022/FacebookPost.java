package d19_08_2022;

public class FacebookPost {

//	Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja

//		 Konstruktore:
//		difoltni konstuktor
//		konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave

//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1

	private String postedUser;
	private String receivedUser;
	private String opinion;
	private int likes;
	private int shares;
	
	//_____Defaultni konstruktor______
	public FacebookPost() {

	}

	public FacebookPost(String postedUser, String receivedUser, String opinion) {
		this.postedUser = postedUser;
		this.receivedUser = receivedUser;
		this.opinion = opinion;
	}

	public void setPostedUser(String postedUser) {
		this.postedUser = postedUser;
	}

	public String getPostedUser() {
		return postedUser;
	}

	public void setReceivedUser(String receivedUser) {
		this.receivedUser = receivedUser;
	}

	public String getReceivedUser() {
		return receivedUser;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	//_____Metode_____
	
	public void like() {
		this.likes++;
	}

	public void dislike() {
		if (this.likes > 0) {
			this.likes--;
		}
	}

	public void share() {
		this.shares++;
	}

	public void print() {
		System.out.println(this.postedUser + " >>> " + this.receivedUser);
		System.out.println(this.opinion);
		System.out.println("Likes " + this.likes + " | Shares " + this.shares);
	}
	
}
