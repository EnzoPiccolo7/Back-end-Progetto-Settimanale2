package bibliotecaInfo;

public class Libro extends Letterario {
	private String genere;
	private String autore;
	public Libro(String coduni, int annoPub, int numeroPag, String titolo, String genere, String autore) {
		super(coduni, annoPub, numeroPag, titolo);
		this.genere = genere;
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	@Override
	public String toString() {
		return "Libro [genere=" + genere + ", autore=" + autore + ", toString()=" + super.toString() + "]";
	}
	
}
