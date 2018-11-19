package questao03;

import java.util.Scanner;

public class IntervaloDeDiasApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Data data = null;

		do {
			try {
				System.out.print("Digite o dia: ");
				int dia = teclado.nextInt();
				System.out.print("Digite o mês: ");
				int mes = teclado.nextInt();
				System.out.print("Digite o ano: ");
				int ano = teclado.nextInt();
				data = new Data(dia, mes, ano);
				System.out.println(
						"Faltam " + data.getQuantidadeDeDias() + " dia(s) para a data " + dia + "/" + mes + "/" + ano);
			} catch (DataInvalidaException e) {
				System.out.println(e.getMessage());
			}

		} while (data == null);
		teclado.close();
	}

}
