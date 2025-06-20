package com.aprendendocodigos;

public class FuncoesMatematicas {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a = 1.0;
		double b = 5.0;
		double c = 6.0;
		double A, B, C, Delta, x1, x2;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x +" = " + A);
		System.out.println("Raiz quadrada de " + y +" = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x,y);
		B = Math.pow(x , 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + "Elevado a " + y + " = " + A);
		System.out.println(x + "Elevado ao quadrado = " + B);
		System.out.println("5 Elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

		Delta = Math.pow(b,  2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(Delta)) / (2.0 * a); // Atribui a primeira raiz a x1
		x2 = (-b - Math.sqrt(Delta)) / (2.0 * a); // Atribui a segunda raiz a x2

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
	}

}
