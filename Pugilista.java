package lutaBoxe;

public class Pugilista extends Pessoa implements Cartel{
	private String apelido;
	private double peso;
	private int categoria;
	
	//caterogias
	public static final int MOSCA = 1; 
	public static final int MEDIO = 2; 
	public static final int PESADOS = 3;
	
	public static final double PESO_MOSCA = 50.00;
	public static final double PESO_MEDIO = 73.00;
	public static final double PESO_PESADOS = 100.00;
	
	//cartel do lutador
	private int vitorias = 0;
	private int derrotas = 0;
	private int empates = 0;
	private int knockouts = 0;
	
	Pugilista(String apelido, String nome, String sobrenome, int idade, double peso){
		super(nome, idade, "pugilista");
		setNome(nome, sobrenome, apelido);
		
		this.peso = peso;
		this.apelido = apelido;
		
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
	
	public void setNome(String nome, String sobrenome, String apelido) {
		String nomeCompleto = nome + " '" + apelido + "' " + sobrenome;
		super.nome = nomeCompleto;
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
