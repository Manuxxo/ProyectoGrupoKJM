package juego3AdivinarNumeros;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 int a = (int) ((Math.random() * 100)+1); // ESTO CREA UN NUMERO ALEATORIO entre 1 y 100 
	 int b; // este va a ser el numero que vamos a meter nosotros 
	 int i; // Contador para bucle for.

	 System.out.println("Seras capaz de adivinar el numero mauajajajajaajaja :V");

	 System.out.print("Tienes 5 intentos, ni uno mas , ni uno menos :V escribe un n�mero entre 1 y 100: ");
	 b = sc.nextInt();

	 for (i=0; i<=4; i++) { 

	    // lo primero es ver si han acertado xD
	    
	    if (a == b) {  
	      System.out.println("�Has acertado!"); 
	      break; } 
	    
	    // Luego da la partida por perdida si ya has gastado 5 intentos.     
	    
	    else if (i == 4) { 
	      System.out.println("Lo siento: �has perdido!. El n�mero era el: " + a); 
	      break; } 
	    
	    // Si no es ninguno de los casos anteriores, comparamos n�meros.
	    
	    else if (a > b) 
	      System.out.println("El n�mero misterixo es MAYOR que " + b);
	    else if (a < b)
	      System.out.println("El n�mero misterixo es MENOR que " + b);

	    // Por �ltimo un bucle if que sirve para dar una pista y avisarte de la �ltima oportunidad.
	    
	    if (i <=1) { 
	     System.out.print("Otro intento , ar lio :V: "); 
	     b = sc.nextInt(); } 
	    else if (i ==2) { 
	    int x = (int) (a/10);
	    System.out.println("Una pista, aunque vas a perder igual :V, la primera cifra es " + x);
	    System.out.print("Int�ntalo de nuevo animo: ");
	    b = sc.nextInt(); } 
	   else if (i >= 3) {
	   System.out.print("Oh, oh... ya vienen con el ataud :V �LTIMO intento: ");
	   b = sc.nextInt(); }
	    }
	  }
	}

