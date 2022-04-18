import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Matematica matematica = new Matematica();
	
		System.out.println("Somar dois numeros");
		System.out.println("Digite o primeiro Número");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo Número");
		int y = scanner.nextInt();
		
		int soma = matematica.somar(x, y);
		System.out.println("O resultado é " + soma + "!!!"); //concadena é o que faza soma de dois tributos;
		
		 soma = matematica.somar(x, y, 5);
		System.out.println("O resultado é " + soma + "!!!"); //concadena é o que faza soma de dois tributos;
		
		 double soma2 = matematica.somar(x, y);
		System.out.println("O resultado é " + soma2 + "!!!"); //concadena é o que faza soma de dois tributos;
		
		
	}

}
