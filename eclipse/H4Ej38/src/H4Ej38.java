import java.util.*;
public class H4Ej38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n=2, m=2, contafilas, contacol, cab;
		int matriz[][] = new int [m][n];
		String alum[] = {"Alejandro", "Patricia"};
		
		for (contafilas=0;contafilas<m; contafilas++)
		{
			for(contacol=0;contacol<n;contacol++)
			{
				matriz[contafilas][contacol] = (int) (Math.floor(Math.random()*10 + 1));
			}//generamos numeros aleatorios
		}
			
		for (cab = 0; cab<=n; cab++)
		{
			if(cab==0)
			{
				System.out.printf("Alumnos  ");
			}
			else
			{
				System.out.printf("%5d", cab);
			}
		}
		for (contafilas=0; contafilas<m; contafilas++)
		{
			System.out.printf("\nCurso %d: ", contafilas);
			for(contacol=0;contacol<n;contacol++)
			{
				System.out.printf("%5d",matriz[contafilas][contacol]);
			}
		}
	}//main

}//class
