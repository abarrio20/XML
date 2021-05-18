import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Benvinguts a la botiga online de Bon Preu ");
		int num = 0;
		do{
		do {
            System.out.println("Pantalla Principal");
            System.out.println("Quina opció vol triar?");
            System.out.println("1. Stock");
            System.out.println("2. Vendes");
            System.out.println("3. Sortir");
            num = entrada.nextInt();
        }

		while(num < 1 || num >3);
		if(num == 1) {
            Stock.controlstock();
        }

		else if(num ==2) {
            Vendes.controlVendes();
        }

         else if(num ==3) {
            System.out.println("Adeu");
            break;
        }

        }
		while (num != 3);
	}

}
