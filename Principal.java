package lutaBoxe;

public class Principal {
	public static void main(String[] args) {
		Pugilista tyson = new Pugilista("Mike 'Iron' Tyson", 30);
		Pugilista loma = new Pugilista("Loma 'Hi tech' Chenko", 30);
		
		Arbitragem arbitros = new Arbitragem();
		
		Luta luta1 = new Luta(tyson, loma, arbitros, 3);
		luta1.iniciarLuta();
		luta1.atualizarCartel();
		
		if(!luta1.isEmpate())
			System.out.printf("Vencedor: %s\n", luta1.getVencedor().getNome());
		else
			System.out.printf("Empate!\n");
		
		System.out.printf("-- Cartel --\n");
		System.out.printf("Cartel lutador 1 vitorias: %d\n", tyson.getVitorias());
		System.out.printf("Cartel lutador 2 vitorias: %d\n", loma.getVitorias());
	}
}
