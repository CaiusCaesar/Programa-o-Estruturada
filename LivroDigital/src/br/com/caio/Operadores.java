package br.com.caio;

public class Operadores {

	public static void main(String[] args) {
		int anoDePublicacao = 2013;
		double avaliacao = 4.5;
		boolean planoPlus = true;
		String clienteVip = "Vip";
		
		if(anoDePublicacao > 1990) {
			System.out.println("O livro é atual");
		}else {
			System.out.println("O livro é nostálgico");
		}
		
		if (avaliacao == 5) {
			System.out.println("e Excelente");
		} else if (avaliacao <5 && avaliacao > 4) {
			System.out.println("e Bom");
		} else if (avaliacao < 4) {
			System.out.println("e Regular");			
		}
		if (planoPlus) {
			System.out.println("Pode levar o livro");
		} else {
			System.out.println("Você deve alugar o livro");
		}
		if (clienteVip.equals("Vip") || planoPlus) {
			System.out.println("Esse cliente é Vip");			
		} else {
			System.out.println("Faça um plano para ser nosso cliente Vip");
		}
	}

}
