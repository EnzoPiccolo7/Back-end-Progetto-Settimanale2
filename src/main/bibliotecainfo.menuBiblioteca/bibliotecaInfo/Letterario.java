package bibliotecaInfo;

public abstract class Letterario {
	private String coduni;
	private int annoPub;
	private int numeroPag;
	private String titolo;
	
	public Letterario(String coduni, int annoPub, int numeroPag, String titolo) {
		super();
		this.coduni = coduni;
		this.annoPub = annoPub;
		this.numeroPag = numeroPag;
		this.titolo = titolo;
	}
	public String getCoduni() {
		return coduni;
	}
	public void setCoduni(String coduni) {
		this.coduni = coduni;
	}
	public int getAnnoPub() {
		return annoPub;
	}
	public void setAnnoPub(int annoPub) {
		this.annoPub = annoPub;
	}
	public int getNumeroPag() {
		return numeroPag;
	}
	public void setNumeroPag(int numeroPag) {
		this.numeroPag = numeroPag;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	@Override
	public String toString() {
		return "Letterario [coduni=" + coduni + ", annoPub=" + annoPub + ", numeroPag=" + numeroPag + ", titolo="
				+ titolo + "]";
	}


}
