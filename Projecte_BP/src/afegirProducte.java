import java.util.InputMismatchException;
import java.util.Scanner;


public class afegirProducte {
    public static void productes() {
        Scanner entrada = new Scanner(System.in);
        String[][] LlistaDeLaCompra = new String[10][4];
        int contadorLlistacompra = 0;

        menuProductes(entrada);
    }

    private static void menuProductes(Scanner entrada) {

        boolean salir = false;
        while (!salir) {



            try {
                int opcioP = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Introdueix un numero");
                entrada.next();
                break;
            }
        }
    }

    public static String[][] omplirLlista(String[][] matriu, String[][] vector) {
        String[][] LlistaDeLaCompra = new String[10][4];
        Scanner entrada = new Scanner("dadesStock");
        for (int o = 0; o < matriu.length; o++) {

            for (int k = 0; k < matriu[0].length; k++) {

                matriu[o][k] = LlistaDeLaCompra[100][4];
            }

        }

        return LlistaDeLaCompra;

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
