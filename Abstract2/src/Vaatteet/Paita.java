package Vaatteet;

public class Paita {
	private String merkki;
	
	public Paita(String merkki) {
		this.merkki = merkki;
	}
	public String getMerkki() {
		return merkki;
	}
	
	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}
	
	public String toString() {
		return merkki;
	}
	
}
