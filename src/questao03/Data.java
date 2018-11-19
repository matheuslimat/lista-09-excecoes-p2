package questao03;

import java.util.Date;
import java.util.GregorianCalendar;

public class Data {
	public static final int PRIMEIRO_DIA = 1;
	public static final int ULTIMO_DIA_MES_LONGO = 31;
	public static final int ULTIMO_DIA_FEV_LONGO = 29;
	public static final int PRIMEIRO_MES = 1;
	public static final int FEVEREIRO = 2;
	public static final int ULTIMO_MES = 12;

	public static final long MILISECONDS_PER_DAY = 60 * 60 * 24 * 1000;
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) throws DataInvalidaException {
		if (dia < PRIMEIRO_DIA || ULTIMO_DIA_MES_LONGO < dia || mes < PRIMEIRO_MES || ULTIMO_MES < mes
				|| (dia == ULTIMO_DIA_MES_LONGO && temTrintaDias(mes))
				|| (ULTIMO_DIA_FEV_LONGO < dia && mes == FEVEREIRO)
				|| (ULTIMO_DIA_FEV_LONGO == dia && mes == FEVEREIRO && !isBissexto(ano))) {
			throw new DataInvalidaException();
		}

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public long getQuantidadeDeDias() {
		Date data = new Date(new GregorianCalendar(ano, mes - 1, dia).getTimeInMillis());
		Date agora = new Date();
		return (data.getTime() - agora.getTime()) / MILISECONDS_PER_DAY;
	}

	private boolean isBissexto(int ano) {
		return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
	}

	private boolean temTrintaDias(int mes) {
		return mes == 4 || mes == 6 || mes == 9 || mes == 11;
	}
}
