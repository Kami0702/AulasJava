
public class semaforo {

	public static void main(String[] args) {
		
		String semaforo = "Verde";
		
		switch(semaforo) {
		case "Verde":
			System.out.println("Siga!");
			break;
		case "Amarelo":
			System.out.println("Aten��o");
			break;
		case "Vermelho":
			System.out.println("PARE!");
			break;
		default:
			System.out.println("Valor inv�lido");
		}
	}

}
