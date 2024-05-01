import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----------------------------)");
            System.out.println("1)");
            System.out.println("2)");
            System.out.println("3)");
            System.out.println("4)");
            System.out.println("5)");
            System.out.println("6)");
            System.out.println("7) Salir)");
            System.out.print("Elija opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.println("Elija opción: ");

            }else if (opcion == 2) {
                System.out.println("Elija opción: ");

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {

            }else{
                System.out.println("Opción incorrecta, vuelva a intentar...");
            }

        }while(opcion != 7);
        scanner.close();
    }
}