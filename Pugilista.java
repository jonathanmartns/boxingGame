package lutaBoxe;

public class Pugilista extends Pessoa{
	private double altura;
	private double peso;
	private double envergadura;
	private String categoria;
	
	Pugilista(){
		super();
	}
	
	Pugilista(String nome, int idade){
		super(nome, idade, "pugilista");
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getEnvergadura() {
		return envergadura;
	}

	public void setEnvergadura(double envergadura) {
		this.envergadura = envergadura;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
