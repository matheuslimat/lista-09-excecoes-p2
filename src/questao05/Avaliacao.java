package questao05;

public class Avaliacao {
	private final static double MENOR_NOTA = 0;
	private final static double MAIOR_NOTA = 10;

	private double nota1;
	private double nota2;

	public void setNota1(double nota1) throws NotaInvalidaException {
		if (nota1 < MENOR_NOTA || nota1 > MAIOR_NOTA) {
			throw new NotaInvalidaException();
		}
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) throws NotaInvalidaException {
		if (nota2 < MENOR_NOTA || nota2 > MAIOR_NOTA) {
			throw new NotaInvalidaException();
		}
		this.nota2 = nota2;
	}

	public double getMedia() {
		return (nota1 + nota2) / 2;
	}
}
