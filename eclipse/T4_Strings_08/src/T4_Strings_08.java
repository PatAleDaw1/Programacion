import java.util.*;
public class T4_Strings_08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena, cesar;
		int n, caracter;
		
		System.out.println("Dame una cadena de nos mas de 20 caracteres");
		cadena = teclado.nextLine();
		System.out.println("Dame un numero del 1-10:");
		n = teclado.nextInt();
		
		while (cadena.length()>20)
		{
			System.out.println("Dame otra valida: ");
			cadena = teclado.nextLine();
			System.out.println("Dame un numero del 1-10:");
			n = teclado.nextInt();
		}
		
		cesar="";
		
		for (int k=0; k<cadena.length(); k++)
		{
			caracter = cadena.charAt(k);
			cesar=cesar+(char)(caracter+n); //casting explicito convirtiendolas
		}
		
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena transformada: " + cesar);
		
	}//main

}//class
