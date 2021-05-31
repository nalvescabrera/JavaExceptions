import java.util.Iterator;

public class Fluxo {

	/* MinhaExcecao --> checked, no qual você pode colocar no metodo throw ou cria um try/catch */
	
	public static void main(String[] args) {
		System.out.println("Ini do Main");
		try {
			metodo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do Main");
	}
	
	public static void metodo1() throws MinhaExcecao {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() throws MinhaExcecao {
		System.out.println("Inicio do metodo2");
		
		new MinhaExcecao("Deu muito errado");
		//System.out.println("Fim do metodo2");
	}
}
