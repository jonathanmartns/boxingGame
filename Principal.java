package lutaBoxe;

public class Principal {
	public static void main(String[] args) {
		/*
		Pugilista tyson = new Pugilista("Mike 'Iron' Tyson", 30);
		Pugilista loma = new Pugilista("Loma 'Hi tech' Chenko", 30);
		
		Arbitragem arbitros = new Arbitragem();
		
		Luta luta1 = new Luta(tyson, loma, arbitros, 3);
		luta1.iniciarLuta();
		luta1.contarPontos();
		luta1.atualizarCartel();
		
		if(luta1.isEmpate())
			System.out.printf("Empate!\n");
		else
			System.out.printf("Vencedor: %s\n", luta1.getVencedor().getNome());

		
		System.out.printf("-- Cartel --\n");
		System.out.printf("Cartel lutador 1 vitorias: %d\n", tyson.getVitorias());
		System.out.printf("Cartel lutador 2 vitorias: %d\n", loma.getVitorias()); */
		
		int resposta = 0;
		int sair = 0;
		int cadastrarAtleta = 1;
		int listarAtletas = 2;
		int marcarLuta = 3;
		
		int atletasQuantidadeMaxima = 10;
		Pugilista[] atletas = new Pugilista[atletasQuantidadeMaxima];
		
		while(true) {
			System.out.println("0: Sair");
			System.out.println("1: Cadastrar atleta");
			System.out.println("2: Listar atletas cadastrados");
			System.out.println("3: Marcar luta");
			
			if(resposta == 0)
				break;
			else if(resposta == cadastrarAtleta) {
				
			}
			else if(resposta == marcarLuta){
				
			}			
		}
	}
}
