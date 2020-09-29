package lutaBoxe;

public class Principal {
	public static void main(String[] args) {
		Pugilista tyson = new Pugilista("Mike 'Iron' Tyson", 30);
		Pugilista loma = new Pugilista("Loma 'Hi tech' Chenko", 30);
		
		Luta luta1 = new Luta(tyson, loma, 3);
		luta1.iniciarLuta();
	}
}
