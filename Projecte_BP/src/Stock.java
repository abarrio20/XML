import java.util.Scanner;

public class Stock {
    public static void controlstock() {
        Scanner entrada = new Scanner(System.in);
        String aproducte;

        System.out.println("Si us plau, quina opció vol triar(afegir producte/consultar/sortir)? ");
        aproducte = entrada.next();

        switch(aproducte){

            case "afegir producte":
                System.out.println("Mu bien");;
                break;
            case  "consultar":

                break;
            case "sortir":

                break;


        }
    }
}

