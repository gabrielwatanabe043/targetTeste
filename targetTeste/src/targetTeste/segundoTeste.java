package targetTeste;

import java.util.Scanner;

public class segundoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean pertence = true;
		int soma = 0, primeiroNumero = 0, segundoNumero = 1;
		System.out.println("Digite numero para saber se pertence a Fibonacci");
		int numeroEscolhido = input.nextInt();
		if (numeroEscolhido == 0 || numeroEscolhido == 1) {
			System.out.println("Pertence a Fibonacci");
		} else {
			while (pertence) {
				soma = primeiroNumero + segundoNumero;
				if (soma == numeroEscolhido) {
					System.out.println("O número " + numeroEscolhido + " pertence a Fibonacci");
					pertence = false;
				} else if (soma > numeroEscolhido) {
					System.out.println("O número " + numeroEscolhido + " não pertence a Fibonacci");
					pertence = false;
				} else {
					primeiroNumero = segundoNumero;
					segundoNumero = soma;
				}
			}
		}
		input.close();
	}
}
