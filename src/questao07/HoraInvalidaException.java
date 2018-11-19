package questao07;

public class HoraInvalidaException extends Exception{

	private static final long serialVersionUID = 1L;

	public HoraInvalidaException() {
		super("A hora digitada é inválida");
	}

}
