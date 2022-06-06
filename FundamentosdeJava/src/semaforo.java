
public class semaforo {

	public static void main(String[] args) {
		
		String semaforo = "Verde";
		
		switch(semaforo) {
		case "Verde":
			System.out.println("Siga!");
			break;
		case "Amarelo":
			System.out.println("Atenção");
			break;
		case "Vermelho":
			System.out.println("PARE!");
			break;
		default:
			System.out.println("Valor inválido");
		}
	} switch é responsavel por fazer teste de decisão de simples funções e responsavel por executar as atividades apos a primeira

}
