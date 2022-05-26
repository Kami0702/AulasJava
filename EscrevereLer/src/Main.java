import java.util scanner

public class Main {

	public static void main(String[] args) throws IDExcepcition {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
	
		try(BufferedWriter escrever = new BuffereddWriter(new FileWriter("saida.txt"))){
		escrever.writer(string);	
		}
		
		try(BuffereReader reader = new BufferReade(new FileReader("saida.txt"))){
		String line;
		String string2 = "";
		}
		while(line = reader.readeLine())!= null){
		string2 += line + "/n";	
		}
		System.out.println("string2");
	}
	
}	
		