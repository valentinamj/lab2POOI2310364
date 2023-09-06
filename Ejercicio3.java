package Practica1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		        
		System.out.print("Ingrese el salario anual actual del empleado: ");
		double salarioActual = sc.nextDouble();
		        
		System.out.print("Ingrese la calificación de desempeño (1=excelente, 2=bueno, 3=malo): ");
		int calificacion = sc.nextInt();
		
		double aumento = 0.0; 
		        
		if (calificacion == 1) {
			aumento = salarioActual * 0.06;
		} else if (calificacion == 2) {
		    aumento = salarioActual * 0.04;
		} else if (calificacion == 3) {
		    aumento = salarioActual * 0.015;
		} else {
			System.out.println("Calificación no válida. Debe ser 1, 2 o 3.");
			sc.close();
		    return;
		}
		double nuevoSalario = salarioActual + aumento;
		System.out.println("Aumento: $" + aumento);
		System.out.println("Nuevo salario: $" + nuevoSalario);
		sc.close();

	}

}
