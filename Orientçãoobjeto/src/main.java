
public class main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Marcos";
		pessoa1.numFig = 1;
		
		pessoa1.receber(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFig);
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "Gabriela";
		pessoa2.numFig = 6;
		
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFig);
		
		boolean msg = pessoa1.dar(8, pessoa2);
		
		if(msg==true) {
			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numFig);
			
	
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numFig);
		}			
	}
}
