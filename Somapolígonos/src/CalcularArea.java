import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		
		
		AreaPoligonos soma = new AreaPoligonos();
		
		System.out.println("Some a �rea dos pol�gonos");{
		System.out.println("1 - Quadrado");
		System.out.println("Digite o valor da altura da forma");
		int x = scanner.nextInt();
		
		System.out.println("Digite o valor da base da forma ");
		int y = scanner.nextInt();
			
		
		 int soma = AreaPoligonos.somar(x, y);
			System.out.println("O resultado �: " + soma);
			
		 int ret�ngulo = AreaPoligonos.somar(x, y);
			System.out.println("O resultado �: " + ret�ngulo);
		}
		
		System.out.println("2 - Tri�ngulo");
		System.out.println("Digite o valor da altura da forma");
		int x = scanner.nextInt();
		
		System.out.println("Digite o valor da base da forma ");
		int y = scanner.nextInt();
		
		double tri�ngulo = AreaPoligonos.somar(x, y, 5);
		System.out.println("O resultado �: " + tri�ngulo);
		
		
		
		
		
		
		System.out.println("3 - Ret�ngulo");
		
		
		
	}

}
