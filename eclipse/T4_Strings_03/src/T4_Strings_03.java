//Dame una palabra y te digo si se encuentra en tu frase al menos una vez
import java.util.*;
public class T4_Strings_03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena, frase;
		int posicion, repetir;
		
		System.out.println("Dame una frase elocuente que no supere los 80 caracteres: ");
		frase = teclado.nextLine();
		
		while(frase.length()>80)
		{
			System.out.println("Te he dicho que no supere los 80...NO QUE LOS DESBORDE. Prueba de nuevo :)");
			frase = teclado.nextLine();
		}
				
		System.out.println("¿Que palabra quieres buscar Maaaria de las Mercedes?");
		cadena = teclado.nextLine();
		
		if (frase.startsWith(cadena)==true)
		{
			System.out.println("Tu palabra " + cadena + " se encuentra al principio.");
		}
		else if(frase.endsWith(cadena)==true)
		{
			posicion=0;
			posicion = frase.length() - cadena.length() + 1;
			System.out.println("Tu palabra " + cadena + " esta en la posicion " + posicion + ".");
		}
		else
		{
			
			cadena = " " + cadena + " ";
			posicion=0;
			posicion=frase.indexOf(cadena);
			if(posicion==-1)
			{
				System.out.println("Tu cadena no esta en la frase");
			}
			while(posicion!=-1)
			{
				System.out.println("Tambien esta en la posicion " + (posicion+2));
				frase = frase.substring(0, posicion-1);
				posicion=frase.indexOf(cadena);
			}
			
		}
		
	}//main

}//class










