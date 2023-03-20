package targetTeste;

import java.util.Scanner;

public class quintoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String primeiraString = input.nextLine();
		String stringConvertida = "";

		for (int i = primeiraString.length() - 1; i >= 0; i--) {
			stringConvertida = stringConvertida + primeiraString.charAt(i);
		}
		System.out.println(stringConvertida);
		input.close();
	}
}
