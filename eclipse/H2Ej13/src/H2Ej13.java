import java.util.Scanner;
public class H2Ej13 {

	public static void main(String[] args) {
		int n, factorial, i, k;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		n = teclado.nextInt();
		factorial=1;
		
		for (k=1;k<=n;k++)
		{
			factorial = factorial*k;
		}
		System.out.printf("%d es el factorial de %d" , factorial, n);
		
	}//main

}//class
