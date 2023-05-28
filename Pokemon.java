package pokemain;

public class Pokemon {
	private String naPok;
	private int CP;

	public String getNaPok() {
		return naPok;
	}
	public void setNaPok(String naPok) {
		this.naPok = naPok;
	}
	public int getCP() {
		return CP;
	}
	public void setCP(int CP) {
		this.CP = CP;
	}
	public Pokemon(String naPok, int CP) {
		this.naPok = naPok;
		this.CP = CP;
	}
}
