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
	buffer é usado para armazenar uma pequena quantidade de dados
		filereader é resonsavel pela leitura do arqivo BufferedReader não está vinculado apenas à leitura de arquivos. Ele pode ser usado para ler dados de qualquer fluxo de caracteres. A classe FileReader fornece dois construtores: 
	FileReader (arquivo File): pega um objeto File que representa um arquivo em seu disco e cria uma nova instância de FileReader.
FileReader (FileDescriptor fd): Cria um novo FileReader, dado o FileDescriptor para leitura.
FileReader (String fileName): toma o nome do arquivo como o único parâmetro e cria uma nova instância de FileReader para ler o arquivo.
A classe BufferedReader fornece dois construtores: 

BufferedReader (Reader rd): Ele usa um Reader para ler dados do fluxo de entrada de caracteres e cria um buffer de entrada de tamanho padrão.
BufferedReader (Reader rd, int size): leva dois parâmetros:
Primeiro: um leitor que é usado para ler os dados do fluxo de entrada
Segundo: O tamanho do buffer de entrada. Ele cria um novo BufferedReader com o buffer de entrada de tamanho determinado.
Como visto, BufferedReader aceita qualquer tipo de Leitor ( StringReader , FileReader, etc.) e, portanto, capaz de ler de qualquer fluxo de entrada de caractere. Enquanto o FileReader é capaz de ler caracteres apenas de arquivos. Normalmente, envolvemos um FileReader com BufferedReader para ler caracteres de arquivos. 
	
	Na maioria dos casos, você gostaria de ler uma linha por vez em vez de ler um caractere por vez, e apenas o BufferedReader fornece um método readLine() que lê uma linha inteira por vez. Simplesmente, o Leitor fornecido (FileReader neste caso) lê os caracteres e os armazena no buffer. Quando o método java.io.BufferedReader # readLine() é chamado, os caracteres de uma linha armazenada no buffer são retornados como String. Ele economiza muito tempo e, portanto, é mais rápido do que o método FileReader # read(). Observe que, BufferedReader é capaz de ler uma linha inteira por vez apenas porque usa uma memória de buffer, pode armazenar os caracteres de uma linha no buffer e ler todos os caracteres juntos diretamente do buffer.

Conclusão: Diferenças entre BufferedReader e FileReader 

   BASE 	                           BUFFEREDREADER 	                                            FILEREADER 
Usar	É usado para ler caracteres de qualquer tipo de fluxo de entrada de caracteres (String, Arquivos , etc.)	Pode ser usado apenas para ler arquivos
Amortecedor	Usa o Buffer internamente para ler caracteres de	Não usa Buffer. Lê diretamente o arquivo acessando o disco rígido.
Velocidade	Mais rápido	Mais devagar
Eficiência	Muito mais eficiente para ler arquivos	Menos eficiente 
Linhas de leitura	BufferedReader pode ser usado para ler um único caractere por vez, bem como uma linha por vez.	Ele pode ler apenas um caractere por vez, não pode ler linhas
	
	}

}
