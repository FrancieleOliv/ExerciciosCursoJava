package com.aprendendocodigos;
import java.util.Locale;

public class PrintPrintlnPrintf {

	public static void main(String[] args) {
		
		int y = 33;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.print("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		System.out.printf("%s tem %d anos%ne ganha R$ %.2f reais%n", nome, idade, renda);


	}

}
