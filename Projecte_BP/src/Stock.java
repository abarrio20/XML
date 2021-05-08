import java.util.Scanner;
import java.io.*;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class Stock {
    public static void controlstock() {


        DataInputStream in = new DataInputStream(System.in);
        int aproducte;
        String llegirP = ".\\IdeaProjects\\XML\\Projecte_BP\\src\\dadesStock.txt";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("dadesStock.txt");
            fr = new FileReader("dadesStock.txt");
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            Object dadesStock;

            Scanner entrada = new Scanner(new File("dadesStock.txt"));

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

