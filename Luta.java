package lutaBoxe;

import java.util.Random;

public class Luta {
	private Pugilista oponente1;
	private Pugilista oponente2;
	private Arbitragem arbitros;
	private int quantidadeRounds;
	
	//pontuação por round
	private int oponente1pontos[]; 
	private int oponente2pontos[];
	
	// resultado
	private boolean empate;
	private Pugilista vencedor;
	
	Luta(Pugilista oponente1, Pugilista oponente2, Arbitragem arbitros, int quantidadeRounds){
		this.oponente1 = oponente1;
		this.oponente2 = oponente2;
		this.quantidadeRounds = quantidadeRounds;
		this.arbitros = arbitros;
		
		oponente1pontos = new int[quantidadeRounds];
		oponente2pontos = new int[quantidadeRounds];
	}

	public Pugilista getVencedor() {
		int totalPontosOponente1 = 0;
		int totalPontosOponente2 = 0;

		for(int i=0; i<quantidadeRounds; i++) {
			totalPontosOponente1 += oponente1pontos[i];
			totalPontosOponente2 += oponente2pontos[i];
		}
		
		if(totalPontosOponente1 > totalPontosOponente2) {
			this.vencedor = oponente1;
		}
		else if(totalPontosOponente1 < totalPontosOponente2) {
			this.vencedor = oponente2;
		}
		else {
			// empate
			this.vencedor = null;
			this.empate = true;
		}
		
		return this.vencedor;
	}

	public void iniciarLuta() {
		for(int i=0; i<quantidadeRounds; i++) {
			if((int)Math.random() * 1) {
				
			}else {
				
			}
		}
		
		System.out.printf("Atk: %f\n", oponente1.atacar());	
		System.out.printf("Def: %f\n", oponente2.defender());
	}

}
