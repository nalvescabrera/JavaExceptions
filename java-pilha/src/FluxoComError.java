import java.util.Iterator;

public class FluxoComError {

	
	public static void main(String[] args) {
		System.out.println("Ini do Main");
		try {
			metodo1();
		} catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
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
		System.out.println("Ini do metodo 2");
		metodo2();
		System.out.println("Fim do metodo 2");
	}
}
