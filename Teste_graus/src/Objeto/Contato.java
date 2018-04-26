package Objeto;

public class Contato {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome();
	}

}
