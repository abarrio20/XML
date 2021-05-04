import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        System.out.println("Benvinguts a la botiga online de Bon Preu ");
        menuPrincipal(entrada);


    }

    private static void menuPrincipal(Scanner entrada) {

        System.out.println("Si us plau, quina opció vol triar ? ");
        System.out.println("1. Stock");
        System.out.println("2. Vendes");
        System.out.println("3. Sortir");
        String opcio = entrada.next();
        switch(opcio){

            case "1":
                Stock.controlstock();
                break;
            case  "2":
                Vendes.controlVendes();
                break;
            case "3":
                break;
        }
    }

}