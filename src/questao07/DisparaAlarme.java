package questao07;

import java.util.Scanner;

public class DisparaAlarme {
	public static void main(String[] args) throws HoraInvalidaException, MinutoInvalidoException, InterruptedException {
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.print("Digite a hora do alarme: ");
			int hora = teclado.nextInt();
			System.out.print("Digite o minuto do alarme: ");
			int minuto = teclado.nextInt();
			Alarme alarme;
			alarme = new Alarme(hora, minuto);
			while (!alarme.isAgora()) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("Alarme disparado");
		} catch (HoraInvalidaException | MinutoInvalidoException | InterruptedException e) {
			System.out.println(e.getMessage());
		}

		teclado.close();

	}
}
