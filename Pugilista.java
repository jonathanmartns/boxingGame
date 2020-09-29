package lutaBoxe;

public class Pugilista extends Pessoa{
	private double altura;
	private double peso;
	private double envergadura;
	private String categoria;
	
	/*
	private int pegada = 1;
	private int velocidade = 1;
	private int footwork = 1;
	private int resistencia = 1;
	private int agilidade= 1; 
	*/
	
	//cartel do lutador
	private int vitorias = 0;
	private int derrotas = 0;
	private int empates = 0;
	private int knockouts = 0;
	
	Pugilista(){
		super();
	}
	
	/*
	Pugilista(String nome, int idade, int pegada, int velocidade, int footwork, int resistencia, int agilidade){
		super(nome, idade, "pugilista");
		this.pegada = pegada;
		this.velocidade = velocidade;
		this.footwork = footwork;
		this.agilidade = agilidade;
		this.resistencia = resistencia;
	} */
	
	Pugilista(String nome, int idade){
		super(nome, idade, "pugilista");
	}
	
	public void acrescentarVitoria() {
		this.vitorias++;
	}

	public void acrescentartDerrota() {
		this.derrotas++;
	}

	public void acrescentarEmpates() {
		this.empates++;
	}
	
	// get e set
	public double getAltura() {
		return altura;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getEnvergadura() {
		return envergadura;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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

	
}
