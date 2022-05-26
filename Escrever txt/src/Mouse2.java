


public class Mouse2 {
	

	public boolean isFunciona() {
		return funciona;
	}
	public Mouse2(boolean funciona, int attdBotoes, String tamanho) {
		this.funciona = funciona;
		this.attdBotoes = attdBotoes;
		this.tamanho = tamanho;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getAttdBotoes() {
		return attdBotoes;
	}
	public void setAttdBotoes(int attdBotoes) {
		this.attdBotoes = attdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	private boolean funciona;
	private int attdBotoes;
	private String tamanho;
	
			

}
