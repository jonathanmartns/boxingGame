package lutaBoxe;

public class Arbitragem extends Pessoa{
	private Pessoa arbitro;
	private Pessoa juiz;
	private Pessoa cronometrista;
	private Pessoa diretorTecnico;
	
	static int pontuacaoMaxima = 10;
	static int pontuacaoMinima = 8;
	
	Arbitragem() {
	}
	
	Arbitragem(Pessoa arbitro, Pessoa juiz, Pessoa cronometrista, Pessoa diretorTecnico){
		this.arbitro = arbitro;
		this.juiz = juiz;
		this.cronometrista = cronometrista;
		this.diretorTecnico = diretorTecnico;
	}
	
	public int pontuar() {
		return ((int) ((Math.random()*(pontuacaoMaxima - pontuacaoMinima)) + pontuacaoMinima));
	}	
}
