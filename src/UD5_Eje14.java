import java.util.ArrayList;
import java.util.Scanner;

public class UD5_Eje14 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Huesca= new ArrayList<>();
        ArrayList<String> Teruel= new ArrayList<>();
        ArrayList<String> Zaragoza= new ArrayList<>();

        MostrarMenu();

        while (!sc.hasNextInt())
        {
            sc.nextLine();
            MostrarMenu();

        }
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            default:
                System.out.println("Opción inválida");



        }

    }

    public static void MostrarMenu(){
        System.out.println("MENU");
        System.out.println("---------");
        System.out.println("Ingrese una opcion (1-5)");
        System.out.println("1. Mostrar pueblos por provincia");
        System.out.println("2. Introducir pueblos por provincia");
        System.out.println("3. Mostrar todos los pueblos");
        System.out.println("4. Buscar pueblo ");
        System.out.println("5. Salir");
        System.out.print("Opcion: ");


    }
}
