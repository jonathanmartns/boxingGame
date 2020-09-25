package lutaBoxe;

public class Luta {
	private Pugilista oponente1;
	private Pugilista oponente2;
	private Arbitragem arbitros;
	private Pugilista vencedor;
	private int quantidadeRounds;
	
	Luta(Pugilista oponente1, Pugilista oponente2, int quantidadeRounds){
		this.oponente1 = oponente1;
		this.oponente2 = oponente2;
		this.quantidadeRounds = quantidadeRounds;
		//this.arbitros = arbitros;
	}

	public Pugilista getVencedor() {
		return vencedor;
	}

	public void iniciarLuta() {
		/* for(int i=0; i<quantidadeRounds; i++) {
			
		}*/
		
		System.out.printf("Atk: %f\n", oponente1.atacar());	
		System.out.printf("Def: %f\n", oponente2.defender());
	}

}
