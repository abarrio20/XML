import java.util.InputMismatchException;
import java.util.Scanner;


public class afegirProducte {
    public static void productes() {
        Scanner entrada = new Scanner(System.in);
        String[][] LlistaDeLaCompra = new String[10][4];
        int contadorLlistacompra =0;
        System.out.println("Quin producte voleu afegir ? ");
        menuProductes(entrada);
    }

    private static void menuProductes(Scanner entrada) {

        boolean salir = false;
        while (!salir) {

            System.out.println("Quins productes voleu triar ?");
            System.out.println("1. Llet 0.56");
            System.out.println("2. Melmelada 3.00");
            System.out.println("3. Pa 1.00");
            System.out.println("4. Xocolata 2.00");
            System.out.println("5. Galetes 1.50");
            System.out.println("6. Maduixes 2.00");
            System.out.println("7. Pizza 2.99");
            System.out.println("8. Iogurt 1.50");
            System.out.println("9. Brou de verdures/pollastre 1.75");
            System.out.println("10. Cervesa 0.50");

            try {
                int opcioP = entrada.nextInt();
                switch (opcioP) {

                        case 1:
                            contadorLlistacompra++;
                        break;

                        case 2:
                        break;

                        case 3:
                        break;

                        default:
                        System.out.println(opcioP + " no es vàlida la teva opció");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introdueix un numero");
                entrada.next();
                break;
            }
        }
    }

    public static String[][] omplirLlista (String[][] matriu, String[][] vector) {
        String[][] LlistaDeLaCompra = new String[10][4];

        for(int o=0; o<matriu.length;o++){

            for(int k=0; k<matriu[0].length;k++){

                matriu[o][k] = LlistaDeLaCompra[10][4];
            }

        }

        return LlistaDeLaCompra;

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
