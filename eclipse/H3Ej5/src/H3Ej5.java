import java.util.Scanner;

public class H3Ej5 {

	public static void main(String[] args) {
		//contar cuantos numeros impares hay y que los imprima
		Scanner teclado = new Scanner(System.in);
		int conta=0, n, k;
		System.out.println("dime hasta que numero quieres que mire ");
		k = teclado.nextInt();
		System.out.println("Te voy a mostrar los numeros impares: ");
		for(n=1;n<=k;n++)
		{
			if(n%2!=0)
			{
				conta = conta + 1;
				System.out.println(n);
			}
		}
		System.out.println("La suma de todos ellos son: " + conta );

	}

}
