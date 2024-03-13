package br.com.caio;

public class Main {

	public static void main(String[] args) {
		
		// text block
		System.out.println("********************************");
		System.out.println("Seja Bem Vinde à Biblioteca Digital");
		System.out.println("********************************\n");
		
		
		String nomeLivro = "A Desumanização";
		int anoDePublicacao = 2013;
		double avaliacao = 4.5;
		boolean planoPlus = true;
		double mediaAvaliacao = 0;
		int valor;
		String sinopse = """
				É um livro sobre o sofrimento do luto, o sentimento de solidão e 
					a reconstrução da própria identidade, já que não se pode ser apenas uma metade.
			""";
		
		mediaAvaliacao = (4.5 + 4.8 + 3.8)/3;
		
		valor = (int) mediaAvaliacao;
		
		System.out.println("Nome: " + nomeLivro);
		System.out.println("Ano de Publicação: " + anoDePublicacao);
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Plano Plus: " + planoPlus);
		System.out.println("Média das Avaliações: " + mediaAvaliacao);
		System.out.println("Sinopse: " + sinopse);
	}

}
