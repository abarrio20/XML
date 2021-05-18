import java.io.*;
import java.util.Scanner;

public class Vendes {

	public static void controlVendes() {



		int[][] prod = new int[100][2];
		int contador = 0;


		Scanner entrada = new Scanner(System.in);

		System.out.println("Si us plau, quina opció vol triar? ");
		System.out.println("1. Afegir ID i quantitat");//Rellenar array 2 columna
		System.out.println("2. Generar tiquet");
		System.out.println("3. Sortir");

		int aproducte = entrada.nextInt();



		switch (aproducte) {

			case 1:


				int id;
				System.out.println("Para salir introduce -1");
				do {
					System.out.println("Dime la ID del producto");
					id = entrada.nextInt();
					if (id == -1) {
						break;
					}
					System.out.println("Dime la cuantidad del producto");
					int cantidad = entrada.nextInt();
					rellenaArrayProductos(prod, contador, id, cantidad);
					contador++;
				}
				while (id == -1);

				break;
			case 2:
				String [] vec= new String[3];
				int idProd;
				String nom;
				double preuUnitat;
				int quantitat;
				double preuTotal;
				double sumaPreusTotals=0;
				for (int n=0; n<contador; n++){
					idProd=prod[n][0];
					quantitat=prod[n][1];
					vec=buscaId(idProd);
					nom=vec[1];
					preuUnitat=Double.parseDouble(vec[2]);
					preuTotal= preuUnitat*quantitat;
					sumaPreusTotals += preuTotal;
					System.out.println(nom + " " + preuUnitat + " " + quantitat + " " + preuTotal);

				}
				System.out.println("                                                    Suma:" + sumaPreusTotals);
				break;
			case 3:
				break;
		}

	}
	public static String[] buscaId(int id){
		int x = 0;
		String[][] matriuStock = new String[1000][3];
		File archivo;
		FileReader fr = null;
		BufferedReader br;
		try (Scanner entradafichero = new Scanner(new File("Projecte_BP\\src\\dadesStock.txt"))) {
			String linea;
			while (entradafichero.hasNextLine()) {
				linea = entradafichero.nextLine();
				añadirLineaDeStringsAlStock(matriuStock, linea, x);
				x++;

			}

		} catch (Exception e) {
			System.out.println("Error");
		}
		String [] vector={"Null", "Null", "Null"};
		for(int i=0; i<matriuStock.length;i++){
			int idProducte=Integer.parseInt(matriuStock[i][0]);
			if(id==idProducte){
				return matriuStock[i];
			}
		}
		return vector;
	}
	public static void rellenaArrayProductos(int[][] prod, int contador, int id, int cantidad) {
		prod[contador][0] = id;
		prod[contador][1] = cantidad;

	}

	private static void añadirLineaDeStringsAlStock(String[][] matriuStock, String linea, int x) {
		String ID;
		String nombreP;
		String precio;

		Scanner lineaP = new Scanner(linea);
		ID = lineaP.next();
		nombreP = lineaP.next();
		precio = lineaP.next();
		matriuStock[x][0] = ID;
		matriuStock[x][1] = nombreP;
		matriuStock[x][2] = precio;
	}
}







