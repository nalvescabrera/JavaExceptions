import java.util.Iterator;

public class FluxoComTratamento {

	
	public static void main(String[] args) {
		System.out.println("Ini do Main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do Main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			//Conta c = null;
			//c.deposita();
		}
		System.out.println("Fim do metodo2");
	}
}
