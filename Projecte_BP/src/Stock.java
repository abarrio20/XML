import java.lang.reflect.Method;
import java.util.Scanner;
import java.io.*;


public class Stock {
	public static void controlstock() {


		int aproducte;
		File archivo;
		FileReader fr = null;
		BufferedReader br;
		String[][] matriuStock = new String[1000][3];

		int x = 0;


		//La lista de productos siempre será fija por lo tanto será de 3x10 SIEMPRE!!!!!


		try (Scanner entrada = new Scanner(System.in); Scanner entradafichero = new Scanner(new File("Projecte_BP\\src\\dadesStock.txt"))) {
			String linea;
			while (entradafichero.hasNextLine()) {
				linea = entradafichero.nextLine();
				añadirLineaDeStringsAlStock(matriuStock, linea, x);
				x++;

			}

			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).


			do {
				System.out.println("\nSi us plau, quina opció vol triar? ");
				System.out.println("1. Afegir producte");
				System.out.println("2. Consultar");
				System.out.println("3. Sortir");

				aproducte = entrada.nextInt();


				switch (aproducte) {

					case 1: //Afegir producte
						String[] vec = recogeDatosDelProducte(x);
						añadeAlArray(matriuStock, vec, x);
						añadeAlStock(vec);
						x++;

						// Lectura del fichero


                   /* while (!linea1.equals("-1")) {

                        System.out.println(linea1);
                        //Nos guarda la lista de Stock en la matriz.
                        String[] producte = linea1.split("\\t");
                        matriuStock1[contador] = producte;

                        //Preparat per la següent lectura
                        linea1 = br.readLine();
                        contador++;
                    }
                    */
					case 2: //Consultar matriu
						for (int i = 0; i < x; i++) {
							for (int n = 0; n < 3; n++) {
								System.out.print(matriuStock[i][n] + " ");
							}
							System.out.println("");
						}

						break;
					case 3:



				}
			}

			while (aproducte != 3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}


		}
	}

	private static void añadeAlStock(String[] vec) {
		try (PrintWriter pw = new PrintWriter(new FileWriter("Projecte_BP\\src\\dadesStock.txt", true))) {
			pw.print(vec[0] + "\t" + vec[1] + "\t" + vec[2]);
			pw.print("\n");
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	private static void añadeAlArray(String[][] matriuStock, String[] vec, int x) {
		matriuStock[x][0] = vec[0];
		matriuStock[x][1] = vec[1];
		matriuStock[x][2] = vec[2];

	}

	private static String[] recogeDatosDelProducte(int x) {
		Scanner entrada1 = new Scanner(System.in);
		int ID = x + 1;
		String[] vec = new String[3];
		System.out.println("El ID será: " + ID);
		vec[0] = "" + ID;
		System.out.println("Dime el nombre del producto");
		vec[1] = entrada1.next();
		System.out.println("Dime el precio");
		vec[2] = entrada1.next();

		return vec;

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


	public static void mostrarLlista(String[][] taula) {
		String[][] LlistaDeLaCompra = new String[10][4];

		for (int n = 0; n < taula.length; n++) {
			for (int m = 0; m < taula[n].length; m++) {
				System.out.print(taula[n][m]);
			}
			System.out.println("");
		}
	}


}


