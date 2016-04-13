package ejercicio47;

import java.util.Scanner;

public class EntrelazarCadenas
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String cadena1;
		String cadena2;
		System.out.print("Introduce la primera cadena: ");
		cadena1 = sc.nextLine();
		System.out.print("Introduce la segunda cadena: ");
		cadena2 = sc.nextLine();
		sc.close();
		// Hasta que i sea igual que la longitud de la palabra más larga
		for(int i = 0; i < cadena1.length() || i < cadena2.length(); i++)
		{
			// Si no se ha llegado a la longitud máxima de la palabra
			//se muestra el carácter en la posición i
			if(i < cadena1.length())
			{
				System.out.print(cadena1.charAt(i));
			}
			// Si no se ha llegado a la longitud máxima de la palabra
			//se muestra el carácter en la posición i
			if(i < cadena2.length())
			{
				System.out.print(cadena2.charAt(i));
			}
		}
	}
}
