package lutaBoxe;

public class Principal {
	static final int ATLETAS_QUANTIDADE_MAXIMA = 10;
	
	Pugilista[] atletas;
	Arbitragem arbitros;
	
	Principal(){
		this.atletas = new Pugilista[ATLETAS_QUANTIDADE_MAXIMA];
		this.atletas[0] = new Pugilista("Mike", "Tyson", "Iron", 54, 100);
		this.atletas[1] = new Pugilista("Vasyl", "Loma", "Hi tech ", 32, 50);
		this.atletas[2] = new Pugilista("Floyd", "Mayweather", "Money", 32, 50);
		
		this.arbitros = new Arbitragem();
		iniciarLuta(atletas[0], atletas[1], arbitros, 12);
		iniciarLuta(atletas[1], atletas[2], arbitros, 12);
	}
	
	public void iniciarLuta(Pugilista atleta1, Pugilista atleta2, Arbitragem arbitros, int quantidadeRounds) {
		Luta luta = new Luta(atleta1, atleta2, arbitros, quantidadeRounds);
		
		try {
			luta.pesarAtletas();
			
			luta.iniciarRounds();
			luta.contarPontos();
			luta.atualizarCartel();

			System.out.printf("\nO resultado da Luta entre %s e %s:\n", atleta1.getNome(), atleta2.getNome());

			// resultado da luta
			if(luta.isEmpate())
				System.out.printf("Empate!\n");
			else {
				if(luta.isKnockout())
					System.out.printf("Vitória por nocaute de %s\n", luta.getVencedor().getNome());
				else
					System.out.printf("Vencedor: %s\n", luta.getVencedor().getNome());
			}
		}
		catch(Exception e) {
			System.out.printf("A luta entre %s e %s não pode acontecer, pois:\n", atleta1.getNome(), atleta2.getNome());
			System.out.println(e.getMessage());
			System.out.println("=====");
		}
		finally {
			// inicializar a luta
		
			System.out.printf("-- Cartel --\n");
			System.out.printf("vitorias de %s: %d\n", atleta1.getNome(), atleta1.getVitorias());
			System.out.printf("vitorias de %s: %d\n", atleta2.getNome(), atleta2.getVitorias());
			System.out.printf("=====");
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}
