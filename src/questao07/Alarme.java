package questao07;

import java.util.Date;
import java.util.GregorianCalendar;

public class Alarme {
	private int hora;
	private int minuto;
	private static final int MENOR_INTERVALO_HORA = 0;
	private static final int MAIOR_INTERVALO_HORA = 23;
	private static final int MENOR_INTERVALO_MINUTO = 0;
	private static final int MAIOR_INTERVALO_MINUTO = 59;

	public Alarme(int hora, int minuto) throws HoraInvalidaException, MinutoInvalidoException {
		if (hora < MENOR_INTERVALO_HORA || hora > MAIOR_INTERVALO_HORA) {
			throw new HoraInvalidaException();
		} else if (minuto < MENOR_INTERVALO_MINUTO || minuto > MAIOR_INTERVALO_MINUTO) {
			throw new MinutoInvalidoException();
		}
		this.hora = hora;
		this.minuto = minuto;
	}

	public boolean isAgora() {
		GregorianCalendar agora = new GregorianCalendar();
		agora.setTime(new Date());
		return this.hora == agora.get(GregorianCalendar.HOUR_OF_DAY)
				&& this.minuto == agora.get(GregorianCalendar.MINUTE);
	}
}
