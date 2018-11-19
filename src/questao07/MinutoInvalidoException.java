package questao07;

public class MinutoInvalidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public MinutoInvalidoException() {
		super("O minuto digitado é inválido");
	}

}
