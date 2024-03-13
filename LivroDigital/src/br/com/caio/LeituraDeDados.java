package br.com.caio;
import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int anoDePublicacao = 0;
		double avaliacao = 0;
		String clienteVip = "";
		
		System.out.println("Digite o ano de publicação");
		anoDePublicacao = scanner.nextInt();
		System.out.println("Digite a sua avaliação");
		avaliacao = scanner.nextDouble();
		System.out.println("Digite o tipo de cliente");
		clienteVip = scanner.next();
		
		System.out.println("Ano de Publicação: " + anoDePublicacao);
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Tipo cliente: " + clienteVip);

	}

}
