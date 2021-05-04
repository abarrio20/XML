import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Benvinguts a la botiga online de Bon Preu ");
        menuPrincipal(entrada);

    }

    private static void menuPrincipal(Scanner entrada) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Quina opció vol triar?");
            System.out.println("1. Stock");
            System.out.println("2. Vendes");
            System.out.println("3. Sortir");
            int opcio = entrada.nextInt();
            try {
                switch (opcio) {
                    case 1:
                        Stock.controlstock();
                        break;
                    case 2:
                        Vendes.controlVendes();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println(opcio + " no es vàlida la teva opció");

                        System.out.println("Si us plau, quina opció vol triar ? ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introdueix un numero");
                entrada.next();
                break;
            }
        }
    }
}