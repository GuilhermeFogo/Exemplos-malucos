package Controle;

import java.util.Scanner;

public class Matricula {
	private static String campo_maricula; 
	private static Scanner in;
	private static char letra;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("digite o numero de matricula alterado?");
		 campo_maricula = in.next();
		 
		 char[] array = teste(); 
		 
		 if (array[0] == letra) {
				System.out.print(array[2]);
			}else if (array[1]==letra) {
				System.out.print(array[5]);
			}else if (array[2]== letra) {
				System.out.print(array[4]);
			}else if (array[3] == letra) {
				System.out.print(array[0]);
			}else if (array[4] == letra) {
				System.out.print(array[3]);
			}else if (array[5] == letra) {
				System.out.print(array[1]);
			}
			else {
				System.err.println("nada");
			}
		 
	}
	
	private static char[] teste() {
		char[] array = new char[10];
		 boolean controle = true;
		 while (controle) {
			 for (int i = 0; i <campo_maricula.length(); i++) {
					letra = campo_maricula.charAt(i);
					
					array[i] = letra;
				}
			 controle = false;
		}
		 controle = false;
		return array;
		
	}
}
