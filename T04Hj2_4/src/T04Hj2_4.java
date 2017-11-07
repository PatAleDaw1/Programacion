/*Ejercicio 4;: Escribe un  programa  que  pida  por  teclado  dos  nombres  con  su  apellido  cada  uno  del 
siguiente modo:
Introduce un nombre y un apellido:
	Manuel García
Introduce otro nombre y apellido:
	Jimena Pérez
Después debe intercambiar los apellidos a los nombres y mostrarlos:
	Jimena García
	Manuel Pérez*/
import java.util.*;
public class T04Hj2_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2, nom1, nom2, ape1, ape2;
		int pos1, pos2;
		
		System.out.println("Dame un nombre con un apellido: ");
		cadena1 = teclado.nextLine();
		System.out.println("Dame un nombre con un apellido: ");
		cadena2 = teclado.nextLine();
		
		pos1=cadena1.indexOf(' ');
		nom1=cadena1.substring(0, pos1); //no cogera el espacio en blanco
		pos2=cadena2.indexOf(' ');
		nom2=cadena2.substring(0, pos2); //no cogera el espacio en blanco
		ape1=cadena1.substring(pos1);
		ape2=cadena2.substring(pos2);
		System.out.println("El primer nombre con apellido es ahora " + nom1 + ape2);
		System.out.println("El segundo nombre con apellido es ahora " + nom2 + ape1);
	
	}//main

}//class
