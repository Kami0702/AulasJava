
public class main {

	public static void main(String[] args) {

Conta conta1 = new Conta();
Conta conta2 = new Conta();

Cliente cliente1 = new Cliente();
Cliente cliente2 = new Cliente();

if(cliente1.getConta().sacar(100)==true) {
System.out.println("Saque realizado com sucesso");
}else {
	System.out.println("A transferencia nao foi reaizada");
}
	System.out.println("Seu saldo atual é de " + cliente1.getConta().getSaldo();
			
			switch(cliente1.getConta().sacarMN(100)) {
		    case 100;
			 System.out.println("Saque realizado com sucesso");
		  break;
	     case 101;
		System.out.println("Saque realizado com sucesso");
		case 102;
		break;
		case 103;
		System.out.println("Saque realizado com sucesso");
		break;
		}
		
try {
cliente1.getConta();
}catch(ContaExeception e) {
	e.printStackTrace();
	
	System.out.println("Não, foi possivel tralizar a transferencia ");
}
	}
