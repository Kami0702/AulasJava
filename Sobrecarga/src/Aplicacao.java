import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Matematica matematica = new Matematica();
	
		System.out.println("Somar dois numeros");
		System.out.println("Digite o primeiro N�mero");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo N�mero");
		int y = scanner.nextInt();
		
		int soma = matematica.somar(x, y);
		System.out.println("O resultado � " + soma + "!!!"); //concadena � o que faza soma de dois tributos;
		
		 soma = matematica.somar(x, y, 5);
		System.out.println("O resultado � " + soma + "!!!"); //concadena � o que faza soma de dois tributos;
		
		 double soma2 = matematica.somar(x, y);
		System.out.println("O resultado � " + soma2 + "!!!"); //concadena � o que faza soma de dois tributos;
		
		
	}

}
