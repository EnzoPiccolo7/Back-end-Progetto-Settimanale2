package bibliotecaInfo;

public class Rivista  extends Letterario{
			public Rivista(String coduni, int annoPub, int numeroPag, String titolo, Periodo periodo) {
		super(coduni, annoPub, numeroPag, titolo);
		this.periodo = periodo;
	}

			private Periodo periodo;

			public Periodo getPeriodo() {
				return periodo;
			}

			public void setPeriodo(Periodo periodo) {
				this.periodo = periodo;
			}

			@Override
			public String toString() {
				return "Rivista [periodo=" + periodo + ", toString()=" + super.toString() + "]";
			}
			
}
