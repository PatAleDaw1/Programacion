import java.util.Scanner;
public class H3Ej1 {
//mostrar desde 1 al 100 o del 100 al 1
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, i, suma;
		System.out.println(" - Opciones de mostrado: -");
		System.out.println("1. 1 al 100");
		System.out.println("2. 100 al 1");
		System.out.println("3. Mostrar la suma");
		System.out.println("4. Mostrar numeros pares");
		i = teclado.nextInt();
		switch(i)
		{
		case 1: //1 >> 100
			n=0;
			while(n<=100)
				
			{
				System.out.println("Numero: "+n);
				n++;
			}
			break;
		case 2: //100 >> 1
			n=100;
			while(n>=1)
				
			{
				System.out.println("Numero: "+n);
				n--;
			}
			break;
		case 3: //caso suma
			n=100;
			suma=0;
			while(n>=1)
				
			{
				suma+=n;
								n--;
			}
			System.out.println("Numero: "+suma);
			break;
		case 4: //caso par
			n=1;
			while(n<=100)	
			{
				if(n%2==0)
				{
					System.out.println("Numero par: "+n);
				}
				n++;
			}
			break;	
		}
		
	}//main

}//class
