import java.util.*;
public class H3Ej37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz[][] = new int[4][5];
		int num, m, n;
		
				//BUCLE PARA GENERAR NUMEROS Y RELLENAR MATRIZ
		for(m=0;m<4;m++) //fijamos una fila
		{
			for(n=0;n<5;n++) //recorremos dicha fila, columna a columna
			{
				num = (int)(Math.floor(Math.random()*100+1)); /*generamos num entre 1-100 con
				origen en 1*/
				matriz[m][n] = num; 
			}
		}
		
				//BUCLE PARA IMPRIMIRLOS POR PANTALLA
		System.out.println("    MATRIZ ORIGINAL   ");
		for(m=0;m<4;m++) //fijamos una fila
		{
			for(n=0;n<5;n++) //recorremos dicha fila, columna a columna
			{
				System.out.printf("%5d", matriz[m][n]);
			}
			System.out.printf("\t | Fila %2d \n", (m+1));
		}
		
		System.out.printf("\n    MATRIZ TRANSVERSA  \n");
		for(m=0;m<5;m++) //fijamos una fila
		{
			for(n=0;n<4;n++) //recorremos dicha fila, columna a columna
			{
				System.out.printf("%5d", matriz[n][m]);
			}
			System.out.printf("\t | Fila %2d \n", (m+1));
		}

	}//main

}//class