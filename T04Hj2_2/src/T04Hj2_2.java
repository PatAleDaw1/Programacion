/*Escribe un programa que pida  por teclado una cadena y una letra, de manera que elimine las 3 
 * primeras ocurrencias de la letra que encuentre en la cadena y lo muestre por pantalla.*/
import java.util.*;
public class T04Hj2_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena1, cadena2, letra, letra2, aux;;
		
		int k, conta;
				
		System.out.println("Dame una cadena:  ");
		cadena1 = teclado.nextLine();
		System.out.println("Dame una letra:  ");
		letra = teclado.nextLine();
		conta=0;
		
		
		for(k=0; k<cadena1.length(); k++){
			if(cadena1.charAt(k) == letra){
				conta= conta+1;
				if(conta<=3){
					aux= cadena1.charAt(k);
					cadena1 = cadena1- cadena1.charAt(k) + letra2;
				}
			}
		}
		System.out.println(cadena1);
		

	}//main

}//class
