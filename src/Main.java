import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<figura> figuras = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n*** seleccione la figura que desea crear ***");
            System.out.println("1. rectangulo");
            System.out.println("2. triangulo");
            System.out.println("3. circulo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\ingrese la base del triangulo:");

                    break;
                case 2:

                case 3:

                    break;
                case 4:

                    break;
                default:

            }
        } while (opcion != 4);

        scanner.close();




    }
}