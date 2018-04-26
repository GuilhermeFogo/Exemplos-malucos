package Objeto;

public class Graus {
	private String graus_cel;
	private String graus_kel;
	private String graus_far;
	
	public void setGraus_cel(String graus_cel) {
		this.graus_cel = graus_cel;
	}
	public void setGraus_far(String graus_far) {
		this.graus_far = graus_far;
	}
	public void setGraus_kel(String graus_kel) {
		this.graus_kel = graus_kel;
	}
	public String getGraus_cel() {
		return graus_cel;
	}
	public String getGraus_far() {
		return graus_far;
	}
	public String getGraus_kel() {
		return graus_kel;
	}
	
	// contrutor
	public Graus(String celcius, String fareheit, String kelvin) {
		setGraus_cel(celcius);
		setGraus_far(fareheit);
		setGraus_kel(kelvin);
	}
	
	public String Transf_C_em_F(String grau_c)throws NumberFormatException {
		Double primeira_conta =Double.parseDouble(grau_c)*1.8;
		String conta = String.valueOf((primeira_conta)+32);
		
		return conta.toString()+" ºF";
	}
	
	public String Transf_F_em_C(String grau_f) throws NumberFormatException {
		Double parenteses = Double.parseDouble(grau_f) - 32;
		String conta = String.valueOf((parenteses)/1.8);
		
		return conta.toString()+" ºC";
	}
	
	public String Transf_K_em_C(String grau_k )throws NumberFormatException {
		Double contar =Double.parseDouble(grau_k)-273;
		
		return contar.toString()+" ºC";
	}
	
	public String Transf_K_em_F(String grau_k )throws NumberFormatException {
		Double contar =Double.parseDouble(grau_k)-459;
		
		return contar.toString()+" ºF";
	}

}
