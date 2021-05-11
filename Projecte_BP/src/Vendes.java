import java.util.Scanner;

public class Vendes {

    public static void controlVendes() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Si us plau, quina opció vol triar? ");
        System.out.println("1. Codi de producte");
        System.out.println("2. Quantitat");
        System.out.println("3. Sortir");

        String aproducte = entrada.next();

        switch (aproducte) {

            case "1":
                System.out.println("Mu bien");
                break;
            case "2":

                break;
            case "3":


        }
    }
}



