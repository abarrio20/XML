import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcio;

        System.out.println("Benvinguts a la botiga online de Bon Preu ");
        menuPrincipal(entrada);


    }

    private static void menuPrincipal(Scanner entrada) {
        String opcio;
        System.out.println("Si us plau, quina opció vol triar(stock/vendes/sortir)? ");
        opcio = entrada.next();
        switch(opcio){

            case "stock":
                Stock.controlstock();
                break;
            case  "vendes":
                Vendes.controlVendes();
                break;
            case "sortir":

                break;
        }
    }

}