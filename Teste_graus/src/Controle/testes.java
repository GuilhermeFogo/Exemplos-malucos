package Controle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;



public class testes {
	private static Scanner in;
	private  static Usuario usu;
	private static Caixa_musiaca mp3;
	
	public static void main(String[] args) {
		usu = new Usuario();
		in= new Scanner(System.in);
		boolean verdade = login();
		if (verdade) {
			System.out.println("seja bem vindo (a)");
			mp3 = new Caixa_musiaca();
			mp3.Tem_proprietario(usu.getNome());
			System.out.println(mp3);
		} else {
			System.out.println("algo deu errado...");
		}
		
	}
	
	
	public static boolean login() {
		System.out.println("digite seu nome:");
		String campo_usu = in.next();
		System.out.println("digite a senha");
		String senha = in.next();
		
		usu.setNome("gui");
		usu.setSenha("123");
		
		if (usu.getNome().equals(campo_usu)&& usu.getSenha().equals(senha)) {
			return true;
		}else {
			System.out.println("tente novamente");
			return false;
		}
		 
	}

}


class Usuario{
	private String senha;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String toString() {
		return getNome();
	}	
}

class Caixa_musiaca{
	private Integer volume;
	private Usuario proprietario;
	
	public void Tem_proprietario(String posuidor) {
		this.proprietario = new Usuario();
		proprietario.setNome(posuidor);
		//System.out.println(posuidor);
	}
	
	@Override
	public String toString() {
		Usuario usu = new Usuario();
		usu.setNome("gui");
		return usu.getNome();
	}

}
