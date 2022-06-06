import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	
	public cliente() {

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

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
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
modificador de acesso usando privae para tornar todas informações do cliente privadas podendo so ser acssa atraves dos metodos
}
