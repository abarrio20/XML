import java.io.*;
import java.util.Scanner;

public class Vendes {

	public static void controlVendes() {
		String[][] matriuStock = new String[1000][3];

		File archivo;
		FileReader fr = null;
		BufferedReader br;


		int x = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Si us plau, quina opció vol triar? ");
		System.out.println("1. Afegir ID i quantitat");
		System.out.println("2. Generar tiquet");
		System.out.println("3. Sortir");

		int aproducte = entrada.nextInt();


		switch (aproducte) {

			case 1:

				break;
			case 2:

				break;
			case 3:
				break;
		}
	}
}






