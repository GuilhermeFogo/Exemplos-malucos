package Objeto;

public class Agua_por_hora {
	private int minutos;
	private int litros;
	
	
	
	
	
	
	public String litros_por_min() {
		Integer num = getLitros() / getMinutos();
		return num.toString();
	}
	
	
	
	public int getLitros() {
		return litros;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

}
