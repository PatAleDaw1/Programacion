import java.util.Scanner;
public class H2Ej16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int b, h, area, n=0;
		while(n==0)
		{
			System.out.println("Elige una de estas tres opciones:");
			System.out.println("1.Triangulo");
			System.out.println("2.Cuadrado");
			System.out.println("3.Rectangulo");
			
			n = teclado.nextInt();
			
			switch(n)
			{
			case 1:	System.out.println("Opcion triangulo. Dame la base: ");
			b = teclado.nextInt();
			System.out.println(" y ahora la altura:");
			h = teclado.nextInt();
			area = b*h/2;
			System.out.println("El area de tu triangulo es: " + area + " metros cuadrados.");
			break;
			
			case 2: 
				System.out.println("Dame la base de tu cuadrado y te calculo el area");
				b = teclado.nextInt();
				area = b*b;
				System.out.println("El area de tu cuadrado es: " + area + " metros cuadrados.");
				break;
			case 3: 
				System.out.println("Dame la base de tu rectangulo");
				b = teclado.nextInt();
				System.out.println(" y ahora la altura:");
				h = teclado.nextInt();
				area = b*h;
				System.out.println("El area de tu rectangulo es: " + area + " metros cuadrados.");
				break;	
			}
			
			System.out.println("Menu de opciones:");
			System.out.println("0.Repetir programa");
			System.out.println("1.Acabar programa.");
			n = teclado.nextInt();
		}
		System.out.println("- FIN DEL PROGRAMA -");
		
		
	}//main

}//class
