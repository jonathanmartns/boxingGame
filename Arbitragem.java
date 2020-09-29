package lutaBoxe;

public class Arbitragem extends Pessoa{
	/*
	private Pessoa arbitro;
	private Pessoa juiz;
	private Pessoa cronometrista;
	private Pessoa diretorTecnico; */
	
	static final int pontuacaoMaxima = 10;
	static final int pontuacaoMinima = 8;
	
	static final int contagemMaxima = 10;
	
	static final int knockdown = 5;
	static final int knockout = 8;
	
	static final int KNOCKDOWN = 1;
	static final int KNOCKOUT = 2;
	
	Arbitragem() {
	}
	
	/*
	Arbitragem(Pessoa arbitro, Pessoa juiz, Pessoa cronometrista, Pessoa diretorTecnico){
		this.arbitro = arbitro;
		this.juiz = juiz;
		this.cronometrista = cronometrista;
		this.diretorTecnico = diretorTecnico;
	} */
	
	public int pontuar() {
		return ((int) ((Math.random()*(pontuacaoMaxima - pontuacaoMinima)) + pontuacaoMinima));
	}
	
	public int contagem() {
		// inicia a contagem após o knockdown
		int azar;
		
		for(int i=0; i<contagemMaxima; i++) {
			azar = (int) ((Math.random()*contagemMaxima));

			if(azar < knockdown) {
				// return Codigos.KNOCKDOWN;
				break;
			}
			else if(i == (contagemMaxima-1) || azar > knockout) {
				// atleta knocauteado, nao resistiu a contagem
				return KNOCKOUT;
			} 
		}
		
		return KNOCKDOWN;
	}
}
