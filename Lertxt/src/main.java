public class main {


	public static void main(String[] args) throws FileNotFoundException, IDExpection {
	try (BufferedRead reader new BufferedRead(new FileReader("entrada.txt"))) {
		String line;
		String string = "";
		
		while((line = reader.readLine))!=null){
		string += line = "/n";
		}
		System.out.println(string);
		
	}
	String teste = "Mouse funciona = sim, attBotoes = 2,tamanho = pequeno "
			
			Mouse mouse = new Mouse(teste);
	
	System.out.println(mouse);
	
	
	}
	
	
	}

}