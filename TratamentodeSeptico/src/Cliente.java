import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	private Conta conta;
	
	
	
	public void cliente() {

}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	

	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}


	@Override
	public String toString() {
		return "**************************\n" + "Cliente: \nNome =" + nome + ", \nCPF= " + cpf + ", \nNúmerodaConta = " + numConta + " \n************************************************";
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nome, other.nome) && numConta == other.numConta;
	}

}
