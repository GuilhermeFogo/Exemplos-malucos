package Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import Objeto.Agua_por_hora;
import Objeto.Contato;
import Objeto.Graus;

public abstract class principal {
	private static boolean continua;
	
	public static void main(String[] args) {
		continua = true;
		
		tela_2 activity = new tela_2();
		
		
		System.out.println("Seja Bem vindo(a) a Lista de Contatos:");
		while (continua) {
		 String pega_menu = activity.menu();
		 
		 if (pega_menu.equals("+")) {
			 System.out.println("Adicionando:");
			 String campos = activity.Campos();
			 activity.Adiciona(campos);
			 System.out.println("");
		 }else 
			 
			 if (pega_menu.equals("-")) {
				 System.out.println("Remover");
				 String campos_r = activity.Campos();
				 activity.Remover(campos_r);
				 System.out.println("");
			 }else 
				 
				 if (pega_menu.equals("v")) {
					System.out.println("Visualizar");
					 activity.Visualizar();
					 System.out.println("");
					 
				}else
					if (pega_menu.equals("V")) {
						System.out.println("Visualizar");
						 activity.Visualizar();
						 System.out.println("");
					}else 
						if (pega_menu.equals("0")) {
							continua = false;
							System.out.println("Saindo..");
						}
			
		}// final
		
	}
	

}
