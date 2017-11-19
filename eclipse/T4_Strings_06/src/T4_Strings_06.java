import java.util.*;
public class T4_Strings_06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, voc, cons, otros;
		String frase;
		
		System.out.println("Dame una frsae de no mas de 80 caracteres: ");
		frase = teclado.nextLine();
		frase = frase.toUpperCase();
		
		while(frase.length()>80)
		{
			System.out.println("Dame una frsae de no mas de 80 caracteres: ");
			frase = teclado.nextLine();
			frase = frase.toUpperCase();
		}
		
		System.out.println(" contemos cuantas vocales, consonantes y numeros contiene: ");
		num = voc = cons = otros = 0;
		
		for (int k=0; k<frase.length(); k++)
		{
			if (frase.charAt(k) >= 'A' && frase.charAt(k) <= 'Z')
			{
				if(frase.charAt(k) == 'A' || frase.charAt(k) == 'E' || 
						frase.charAt(k) == 'I' || frase.charAt(k) == 'O' || frase.charAt(k) == 'U')
					{
						voc++;
					}
				else
				{
					cons++;
				}
			} //filtro alfabeto
			else if (frase.charAt(k) >= '0' && frase.charAt(k) <= '9')
			{
				num++;
			} //filtro numerico
			else
			{
				otros++;
			}
		} //for
		
		System.out.println("-- Resultados --");
		System.out.println("Consonantes: " + cons);
		System.out.println("Vocales: " + voc);
		System.out.println("Numeros: " + num);
		System.out.println("Otros: " + otros);
	}

}
