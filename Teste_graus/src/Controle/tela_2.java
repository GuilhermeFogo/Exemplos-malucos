package Controle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import Objeto.Contato;


// Java BEAN da visao

public class tela_2 extends principal {
	// atributos 
	private Scanner in;
	private String campo;
	private Contato contato;
	private List<Contato>list;
	
	// get e sets
	
	public String getCampo() {
		return campo;
	}
	public Contato getContato() {
		return contato;
	}
	public List<Contato> getList() {
		return list;
	}
	public Scanner getIn() {
		return in;
	}
	
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public void setIn(Scanner in) {
		this.in = in;
	}
	public void setList(List<Contato> list) {
		this.list = list;
	}
	
	// contrutor
	public tela_2() {
		setIn(new Scanner(System.in));
		setList(new ArrayList<>());
		setContato(new Contato());
		
	}
	
	// metodos que realizam coisas lindas
	public String menu() {
		System.out.println("Digite as opções abaixo:");
		System.out.println("+- Adiciona || - Exclir || V-- Visualizar || 0-- Sair");
		setCampo(in.next());
		return getCampo();
	}
	
	
	
	public String Campos(){
		in = new Scanner(System.in);
		System.out.println("Digite o nome do contato:");
		setCampo(in.next());
		return getCampo();
	}
	
	public void Adiciona(String add_conatto){
		
		getContato().setNome(add_conatto);
		
		getList().add(getContato());
	}
	
	public void Visualizar() {
		for (Contato contato : getList()) {
			System.out.println(contato.toString());
		}
	}
	
	public void Remover(String remove_conatto) {
		getList().remove(remove_conatto);
	} 
}
