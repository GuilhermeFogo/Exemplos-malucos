package Controle;

import java.util.Scanner;
import java.util.*;

public class Exercicios {
	
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		// regra de 3
		
//		Double regra = Regra_3(1, 5,90);
//		System.out.println(regra);
//		
//		if (regra>=3) {
//			System.out.println("OK");
//		}else if (regra<=0) {
//			System.out.println("zuado");
//		}else {
//			System.out.println("loko");
//		}
		
		String sexo = in.next();
		Double peso = in.nextDouble();
		
		if (sexo.equals("M")|| sexo.equals("m")) {
			if (peso>=50) {
				System.out.println("pode realizar");
			}else{
				System.err.println("não pode realizar");
			}
		}else{
			if (sexo.equals("F")|| sexo.equals("f")) {
				if (peso>=40) {
					System.out.println("pode realizar a coleta");
				}else{
					System.err.println("não pode realizar o exame");
				}
			}else{
				System.err.println("erro");
			}
		}
		
		
		
		
		
		
		
		
	}
	
	public static Double Regra_3(double pardrao, double equivalencia, double equivalencia_x) {
		Double multi = equivalencia * equivalencia_x;
		Double divi = multi/pardrao;
		return divi;
	}

}
