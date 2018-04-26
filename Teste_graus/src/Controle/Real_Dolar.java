package Controle;

import java.util.Scanner;

public class Real_Dolar {
	private static Scanner in;
	private static String campo_dolar;
	private static final Double valor_dolar = 0.30657;
	private static String campo_real;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		
		System.out.println("Digite quantos reais voce tem?");
		campo_real = in.next();
		
		//Double dolar = Double.valueOf(campo_dolar);
		Double real = Double.valueOf(campo_real);
		
		Double inter = valor_dolar * real;
		Double result = inter/ 1;
		Integer taxa = (int) (result/ 0.02);
		System.err.println("Voce terá: $"+taxa);

	}

}
