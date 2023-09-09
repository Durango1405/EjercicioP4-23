package Actividad2;

import java.util.Scanner;
public class Ecuacion2do_grado {
public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		double discriminante;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese valor A:");
		a = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese valor B:");
		b = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese valor C:");
	    c = entrada2.nextInt();
	    
	    discriminante = (Math.pow(b, 2) - (4 * a * c));
	    
	    if(discriminante>0) {
	    	System.out.println("Solucion 1:"+((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
	    	System.out.println("Solucion 2:"+((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
	    }
	    else if(discriminante==0) {
	    	System.out.println("Solucion 1:"+((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a));
	    }
	    else {
	    	System.out.println("Sin soluciones posibles");
	    }
	    entrada.close();
		entrada1.close();
		entrada2.close();
}
}
