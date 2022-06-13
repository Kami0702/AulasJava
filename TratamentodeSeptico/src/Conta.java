
public class Conta {

			
			private boolean saldo;
		private double limite;

			public boolean sacar(double valor) {

			public boolean isSaldo() {
				return saldo;
			
			}

			public Conta(boolean saldo, double limite) {
				super();
				this.saldo = saldo;
				this.limite = limite;
			}

			public void setSaldo(boolean saldo) {
				this.saldo = saldo;
			}

			public double getLimite() {
				return limite;
			}

			public void setLimite(double limite) {
				this.limite = limite;
			}
			
				
			}
			public double getSaldo() {
				return saldo;
			
			}
			
			public double getListe() {
			return limite();
			}
			
public void sacar(boolean valor) throws ContaExeception {			
		if(this.saldo < valor) {
		throws new ContaExeception("Saldo Insuficiente");
		}else if(this.saldo - valor) < liste * -1){
		throws new ContaExeception("Liste Insuficiente");
			
		}
		this.saldo -= valor;
			
		
		}
}