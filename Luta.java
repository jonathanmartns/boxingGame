package lutaBoxe;

import java.util.Date;

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
		
		this.vencedor = (totalPontosOponente1 > totalPontosOponente2)?(this.oponente1):(this.vencedor = oponente2);
	
		if(totalPontosOponente1 == totalPontosOponente2) {
			// empate
			this.vencedor = null;
			this.empate = true;
		}
		
		return this.vencedor;
	}

	public void iniciarLuta() {
		for(int i=0; i<quantidadeRounds; i++) {
			oponente1pontos[i] = this.arbitros.pontuar();
			oponente2pontos[i] = this.arbitros.pontuar();
		}
	}
	
	public void atualizarCartel() {
		if(this.getVencedor() == oponente1) {
			//vitoria oponente 1
			this.vencedor = this.oponente1;
			this.oponente1.acrescentarVitoria();
			this.oponente2.acrescentartDerrota();
		}
		else if(this.getVencedor() == oponente2) {
			//vitoria oponente 2
			this.vencedor = oponente2;
			this.oponente2.acrescentarVitoria();
			this.oponente1.acrescentartDerrota();
		}
		else {
			// empate
			this.vencedor = null;
			this.empate = true;
			this.oponente1.acrescentarEmpates();
			this.oponente2.acrescentarEmpates();
		}
	}
	
	public boolean isEmpate() {
		return empate;
	}

}
