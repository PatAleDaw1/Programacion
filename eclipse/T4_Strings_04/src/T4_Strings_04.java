import java.util.*;
public class T4_Strings_04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena, nueva;
		int n;
		//cadena = "HoLa";
		System.out.println("Dame una cadena de no mas de 80 caracteres: ");
		cadena = teclado.nextLine();
		
		while(cadena.length()>80)
		{
			System.out.println("Dame una cadena de no mas de 80 caracteres: ");
			cadena = teclado.nextLine();
		}
		
		System.out.print("Menu de opciones: \n \t 1. Mayusculas \n \t 2. Minusculas \n Opcion: ");
		n = teclado.nextInt();
		
		switch(n)
		{
		case 1: nueva=cadena.toUpperCase();
			System.out.println("Tu nueva cadena es: " + nueva);
			break;
		case 2: nueva=cadena.toLowerCase();
			System.out.println("tu nueva cadena es: " + nueva);
			break;
		default: System.out.println("ERROR 408: opcion no evaluable");	
		}

	}//main

}//class
