package lutaBoxe;

public class Arbitragem extends Pessoa{
	static int pontuacaoMaxima = 10;
	static int pontuacaoMinima = 8;
	
	public int pontuar() {
		return ((int) ((Math.random()*(pontuacaoMaxima - pontuacaoMinima)) + pontuacaoMinima));
	}
	
}
