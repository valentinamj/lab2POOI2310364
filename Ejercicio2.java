package Practica1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		        
		System.out.print("Ingrese un número: ");
		        int n = sc.nextInt();
		        if (n % 2 == 1) {
		            System.out.println("Luna");
		        } else {
		            if (n >= 2 && n <= 5) {
		                System.out.println("Sol");
		            } else if (n >= 6 && n <= 20) {
		                System.out.println("Tierra");
		            } else {
		                System.out.println("Galaxia");
		            }
		        }
		        
		        sc.close();

	}

}
