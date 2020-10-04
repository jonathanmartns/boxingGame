package lutaBoxe;

public class Arbitragem extends Pessoa{
	public static final int PONTUACAO_MAXIMA = 10;
	public static final int PONTUACAO_MINIMA = 8;
	
	public static final int CONTAGEM_MAXIMA = 10;
	
	public static final int KNOCKDOWN = 5;
	public static final int KNOCKOUT = 8;
	
	public static final int KNOCKDOWN_CODIGO = 1;
	public static final int KNOCKOUT_CODIGO = 2;
	
	Arbitragem() {
	}
	
	public int pontuar() {
		return ((int) ((Math.random()*(PONTUACAO_MAXIMA - PONTUACAO_MINIMA)) + PONTUACAO_MINIMA));
	}
	
	public int contagem() {
		// inicia a contagem após o knockdown
		int azar;
		
		for(int i=0; i<CONTAGEM_MAXIMA; i++) {
			azar = (int) ((Math.random()*CONTAGEM_MAXIMA));

			if(azar < KNOCKDOWN) {
				// return Codigos.KNOCKDOWN;
				break;
			}
			else if(i == (CONTAGEM_MAXIMA-1) || azar > KNOCKOUT) {
				// atleta knocauteado, nao resistiu a contagem
				return KNOCKOUT_CODIGO;
			} 
		}
		
		return KNOCKDOWN_CODIGO;
	}
}
