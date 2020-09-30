package lutaBoxe;

public class Principal {
	static final int SAIR = 0;
	static final int LISTAR_ATLETAS = 1;
	static final int CADASTRAR_ATLETA = 2;	
	static final int INICIAR_LUTA = 3; 
	static final int ATLETAS_QUANTIDADE_MAXIMA = 10;
	
	Pugilista[] atletas;
	Arbitragem arbitros;
	
	Principal(){
		atletas = new Pugilista[ATLETAS_QUANTIDADE_MAXIMA];
		atletas[0] = new Pugilista("Mike 'Iron' Tyson", 54, 100);
		atletas[1] = new Pugilista("Loma 'Hi tech' Chenko", 32, 50);
		atletas[2] = new Pugilista("Floyd 'Money' Mayweather", 32, 50);
		
		arbitros = new Arbitragem();
		iniciarLuta(atletas[0], atletas[1], arbitros, 12);
		iniciarLuta(atletas[2], atletas[2], arbitros, 12);
		
		/*
		int resposta = 0;
		
		
		static final int ATLETAS_QUANTIDADE_MAXIMA = 10;
		
		
		while(true) {
			System.out.println("0: Sair");
			System.out.println("1: Cadastrar atleta");
			System.out.println("2: Listar atletas cadastrados");
			System.out.println("3: Marcar luta");
			System.out.println("4: iniciar luta")
			
			if(resposta == 0)
				break;
			else if(resposta == cadastrarAtleta) {
				
			}
			else if(resposta == marcarLuta){
				// marcarLuta();
			}			
		}
		*/
	}
	
	public void iniciarLuta(Pugilista atleta1, Pugilista atleta2, Arbitragem arbitros, int quantidadeRounds) {
		try {
			if(atleta1.getCategoria() != atleta2.getCategoria())
				throw new Exception("Os atletas não estão na mesma categoria de peso!");
			
			// inicializar a luta
			Luta luta = new Luta(atleta1, atleta2, arbitros, quantidadeRounds);
			luta.iniciarLuta();
			luta.contarPontos();
			luta.atualizarCartel();
			
			System.out.printf("O resultado da Luta entre %s e %s:\n", atleta1.getNome(), atleta2.getNome());
			
			// resultado da luta
			if(luta.isEmpate())
				System.out.printf("Empate!\n");
			else {
				if(luta.isKnockout())
					System.out.printf("Vitória por nocaute de %s\n", luta.getVencedor().getNome());
				else
					System.out.printf("Vencedor: %s\n", luta.getVencedor().getNome());
			}

			System.out.printf("-- Cartel --\n");
			System.out.printf("vitorias de %s: %d\n", atleta1.getNome(), atleta1.getVitorias());
			System.out.printf("vitorias de %s: %d\n", atleta2.getNome(), atleta2.getVitorias());
			System.out.printf("=====");
		}
		catch(Exception e) {
			System.out.printf("A luta entre %s e %s não pode acontecer, pois:\n", atleta1.getNome(), atleta2.getNome());
			System.out.println(e.getMessage());
			System.out.println("=====");
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
