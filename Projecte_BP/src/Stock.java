import java.util.Scanner;
import java.io.*;


public class Stock {
    public static void controlstock() {


        int aproducte;
        File archivo;
        FileReader fr = null;
        BufferedReader br;
        String [][] matriuLlistaCompra = new String[10][3];
        String carritocompra;
        //La lista de productos siempre será fija por lo tanto será de 3x10 SIEMPRE!!!!!


        try {

            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("Projecte_BP\\src\\dadesStock.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea = br.readLine();
            int contador = 0;
            while (!linea.equals("-1")) {

                System.out.println(linea);

                String [] columnas = linea.split("\\t");
                matriuLlistaCompra [contador]= columnas;


                //Nos guarda la lista de Stock en la matriz.
                linea = br.readLine();
                contador++;
            }
            Object dadesStock;

            Scanner entrada = new Scanner(System.in);


            System.out.println("Si us plau, quina opció vol triar? ");
            System.out.println("1. Afegir producte");
            System.out.println("2. Consultar");
            System.out.println("3. Sortir");

            aproducte = entrada.nextInt();

            switch (aproducte) {

                case 1:
                    break;
                case 2:
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
}

