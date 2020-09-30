package lutaBoxe;

public class Pugilista extends Pessoa implements Cartel{
	private double peso;
	private int categoria;
	
	//caterogias
	static final int MOSCA = 1; 
	static final int MEDIO = 2; 
	static final int PESADOS = 3;
	
	static final double PESO_MOSCA = 50.00;
	static final double PESO_MEDIO = 73.00;
	static final double PESO_PESADOS = 100.00;
	
	
	//cartel do lutador
	private int vitorias = 0;
	private int derrotas = 0;
	private int empates = 0;
	private int knockouts = 0;
	
//	private double altura;
//	private double envergadura;
//	
//	private int pegada = 1;
//	private int velocidade = 1;
//	private int footwork = 1;
//	private int resistencia = 1;
//	private int agilidade= 1; 
//
//	Pugilista(String nome, int idade, int pegada, int velocidade, int footwork, int resistencia, int agilidade){
//		super(nome, idade, "pugilista");
//		this.pegada = pegada;
//		this.velocidade = velocidade;
//		this.footwork = footwork;
//		this.agilidade = agilidade;
//		this.resistencia = resistencia;
//	}
	
	Pugilista(String nome, int idade, double peso){
		super(nome, idade, "pugilista");
		this.peso = peso;
		
		if(peso <= PESO_MOSCA){
			this.categoria = MOSCA;
		}
		else if(peso <= PESO_MEDIO){
			this.categoria = MEDIO;
		}
		else{
			this.categoria = PESADOS;
		}
	}
	
	public void acrescentarVitoria() {
		this.vitorias++;
	}
	
	public void acrescentarKnockOuts() {
		this.knockouts++;
	}

	public void acrescentartDerrota() {
		this.derrotas++;
	}

	public void acrescentarEmpates() {
		this.empates++;
	}
	
	// get e set
	public double getPeso() {
		return peso;
	}

	public int getCategoria() {
		return categoria;
	}
	
	public int getVitorias() {
		return vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}

	public int getKnockouts() {
		return knockouts;
	}
}
