package lutaBoxe;

public class Luta {
	private Pugilista oponente1;
	private Pugilista oponente2;
	private Arbitragem arbitros;
	private int quantidadeRounds;
	
	//pontuação por round
	private int oponente1pontos[]; 
	private int oponente2pontos[];
	
	// resultado
	private boolean knockout; // acaba a luta
	private int roundFinal; // round em que a luta acabou
	private boolean empate;
	private Pugilista vencedor;
	
	Luta(Pugilista oponente1, Pugilista oponente2, Arbitragem arbitros, int quantidadeRounds){
		this.oponente1 = oponente1;
		this.oponente2 = oponente2;
		this.arbitros = arbitros;
		
		this.quantidadeRounds = quantidadeRounds;
		this.roundFinal = quantidadeRounds;
	
		oponente1pontos = new int[quantidadeRounds];
		oponente2pontos = new int[quantidadeRounds];
	}

	public Pugilista contarPontos() {
		int totalPontosOponente1 = 0;
		int totalPontosOponente2 = 0;
		
		for(int i=0; i<roundFinal; i++) {
			totalPontosOponente1 += oponente1pontos[i];
			totalPontosOponente2 += oponente2pontos[i];
		}
		
	    if(totalPontosOponente1 == totalPontosOponente2) {
	    	// empate
	    	this.vencedor = null;
	    	this.empate = true;
	    }
	    else{
	    	// um ganhador
	    	this.vencedor = (totalPontosOponente1 > totalPontosOponente2)?(this.oponente1):(this.oponente2);
	    }
		
		return this.vencedor;
	}
	
	private int knockdown() {
		// Contagem para determinar se foi apenas knockdown ou um knockout
		int contagemResultado = this.arbitros.contagem(); 
		this.knockout = (contagemResultado == Arbitragem.KNOCKOUT_CODIGO)?(true):(false);
		return contagemResultado; 
	}

	public void iniciarLuta() {
		int sorte;
		
		for(int i=0; i<quantidadeRounds; i++) {
			oponente1pontos[i] = this.arbitros.pontuar();
			oponente2pontos[i] = this.arbitros.pontuar();
			
			// abre contagem para cada knockdown
			// se o atleta nao resiste a contagem, fim de luta
			if(this.knockdown() == Arbitragem.KNOCKOUT_CODIGO) {
				sorte = (int)(Math.random()*10);
				this.roundFinal = i;
				this.vencedor = sorte > 5 ? this.oponente1 : this.oponente2;
				break;
			}	
		}
	}
	
	public void atualizarCartel() {
		if(this.getVencedor() == oponente1) {
			//vitoria oponente 1
			this.vencedor = this.oponente1;
			this.oponente1.acrescentarVitoria();
			this.oponente2.acrescentartDerrota();
			
			if(this.isKnockout())
				this.oponente1.acrescentarKnockOuts();
		}
		else if(this.getVencedor() == oponente2) {
			//vitoria oponente 2
			this.vencedor = oponente2;
			this.oponente2.acrescentarVitoria();
			this.oponente1.acrescentartDerrota();
			
			if(this.isKnockout())
				this.oponente2.acrescentarKnockOuts();
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
	
	public boolean isKnockout() {
		return knockout;
	}
	
	public Pugilista getVencedor() {
		return vencedor;
	}

	public int[] getOponente1pontos() {
		return oponente1pontos;
	}

	public int[] getOponente2pontos() {
		return oponente2pontos;
	}
	
}
