package questao01;

public class MesInvalidoException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public MesInvalidoException() 
	{	super("O número do mês deve estar contido no intervalo [1, 12]");	
	}
}
