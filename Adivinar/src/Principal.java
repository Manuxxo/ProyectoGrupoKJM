import java.util.Scanner;
/*EDITADO POR MANU*/
public class Principal {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Juego de adivinar la respuesta correcta");
		int puntaje=0;
		int valorP= 25;
		//Juego de preguntas Modf kevin
		String p1= "Vas en un avion, detras tienes un camion, y delante un caballo, ¿Donde estas?"; 
		String r1= "tiovivo";
		
		String p2= "Doce señoras, todas con medias y sin zapatos, ¿Que son?";
		String r2= "horas";
		
		String p3= "¿Donde hay rios pero no agua, ciudades pero no casas y bosques pero no arboles?";
		String r3= "mapa";
		
		String p4= "Silva sin labios, corre sin pies, en la espalda te pega y no lo ves, ¿Que es?";
		String r4= "viento";
		
		sc = new Scanner(System.in);
			
		System.out.println("Primera adivinanza");
		System.out.println(p1);
		String pR = sc.nextLine ();
		if(pR.equalsIgnoreCase(r1)) {
			puntaje = puntaje +1;
		}
		System.out.println("Segunda adivinanza");
		System.out.println(p2);
		String sR = sc.nextLine ();
		if(sR.equalsIgnoreCase(r2)) {
			puntaje = puntaje +1;
		}
		System.out.println("Tercera adivinanza");
		System.out.println(p3);
		String tR = sc.nextLine ();
		if(tR.equalsIgnoreCase(r3)) {
			puntaje = puntaje +1;
		}
		System.out.println("Cuarta adivinanza");
		System.out.println(p4);
		String cR = sc.nextLine ();
		if(cR.equalsIgnoreCase(r4)) {
			puntaje = puntaje +1;
		}
		
		System.out.println("Fin del juego");
		System.out.println(valorP*puntaje);
		
	}
}
