import java.util.*;
public class T4_Strings_05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String c1, c2, par, impar;
		
		System.out.println("Dame la cadena de menos de 80 caracteres");
		c1 = teclado.nextLine();
		impar = par = "";
		
		while (c1.length()>80)
		{
			System.out.println("Dame la cadena de menos de 80 caracteres ");
			c1 = teclado.nextLine();
		}
		
		for(int k=0; k<c1.length();k++)
		{
			
			if(k==0 || k%2==0) 
			{ //contamos que el usuario contara desde 1, de manera que volcamos pares en impares
				impar=impar+c1.charAt(k);
			}
			else
			{
				par = par + c1.charAt(k);
			}
		}//for de asignacion
		
		
		System.out.println("Cadena original: " + c1);
		System.out.println("Cadena de pares: " + par);
		System.out.println("Cadena de impares: " + impar);
		
	}//main

}//class
