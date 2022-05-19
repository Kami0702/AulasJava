import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		
		AreaPoligonos soma = new AreaPoligonos();
		
		System.out.println("Some a área dos polígonos");{
		System.out.println("1 - Quadrado");
		System.out.println("Digite o valor da altura da forma");
		int x = scanner.nextInt();
		
		System.out.println("Digite o valor da base da forma ");
		int y = scanner.nextInt();
			
		
		 int soma = AreaPoligonos.somar(x, y);
			System.out.println("O resultado é: " + soma);
			
		 int retângulo = AreaPoligonos.somar(x, y);
			System.out.println("O resultado é: " + retângulo);
		}
		
		System.out.println("2 - Triângulo");
		System.out.println("Digite o valor da altura da forma");
		int x = scanner.nextInt();
		
		System.out.println("Digite o valor da base da forma ");
		int y = scanner.nextInt();
		
		double triângulo = AreaPoligonos.somar(x, y, 5);
		System.out.println("O resultado é: " + triângulo);
		
		
		
		
		
		
		System.out.println("3 - Retângulo");
		
		
		
	}

}
