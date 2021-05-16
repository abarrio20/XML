import java.util.Scanner;
import java.io.*;


public class Stock {
    public static void controlstock() {

        int contador=0;
        int aproducte;
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        String[][] matriuStock = new String[1000][3];
        String[][] matriuStock1 = new String[1000][3];

        String carritocompra;
        //La lista de productos siempre será fija por lo tanto será de 3x10 SIEMPRE!!!!!


        try {

            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).

            Object dadesStock;

            Scanner entrada = new Scanner(System.in);


            System.out.println("\nSi us plau, quina opció vol triar? ");
            System.out.println("1. Afegir producte");
            System.out.println("2. Consultar");
            System.out.println("3. Sortir");

            aproducte = entrada.nextInt();

            switch (aproducte) {

                case 1: //Afegir producte
                    archivo = new File("Projecte_BP\\src\\dadesStock.txt");
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    // Lectura del fichero
                    String linea1 = br.readLine();

                    while (!linea1.equals("-1")) {

                        System.out.println(linea1);
                        //Nos guarda la lista de Stock en la matriz.
                        String[] producte = linea1.split("\\t");
                        matriuStock1[contador] = producte;
                        for (int x=11; x < matriuStock1.length; x++) {
                            for (int y=0; y < matriuStock1[x].length; y++) {
                                System.out.println("Introdueix l'element [" + x + "," + y + "]");
                                matriuStock1[x][y] = entrada.next();
                                contador++;

                            }
                        }

                        //Preparat per la següent lectura
                        linea1 = br.readLine();
                        contador++;
                    }

                case 2: //Consultar matriu
                    archivo = new File("Projecte_BP\\src\\dadesStock.txt");
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    // Lectura del fichero
                    String linea = br.readLine();

                    while (!linea.equals("-1")) {

                        System.out.println(linea);
                        //Nos guarda la lista de Stock en la matriz.
                        String[] producte = linea.split("\\t");
                        matriuStock[contador] = producte;

                       //Preparat per la següent lectura
                        linea = br.readLine();
                        contador++;
                    }
                    break;
                case 3:


            }
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



    public static void mostrarLlista (String[][] taula) {
        String[][] LlistaDeLaCompra = new String[10][4];

        for (int n = 0; n < taula.length; n++) {
            for (int m = 0; m < taula[n].length; m++) {
                System.out.print(taula[n][m]);
            }
            System.out.println("");
        }
    }
}


