package questao02;

import java.util.Scanner;

public class NomeInvertidoApp {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		Pessoa pessoa = new Pessoa();
		try {
			pessoa.setNome(teclado.nextLine());
			System.out.println("Nome invertido: " + pessoa.getNomeInvertido());
		} catch (NomeInvalidoException e) {
			System.out.println(e.getMessage());
		}

		teclado.close();
	}
}
