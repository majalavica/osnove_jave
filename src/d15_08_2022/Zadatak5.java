package d15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.

		stampa(5, "/");

	}

	public static void stampa(int n, String karakter) {

		for (int i = 0; i < n; i++) {
			if (i == 0)
				System.out.print(karakter);
			else
				System.out.print(" " + karakter);
		}
	}
}
