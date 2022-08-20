package d16_08_2022;

public class SmartAirConditioning {

	public String marka;
	public int temp;
	public String mod;

	public void stampaj() {
		System.out.println("Marka: " + this.marka);
		System.out.println("Temperatura: " + this.temp);
		System.out.println("Mod (hladno/toplo): " + this.mod);
	}

	public boolean boomerang(int tempNapolju) {
		if (this.temp > tempNapolju) {
			return true;
		} else {
			return false;
		}
	}
}
