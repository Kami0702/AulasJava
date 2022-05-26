
public class Mouse {
	
	@Override
	public String toString() {
		return "Mouse [funciona=" + funciona + ", attdBotoes=" + attdBotoes + ", tamanho=" + tamanho + "]";
	}
	public Mouse(String texto) {
	String[] arrayAuxiliar1 = texto.split("=");
	String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
	this.funciona = arrayAuxiliar2[1].trim();
	
	String[] arrayAuxiliar arrayAuxiliar1[1].split("=");
	this.attBotoe = arrayAuxiliar1[1].trim();
	
	}
	

}